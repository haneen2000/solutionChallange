package com.example.hunger_block

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Coin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coin)
        val done = findViewById<Button>(R.id.done)
        val Cardtype=findViewById<EditText>(R.id.cardtype)
        val cardnumber=findViewById<EditText>(R.id.cardnumber)
        val cvv =findViewById<EditText>(R.id.cvv)
        val date =findViewById<EditText>(R.id.expirydate)



        done.setOnClickListener {
            val cardnumberr=cardnumber.text.toString()
            val cardtypee=Cardtype.text.toString()
            val cvVv = cvv.text.toString()
            val datee=date.text.toString()

            if (cardnumberr == "" || cardtypee == "" || cvVv == "" || datee == "" )
            {
                val toast1 = Toast.makeText(
                    applicationContext,
                    "you can not let any field empty ",
                    Toast.LENGTH_SHORT
                )
                toast1.show()
            }else{
            val toast1 = Toast.makeText(
                applicationContext,
                "thank you for your donation ",
                Toast.LENGTH_SHORT
            )
            toast1.show()
            val intent=Intent(this,Person::class.java)
            startActivity(intent)}

        }
    }
}