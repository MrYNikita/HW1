package com.example.hw1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    // save;

    companion object {
        const val strokeTransmit = "...";
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        showTransmitText();
    }

    @SuppressLint("SetTextI18n")
    fun showTransmitText() {

        val strokeRes = intent.getStringExtra(strokeTransmit);

        System.out.println(strokeTransmit);

        findViewById<TextView>(R.id.textView).text = "Данные переданы мною!$strokeRes";

    }
}