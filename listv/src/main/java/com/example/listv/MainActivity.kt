package com.example.listv

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var names = arrayOf(
        "Иван", "Марья", "Петр", "Антон", "Даша", "Борис",
        "Костя", "Игорь", "Анна", "Денис", "Андрей"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lv = findViewById<ListView>(R.id.lvMain)
        val adapter = ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, names)
        lv.adapter = adapter;
    }
}
