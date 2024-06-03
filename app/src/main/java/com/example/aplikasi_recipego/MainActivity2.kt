package com.example.aplikasi_recipego

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.cardview.widget.CardView


class MainActivity2 : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)


        val btnProfile: ImageView = findViewById(R.id.imageView7)
        val btnEksplor: ImageView = findViewById(R.id.imageView6)
        val btnPecel: CardView = findViewById(R.id.button10)
        val btnBakso: CardView = findViewById(R.id.button11)
        val btnNaspad: CardView = findViewById(R.id.button12)
        val btnrawon: CardView = findViewById(R.id.button13)


        btnProfile.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
        btnEksplor.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }
        btnPecel.setOnClickListener {
            val intent = Intent(this, descPecelActivity::class.java)
            startActivity(intent)
        }
        btnBakso.setOnClickListener {
            val intent = Intent(this, descBaksoActivity::class.java)
            startActivity(intent)
        }
        btnNaspad.setOnClickListener {
            val intent = Intent(this, descNaspadActivity::class.java)
            startActivity(intent)
        }
        btnrawon.setOnClickListener {
            val intent = Intent(this, descRawonActivity::class.java)
            startActivity(intent)
        }
    }
}