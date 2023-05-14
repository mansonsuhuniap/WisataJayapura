package com.example.wisata_jayapura

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*

class Register_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnRegister.setOnClickListener {
            val intent = Intent ( this, Login_Activity::class.java)
            startActivity(intent)
        }
        btnLogin2.setOnClickListener {
            val intent = Intent( this, Login_Activity::class.java)
            startActivity(intent)
        }
    }
}