package com.southwickio.celestiallunch

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch

class MainActivity : AppCompatActivity() {

    @SuppressLint("UseSwitchCompatOrMaterialCode")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clearButton = findViewById<Button>(R.id.clearButton)
        clearButton.setOnClickListener {
            // Clear the data
        }
        val exitButton = findViewById<Button>(R.id.exitButton)
        exitButton.setOnClickListener {
            finish()
        }

        val toggle = findViewById<Switch>(R.id.monitorToggle)
        toggle.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Enable the automatic clearing of data
            } else {
                // Disable the automatic clearing of data
            }
        }
    }
}