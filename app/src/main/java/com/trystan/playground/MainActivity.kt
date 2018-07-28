package com.trystan.playground

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

// this is global so we can access it from another activity
// it's just a key so that we can pass data between activities via Intents - that data is called "extras"
// pretty much the same idea as Go Context.Value
const val EXTRA_MESSAGE = "com.trystan.playground.MESSAGE"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View) {
        val inputText = findViewById<EditText>(R.id.editText)
        val message = inputText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }

        // TODO: come back and make this a Navigation Component: https://developer.android.com/topic/libraries/architecture/navigation/
        startActivity(intent)
    }
}
