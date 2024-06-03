package com.example.aplikasi_recipego

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class resepBaksoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resepbakso)

        val btnBack: ImageView = findViewById(R.id.imageView24)

        btnBack.setOnClickListener {
            val intent = Intent(this, descBaksoActivity::class.java)
            startActivity(intent)
        }
    }
}