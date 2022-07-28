package com.example.appone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao: Button = findViewById(R.id.botao)
        botao.setOnClickListener {
            Toast.makeText(this, "CLICOU!!!", Toast.LENGTH_LONG).show()
        }

    }

}