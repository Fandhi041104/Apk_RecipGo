package com.example.aplikasi_recipego

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.aplikasi_recipego.databinding.ActivityMainBinding

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_activity)

        val btnPengaturan: TextView = findViewById(R.id.textView27)
        val btnHome: ImageView = findViewById(R.id.imageView31)
        val btnEksplor: ImageView = findViewById(R.id.imageView29)
        val btnLogout: TextView = findViewById(R.id.textView28)

        btnPengaturan.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
        btnHome.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

        }
        btnEksplor.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)

        }
        btnLogout.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}