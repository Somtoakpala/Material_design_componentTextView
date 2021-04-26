package com.example.material_design_componenttextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       var sum : Int = 0
var text = findViewById<TextView>(R.id.textView)
 var addition = findViewById<Button>(R.id.add)

        addition.setOnClickListener{
            if (sum>=0){
                sum += 1
            text.setText(sum)   }

    }

}}