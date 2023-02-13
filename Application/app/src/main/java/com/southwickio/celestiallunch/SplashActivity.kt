package com.southwickio.celestiallunch

import android.content.Intent
import android.widget.Button
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val continueButton = findViewById<Button>(R.id.continueButton)
        continueButton.setOnClickListener {
            val intent = Intent(this, SplashActivity::class.java)
            startActivity(intent)
        }

        Handler().postDelayed({
            val intent = Intent(this, SplashActivity::class.java)
            startActivity(intent)
        }, 10000)
    }
}