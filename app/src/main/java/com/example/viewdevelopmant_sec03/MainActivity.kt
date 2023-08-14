package com.example.viewdevelopmant_sec03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get spinner
        val spn = findViewById<Spinner>(R.id.spinner1)

        //Registering event listeners
        spn.setOnItemSelectedListener(
            object : AdapterView.OnItemSelectedListener {
                //項目が選択された場合の処理
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    //選択項目を取得し、その値をトースト表示
                    Toast.makeText(
                        this@MainActivity,
                        "選択項目：${(parent as Spinner).selectedItem}",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                //項目が選択されなかった場合の処理
                override fun onNothingSelected(parent: AdapterView<*>?) {}
            }
        )
    }
}