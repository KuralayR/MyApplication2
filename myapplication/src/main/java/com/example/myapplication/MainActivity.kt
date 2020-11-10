package com.example.myapplication

import android.R
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    val ATTRIBUTE_NAME_TEXT = "text"
    val ATTRIBUTE_NAME_CHECKED = "checked"
    val ATTRIBUTE_NAME_IMAGE = "image"
    lateinit var lvSimple: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texts = arrayOf(
            "sometext 1", "sometext 2", "sometext 3",
            "sometext 4", "sometext 5"
        )
        val checked = booleanArrayOf(true, false, false, true, false)
        val img: Int = R.drawable.ic_launcher_background

    }
}