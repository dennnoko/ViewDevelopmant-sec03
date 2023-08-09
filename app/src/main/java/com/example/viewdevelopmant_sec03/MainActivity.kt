package com.example.viewdevelopmant_sec03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //If clicked btn ,display message
        val btnSend = findViewById<Button>(R.id.btnSend)
        val txtName = findViewById<EditText>(R.id.txtName)
        val txtResult = findViewById<TextView>(R.id.txtResult)
        btnSend.setOnClickListener {
            txtResult.text = "Hello,${txtName.text}!"
        }
    }
}