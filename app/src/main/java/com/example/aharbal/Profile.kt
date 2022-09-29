package com.example.aharbal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatButton

class Profile : AppCompatActivity() {

    private lateinit var continueBtn : AppCompatButton
    private lateinit var back : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        continueBtn = findViewById(R.id.btnSaveNewDetails)
        back = findViewById(R.id.ivBackEdit)

        continueBtn.setOnClickListener {
            startActivity(Intent(this, Categories::class.java))
        }

        back.setOnClickListener {
            onBackPressed()
        }


    }
}