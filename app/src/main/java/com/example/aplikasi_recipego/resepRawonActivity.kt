package com.example.aplikasi_recipego

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class resepRawonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reseprawon)

        val btnBack: ImageView = findViewById(R.id.imageView15)

        btnBack.setOnClickListener {
            val intent = Intent(this, descRawonActivity::class.java)
            startActivity(intent)
        }
    }
}