package com.example.registrationform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class LoginActivity : AppCompatActivity() {


    private var correctEmail = "kveno"
    private var correctPass = "123456"


    private lateinit var emailEditTextView: TextView
    private lateinit var loginButton: Button
    private lateinit var passwordET: TextView
    private lateinit var registration : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        emailEditTextView = findViewById(R.id.emailET2)
        loginButton = findViewById(R.id.loginButton)
        passwordET = findViewById(R.id.passwordET2)
        registration = findViewById(R.id.registrationTV)


        emailEditTextView.text = intent?.extras?.getString("password","")
        emailEditTextView.text = intent?.extras?.getString("firstname", "")



        loginButton.setOnClickListener {
            if (emailEditTextView.text.toString() == correctEmail && passwordET.text.toString() == correctPass){
                Toast.makeText(this, "თქვენ წარმტებით გაიარეთ ავტორიზაცია!", Toast.LENGTH_SHORT).show()
            }else Toast.makeText(this, "მეილი ან პაროლი არასწორია!", Toast.LENGTH_SHORT).show()
        }


        registration.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }


    }
}