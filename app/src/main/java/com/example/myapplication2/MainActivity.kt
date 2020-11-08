package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list = findViewById<ListView>(R.id.lvMain)
        var item = findViewById<EditText>(R.id.editText)

//        var newItem = ArrayList<>();

    }


}
//// Создаём пустой массив для хранения имен котов
//final ArrayList<String> catNames = new ArrayList<>();
//
//// Создаём адаптер ArrayAdapter, чтобы привязать массив к ListView
//final ArrayAdapter<String> adapter;
//adapter = new ArrayAdapter<>(this,
//android.R.layout.simple_list_item_1, catNames);
//// Привяжем массив через адаптер к ListView
//listView.setAdapter(adapter);