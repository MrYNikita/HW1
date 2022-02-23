package com.example.hw1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    // save;
    // save;
    // save;

    private lateinit var inputText: TextInputEditText;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun transmitText(view: View) {

        inputText = findViewById(R.id.inputTextEdit);

        val intentText = Intent(this,MainActivity2::class.java);

        intentText.putExtra(MainActivity2.strokeTransmit, findViewById<EditText>(R.id.inputTextEdit).text.toString());

        startActivity(intentText);
    }
}