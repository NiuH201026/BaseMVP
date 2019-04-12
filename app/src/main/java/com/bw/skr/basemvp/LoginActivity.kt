package com.bw.skr.basemvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val intent = intent
        val name = intent.getStringExtra("name")
        val age = intent.getStringExtra("age")
        Toast.makeText(this,name+age,Toast.LENGTH_SHORT).show()
    }
}
