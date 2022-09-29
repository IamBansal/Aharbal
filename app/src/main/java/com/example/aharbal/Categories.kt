package com.example.aharbal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatButton

class Categories : AppCompatActivity() {

    private lateinit var continueBtn : AppCompatButton
    private lateinit var back : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)

            continueBtn = findViewById(R.id.btnContinue)
            back = findViewById(R.id.ivBackCategories)

            continueBtn.setOnClickListener {
                startActivity(Intent(this, MainActivity::class.java))
            }

            back.setOnClickListener {
                onBackPressed()
            }

        }
}