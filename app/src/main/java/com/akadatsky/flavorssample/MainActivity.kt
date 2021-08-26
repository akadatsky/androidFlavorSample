package com.akadatsky.flavorssample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.freeButton).setOnClickListener {
            Toast.makeText(this, "free feature", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.paidButton)?.setOnClickListener {
            Toast.makeText(this, "free feature", Toast.LENGTH_SHORT).show()
        }


    }
}