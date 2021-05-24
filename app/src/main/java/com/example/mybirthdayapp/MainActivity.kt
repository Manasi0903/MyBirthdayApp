package com.example.mybirthdayapp

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.view.View
import android.widget.Toast
import android.media.MediaPlayer
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayButton(view: View) {

       val mp = MediaPlayer.create(this, R.raw.song)
       mp.start()

        val editText = findViewById<EditText>(R.id.nameInput)
        val name=editText.text
        val message = editText.text.toString()
        val intent = Intent(this, BirthdayGreetingActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)

        Toast.makeText(this,"My Name Is $name", Toast.LENGTH_LONG).show()
    }
}
