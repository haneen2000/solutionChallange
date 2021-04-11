package com.example.hunger_block

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Person : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_person)

        val PickUpn =findViewById<Button>(R.id.pickUp)
        val Diliver =findViewById<Button>(R.id.diliver)
        val spots =findViewById<Button>(R.id.spots)
        val coin =findViewById<Button>(R.id.coin)
        val signout=findViewById<Button>(R.id.SignOut)

        signout.setOnClickListener {
            val intent= Intent(this,Login::class.java)
            startActivity(intent)
        }

        PickUpn.setOnClickListener {
            val intent2= Intent(this,pickUp::class.java)
            startActivity(intent2)
        }

        Diliver.setOnClickListener {
            val intent2= Intent(this,diliver::class.java)
            startActivity(intent2)
        }
        spots.setOnClickListener {
            val intent2= Intent(this,Spots::class.java)
            startActivity(intent2)
        }
        coin.setOnClickListener {
            val intent2= Intent(this,Coin::class.java)
            startActivity(intent2)
        }
    }
}