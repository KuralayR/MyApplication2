package com.example.listv

import android.os.Bundle
import android.widget.*
import android.widget.AdapterView.OnItemClickListener
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var edit: EditText
    lateinit var listView: ListView
    val item = arrayListOf<Example>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edit = findViewById<EditText>(R.id.editTextTextPersonName)
        val listView= findViewById<ListView>(R.id.lvMain)
        val button = findViewById<Button>(R.id.button)
        val stateAdapter = StateAdapter(this, R.layout.item, item)
        listView.adapter = stateAdapter;
        button.setOnClickListener{
            val string = edit.text.toString()
            var ex = Example(string)
            item.add(ex)
            stateAdapter.notifyDataSetChanged()
        }

        stateAdapter.listener = object : StateAdapter.clickListener{
            override fun click(position: Int) {
                item.removeAt(position)
                stateAdapter.notifyDataSetChanged()
            }
        }

        stateAdapter.notifyDataSetChanged()
        }
    }
