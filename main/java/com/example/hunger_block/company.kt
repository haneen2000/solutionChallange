package com.example.hunger_block

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract
import android.widget.Button
import android.widget.CalendarView
import android.widget.Toast
import java.util.*

class company : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_company)
        val custmize = findViewById<Button>(R.id.custmize)
        val PickUp=findViewById<Button>(R.id.PickUp)
        val signout=findViewById<Button>(R.id.SignOut)
        val CalendarView=findViewById<CalendarView>(R.id.calendarView)

        custmize.setOnClickListener {
            val intent = Intent(Intent.ACTION_INSERT)
            intent.setData(CalendarContract.Events.CONTENT_URI)
            //to make the event avelabale all the day
            intent.putExtra(CalendarContract.Events.ALL_DAY, true)

            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent)
            } else {
                Toast.makeText(this, "There is no app that support this action", Toast.LENGTH_SHORT).show()
            }

        }

        PickUp.setOnClickListener {
            val intent = Intent(this,pickUp::class.java)
            startActivity(intent)
        }
        signout.setOnClickListener {
            val intent= Intent(this,Login::class.java)
            startActivity(intent);
        }










    }
}




