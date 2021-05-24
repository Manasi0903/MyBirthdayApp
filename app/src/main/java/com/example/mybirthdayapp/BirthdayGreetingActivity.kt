package com.example.mybirthdayapp

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView


class BirthdayGreetingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
        //val name=intent.getStringExtra(NAME_EXTRA)
        // val editText = findViewById<TextView>(R.id.birthday)
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        val textView = findViewById<TextView>(R.id.birthday).apply {
            text = "Happy Birthday\n $message!"
        }
    }
}