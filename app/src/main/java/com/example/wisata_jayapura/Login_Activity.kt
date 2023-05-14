package com.example.wisata_jayapura

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class Login_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        TextRegister.setOnClickListener {
            val intent = Intent ( this, Register_Activity::class.java)
            startActivity(intent)
        }
        btnLogin.setOnClickListener {
            val intent = Intent ( this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}