package com.example.listv

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var edit: EditText
    lateinit var listView: ListView
    val item = arrayListOf<Example>()
    lateinit var stateAdapter: StateAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val context =this
        val edit = findViewById<EditText>(R.id.editTextTextPersonName)
        val listView= findViewById<ListView>(R.id.lvMain)
        val button = findViewById<Button>(R.id.button)
        val buttonRead = findViewById<Button>(R.id.button4)
        val stateAdapter = StateAdapter(this, R.layout.item, item)
        listView.adapter = stateAdapter;

        button.setOnClickListener{
            val string = edit.text.toString()
            var ex = Example(string)
            item.add(ex)
            if (edit.text.length != 0){
                var user = Example(edit.text.toString())
                var db = DataBaseHandler(context)
                db.insertData(user)
            } else {
                Toast.makeText(context, "Please fill the data", Toast.LENGTH_SHORT).show()
            }
            stateAdapter.notifyDataSetChanged()
        }

        stateAdapter.listener = object : StateAdapter.clickListener{
            override fun click(position: Int) {
                item.removeAt(position)
                stateAdapter.notifyDataSetChanged()
            }
        }

        stateAdapter.notifyDataSetChanged()

//        buttonRead.setOnClickListener{
//            var db = DataBaseHandler(context)
//            var data = db.getData()
//            for (i in 0 ..data.size){
//                stateAdapter.append(data.get(i).id.toString() + " " + data.get(i).name + "\n")
//            }
//        }


     }






    }








