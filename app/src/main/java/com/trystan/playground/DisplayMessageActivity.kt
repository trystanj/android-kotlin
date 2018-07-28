package com.trystan.playground

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import java.util.concurrent.TimeUnit

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // get the Intent that started this activity, and pull off it's extra (context) value by name
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        // apply the Extra message to the text property of the TextView we created
        // apply binds the function block to the thing it's "applied" to - and returns that thing
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }

        // kotlin has coroutines!
        // we have to launch them in the UI context so that the main UI thread doesn't block and crash
        launch(UI) {
            delay(1, TimeUnit.SECONDS)
            textView.text = getString(R.string.couroutine_replacement)
        }
    }
}
