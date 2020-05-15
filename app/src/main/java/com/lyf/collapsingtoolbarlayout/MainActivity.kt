package com.lyf.collapsingtoolbarlayout

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolBar)

        btn_activity1.setOnClickListener {
            startActivity(Intent(this, CollapsingToolbarActivity1::class.java))
        }

        btn_activity2.setOnClickListener {
            startActivity(Intent(this, CollapsingToolbarActivity2::class.java))
        }
    }
}
