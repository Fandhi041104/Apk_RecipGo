package com.example.aplikasi_recipego

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.eksplor_activity)

        val btnHome: ImageView = findViewById(R.id.imageView25)
        val btnProfile: ImageView = findViewById(R.id.imageView27)
        val btnCari: ImageView = findViewById(R.id.imageView28)

        btnHome.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
            btnProfile.setOnClickListener {
                val intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)
        }
        btnCari.setOnClickListener {
            val intent = Intent(this, pencarianBahanActivity::class.java)
            startActivity(intent)
        }
    }
}