package com.example.aplikasi_recipego

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class resepGarlicbrdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resepgarlicbrd)

        val btnBack: ImageView = findViewById(R.id.imageView34)

        btnBack.setOnClickListener {
            val intent = Intent(this, pencarianBahanActivity::class.java)
            startActivity(intent)
        }
    }
}