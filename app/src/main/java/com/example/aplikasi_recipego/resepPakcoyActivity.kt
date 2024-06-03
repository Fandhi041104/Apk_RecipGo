package com.example.aplikasi_recipego

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class resepPakcoyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reseppakcoy)

        val btnBack: ImageView = findViewById(R.id.imageView33)

        btnBack.setOnClickListener {
            val intent = Intent(this, pencarianBahanActivity::class.java)
            startActivity(intent)
        }
    }
}