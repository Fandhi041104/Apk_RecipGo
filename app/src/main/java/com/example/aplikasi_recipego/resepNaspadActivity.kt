package com.example.aplikasi_recipego

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class resepNaspadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resepnaspad)

        val btnBack: ImageView = findViewById(R.id.imageView22)

        btnBack.setOnClickListener {
            val intent = Intent(this, descNaspadActivity::class.java)
            startActivity(intent)
        }
    }
}