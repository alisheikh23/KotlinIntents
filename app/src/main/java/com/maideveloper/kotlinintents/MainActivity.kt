package com.maideveloper.kotlinintents

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun IntentActivity(view: View){
        val intent= Intent(applicationContext,Main2Activity::class.java)
        val name=editText.text.toString()
        intent.putExtra("input",name)
        startActivity(intent)
    }
}
