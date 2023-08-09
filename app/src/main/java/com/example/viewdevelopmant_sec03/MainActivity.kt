package com.example.viewdevelopmant_sec03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get checkBox
        val chk = findViewById<CheckBox>(R.id.chk)
        //イベントリスナーを登録
        chk.setOnCheckedChangeListener { buttonView, isChecked ->
            Toast.makeText(
                this@MainActivity,
                if(isChecked) {
                    "E-mail notification ON"
                } else {
                    "E-mail notification OFF"
                },
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}