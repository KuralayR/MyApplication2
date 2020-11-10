package com.example.listv

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView
import java.util.ArrayList


class StateAdapter(context: Context?, resource: Int, states: ArrayList<Example>) : ArrayAdapter<Example>(context!!, resource, states) {
    private val inflater: LayoutInflater
    private val layout: Int
    private val states: ArrayList<Example>
    var listener: clickListener? = null

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = inflater.inflate(layout, parent, false)
        val nameView = view.findViewById<View>(R.id.name) as TextView
        val button = view.findViewById<Button>(R.id.button2)
        val state = states.get(position)
        nameView.setText(state.name)
        button.setOnClickListener{
            listener?.click(position)
        }
        return view
    }


    init {
        this.states = states
        layout = resource
        inflater = LayoutInflater.from(context)
    }
    interface clickListener{
        fun click(position: Int)
    }

}