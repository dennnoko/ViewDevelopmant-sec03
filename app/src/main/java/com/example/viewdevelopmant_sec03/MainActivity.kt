package com.example.viewdevelopmant_sec03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get RadioGroup
        val rg = findViewById<RadioGroup>(R.id.rgroup)
        //eventListener
        rg.setOnCheckedChangeListener { group, checkedID ->
            val radio = group.findViewById<RadioButton>(checkedID)
            Toast.makeText(
                this@MainActivity,
                String.format("[%s]が選択されました。", radio.text),
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}