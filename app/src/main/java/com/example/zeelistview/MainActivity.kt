package com.example.zeelistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var countries = arrayOf("India", "England", "Australia", "USA", "Nepal","India", "England", "Australia", "USA", "Nepal","India", "England", "Australia", "USA", "Nepal")
        var mylist = findViewById<ListView>(R.id.mylist)

        /*var arrayAdapter : ArrayAdapter<String> =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, countries)*/

        var arrayAdapter : ArrayAdapter<String> =
            ArrayAdapter(this, R.layout.item_layout, R.id.textViewItem, countries)

        mylist.adapter = arrayAdapter

        mylist.setOnItemClickListener { adapterView, view, position, id ->
        var item = adapterView.getItemAtPosition(position).toString()

            Toast.makeText(this, "yu selected $item at postion $position and its id is $id",Toast.LENGTH_SHORT).show()


        }


    }
}