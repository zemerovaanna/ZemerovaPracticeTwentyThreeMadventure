package com.example.madventurezemerova

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
    }
    fun take_result(view: View) {
        Toast.makeText(this, "Sucess", Toast.LENGTH_SHORT).show()
    }
}
