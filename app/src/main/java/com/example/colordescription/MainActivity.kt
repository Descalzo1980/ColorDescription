package com.example.colordescription

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinnerColor)
        val myColor = resources.getStringArray(R.array.color)
        val description = findViewById<TextView>(R.id.tv_show_description)
        val myDescription = resources.getStringArray(R.array.description)

        spinner.adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,myColor)

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                description.text = myDescription[p2]
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                description.text = ""
            }
        }
    }
}