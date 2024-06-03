package com.example.aplikasi_recipego

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class descRawonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rawon_activity)

        val btnLihatResep: Button = findViewById(R.id.button)
        val btnBack: ImageView = findViewById(R.id.imageView13)

        btnLihatResep.setOnClickListener {
            val intent = Intent(this, resepPecelActivity::class.java)
            startActivity(intent)
        }
        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}