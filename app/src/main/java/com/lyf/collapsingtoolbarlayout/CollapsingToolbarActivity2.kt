package com.lyf.collapsingtoolbarlayout

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_collapsing_toolbar2.*

class CollapsingToolbarActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collapsing_toolbar2)

        setSupportActionBar(toolBar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
}
