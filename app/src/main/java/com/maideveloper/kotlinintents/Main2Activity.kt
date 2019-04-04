package com.maideveloper.kotlinintents

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intent=intent.getStringExtra("input")
        textView1.text="Hello $intent"
    }
    fun backActivity(view:View){
        val backIntent= Intent(applicationContext,MainActivity::class.java)
        startActivity(backIntent)
    }
}
