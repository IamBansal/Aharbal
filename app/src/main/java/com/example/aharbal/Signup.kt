package com.example.aharbal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Signup : AppCompatActivity() {

    private lateinit var signIn : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        signIn = findViewById(R.id.tvAlreadyUser)

        signIn.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
        }


    }
}