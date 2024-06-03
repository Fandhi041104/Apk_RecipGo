package com.example.aplikasi_recipego

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class resepPecelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.reseppecel_activity)

        val btnBack: ImageView = findViewById(R.id.imageView14)

        btnBack.setOnClickListener {
            val intent = Intent(this, descPecelActivity::class.java)
            startActivity(intent)
        }
    }
}