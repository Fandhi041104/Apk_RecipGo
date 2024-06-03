package com.example.aplikasi_recipego

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class pencarianBahanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eksplorcari)

        val btnNasgor: Button = findViewById(R.id.button3)
        val btnPakcoy: Button = findViewById(R.id.button4)
        val btnGarlic: Button = findViewById(R.id.button5)
        val btnBack: ImageView = findViewById(R.id.imageView19)

        btnNasgor.setOnClickListener {
            val intent = Intent(this, resepNasgorActivity::class.java)
            startActivity(intent)
        }
        btnPakcoy.setOnClickListener {
            val intent = Intent(this, resepPakcoyActivity::class.java)
            startActivity(intent)
        }
        btnGarlic.setOnClickListener {
            val intent = Intent(this, resepGarlicbrdActivity::class.java)
            startActivity(intent)
        }
        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }
    }
}