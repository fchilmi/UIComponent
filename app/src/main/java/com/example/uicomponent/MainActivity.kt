package com.example.uicomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.content.Context
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgBtn = findViewById<ImageButton>(R.id.BtnAdd)
        // set on-click listener
        imgBtn.setOnClickListener {
            Toast.makeText(this@MainActivity,"Berhasil", Toast.LENGTH_LONG).show()
        }
    }
    fun Cancel(view: View){
        editNama.text.clear()
        radioGroup.clearCheck()

    }
}