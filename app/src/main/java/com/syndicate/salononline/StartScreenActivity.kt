package com.syndicate.salononline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StartScreenActivity : AppCompatActivity() {

    private lateinit var btn_get_started: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_screen)

        btn_get_started = findViewById(R.id.btn_get_started)

        btn_get_started.setOnClickListener {
            intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

    }
}