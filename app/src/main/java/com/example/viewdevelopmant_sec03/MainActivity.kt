package com.example.viewdevelopmant_sec03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createSpinner()
    }

    //Spinnerに項目リストを登録するメソッド
    private fun createSpinner() {
        val list = mutableListOf<String>()
        val format = SimpleDateFormat("yyyy/MM/dd", Locale.JAPAN)
        val cal = Calendar.getInstance()
        //明日～10日後のリストを作成
        for(i in 1 .. 10) {
            cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH) + 1)
            list.add(format.format(cal.time))
        }

        //配列をウィジェットに渡す準備
        val spn = findViewById<Spinner>(R.id.spinner1)
        //アダプター経由でSpinnerにリストを登録
        spn.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item, list
        )

        //Spinner選択時の処理を定義
        spn.setOnItemSelectedListener (
            object: AdapterView.OnItemSelectedListener{
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    Toast.makeText(
                        this@MainActivity,
                        "選択時：${(parent as Spinner).selectedItem}",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {}
            }
        )
    }
}