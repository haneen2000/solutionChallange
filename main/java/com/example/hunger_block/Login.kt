package com.example.hunger_block

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val  person=findViewById<Button>(R.id.person)
        val Company=findViewById<Button>(R.id.company)
        val password =findViewById<EditText>(R.id.password)
        val passwordCon =findViewById<EditText>(R.id.passwordCon)
        val first =findViewById<EditText>(R.id.frist)
        val last =findViewById<EditText>(R.id.last)
        val email =findViewById<EditText>(R.id.email)
        //////////////////////////////////////////////////////////
        person.setOnClickListener {

            val pass1 = password.text.toString()
            val pass2 = passwordCon.text.toString()
            val ft = first.text.toString()
            val lt = last.text.toString()
            val Em = email.text.toString()

            val intent = Intent(this, Person::class.java)

            if (pass1 == "" || pass2 == "" || ft == "" || lt == "" || Em == "")
            {
                val toast1 = Toast.makeText(
                    applicationContext,
                    "you can not let any field empty ",
                    Toast.LENGTH_SHORT
                )
                toast1.show()
            }
            else
            {
                if (pass1 == pass2)
                {

                    startActivity(intent)
                }
                else
                {
                    val toast = Toast.makeText(
                        applicationContext,
                        "the password confirmation field dose not match the password field ",
                        Toast.LENGTH_SHORT
                    )
                    toast.show()
                }

            }


        }

        Company.setOnClickListener {

            val pass1 = password.text.toString()
            val pass2 = passwordCon.text.toString()
            val ft = first.text.toString()
            val lt = last.text.toString()
            val Em = email.text.toString()

            val intent = Intent(this,company::class.java)

            if (pass1 == "" || pass2 == "" || ft == "" || lt == "" || Em == "")
            {
                val toast1 = Toast.makeText(
                    applicationContext,
                    "you can not let any field empty ",
                    Toast.LENGTH_SHORT
                )
                toast1.show()
            }
            else
            {
                if (pass1 == pass2)
                {

                    startActivity(intent)
                }
                else
                {
                    val toast = Toast.makeText(
                        applicationContext,
                        "the password confirmation field dose not match the password field ",
                        Toast.LENGTH_SHORT
                    )
                    toast.show()
                }

            }


        }

    }
}