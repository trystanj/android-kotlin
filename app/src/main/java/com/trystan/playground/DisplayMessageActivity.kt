package com.trystan.playground

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // get the Intent that started this activity, and pull off it's extra (context) value by name
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        findViewById<TextView>(R.id.textView).apply {
            text = message
        }

        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }
    }
}
