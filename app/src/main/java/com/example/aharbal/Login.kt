package com.example.aharbal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Login : AppCompatActivity() {

    private lateinit var signIn : Button
    private lateinit var signUp : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        signIn = findViewById(R.id.btnSignIn)
        signUp = findViewById(R.id.tvNewUser)

        signIn.setOnClickListener {
            startActivity(Intent(this, Profile::class.java))
        }

        signUp.setOnClickListener {
            startActivity(Intent(this, Signup::class.java))
        }

    }
}