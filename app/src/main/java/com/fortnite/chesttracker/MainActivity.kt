package com.fortnite.chesttracker

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(30, 30, 30, 30)
            setBackgroundColor(Color.rgb(20, 25, 35))
        }

        val title = TextView(this).apply {
            text = "FORTNITE CHEST TRACKER"
            textSize = 23f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        val status = TextView(this).apply {
            text = "Tracker: READY"
            textSize = 18f
            setTextColor(Color.GREEN)
            gravity = Gravity.CENTER
        }

        val button = Button(this).apply {
            text = "OPEN CHEST MAP"
            setOnClickListener {
                status.text = "Chest map ready"
            }
        }

        val description = TextView(this).apply {
            text = "Map-based chest locations\nDistance and location markers"
            textSize = 15f
            setTextColor(Color.LTGRAY)
            gravity = Gravity.CENTER
        }

        layout.addView(title)
        layout.addView(status)
        layout.addView(button)
        layout.addView(description)

        setContentView(layout)
    }
}
