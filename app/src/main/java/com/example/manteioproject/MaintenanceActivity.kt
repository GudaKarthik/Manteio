package com.example.manteioproject

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MaintenanceActivity : AppCompatActivity() {

    lateinit var monthSpinner : Spinner
    lateinit var yearSpinner : Spinner

    var month = arrayListOf("Month")
    var year = arrayListOf("Year")

    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maintenance)
        /*window.decorView.windowInsetsController!!.hide(
            android.view.WindowInsets.Type.statusBars())*/
        monthSpinner = findViewById(R.id.monthSpinner)
        yearSpinner = findViewById(R.id.yearSpinner)

        if (monthSpinner != null){
            var adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,month)
            monthSpinner.adapter = adapter
            monthSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                    (p0!!.getChildAt(0) as TextView).setTextColor(Color.GRAY)
                    (p0!!.getChildAt(0) as TextView).textSize = 13f
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {

                }
            }
        }

        if (yearSpinner != null){
            var adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,year)
            yearSpinner.adapter = adapter
            yearSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                    (p0!!.getChildAt(0) as TextView).setTextColor(Color.GRAY)
                    (p0!!.getChildAt(0) as TextView).textSize = 13f
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {

                }
            }
        }
    }
}