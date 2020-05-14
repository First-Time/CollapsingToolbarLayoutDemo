package com.lyf.collapsingtoolbarlayout.behaior

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.coordinatorlayout.widget.CoordinatorLayout

class TranslucentBehavior(val context: Context, val attrs: AttributeSet) :
    CoordinatorLayout.Behavior<Toolbar>() {

    private var mToolbarHeight = 0

    override fun layoutDependsOn(
        parent: CoordinatorLayout,
        child: Toolbar,
        dependency: View
    ): Boolean {
        return dependency is TextView
    }

    override fun onDependentViewChanged(
        parent: CoordinatorLayout,
        child: Toolbar,
        dependency: View
    ): Boolean {
        //初始化高度
        if (mToolbarHeight == 0) {
            mToolbarHeight = child.bottom * 2 //为了更慢的效果
        }

        //计算toolbar从开始移动到最后的百分比
        var percent = dependency.y / mToolbarHeight

        //百分比大于1，直接赋值为1
        if (percent > 1) {
            percent = 1f
        }

        //计算alpha通道值
        val alpha = percent * 255

        //设置背景颜色
        child.setBackgroundColor(Color.argb(alpha.toInt(), 63, 81, 181))

        return true
    }
}