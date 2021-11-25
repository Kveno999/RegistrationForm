package com.example.registrationform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView




class MainActivity : AppCompatActivity() {


    private lateinit var alreadyHaveAccount : TextView
    private lateinit var registerButton : Button
    private lateinit var usernameEditTextView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        alreadyHaveAccount = findViewById(R.id.alreadyRegisteredTV)
        registerButton = findViewById(R.id.registerButton)
        usernameEditTextView = findViewById(R.id.usernameET)




        alreadyHaveAccount.setOnClickListener {


            val intent = Intent(this, LoginActivity::class.java)

            intent.putExtra("firstname", "kveno")

            startActivity(intent)
        }
        registerButton.setOnClickListener {

            val username = usernameEditTextView.text.toString()

            val intent = Intent(this, LoginActivity::class.java)

            intent.putExtra("firstname",username)

            startActivity(intent)


        }



    }
}