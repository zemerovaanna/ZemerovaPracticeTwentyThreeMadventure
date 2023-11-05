package com.example.madventurezemerova

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity

class SignInActivity : ComponentActivity() {
    lateinit var email: EditText
    lateinit var password: EditText
    lateinit var bsignin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        bsignin = findViewById(R.id.buttonSignIn)
        bsignin.setOnClickListener {
            if(email.text.toString().isNotEmpty() && password.text.toString().isNotEmpty())
            {
                startActivity(Intent(this@SignInActivity,ResultActivity::class.java))
            }
            else
            {
                Toast.makeText(this, "Empty fields", Toast.LENGTH_SHORT).show()
            }
        }
    }
}