package com.example.myapplication2

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var edit: EditText
    lateinit var listView: ListView
    val item = arrayListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val edit = findViewById<EditText>(R.id.editTextTextPersonName)
//        val listView= findViewById<ListView>(R.id.lvMain)
//        val button = findViewById<Button>(R.id.button)
//        val adapter = ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, item)
//        listView.adapter = adapter;
//        adapter.notifyDataSetChanged()
//        button.setOnClickListener{
//            val string = edit.text.toString()
//            item.add(string)
//            adapter.notifyDataSetChanged()

        }

    }



    }

//    override fun onClick(v: View?) {
//        val string = edit.text.toString()
//        item.add(string)
//
//    }
//}