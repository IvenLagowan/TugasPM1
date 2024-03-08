package com.rival.tutorialloginregist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        intentBottonRegist()
    }

    private fun intentBottonRegist() {
        register_btn.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}