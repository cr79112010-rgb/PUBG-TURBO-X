
package com.h777.pubgturbox

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(30, 30, 30, 30)
            setBackgroundColor(Color.BLACK)
        }

        val title = TextView(this).apply {
            text = "PUBG TURBO X"
            textSize = 30f
            setTextColor(Color.RED)
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "ULTIMATE GAMING EXPERIENCE"
            textSize = 13f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        val start = Button(this).apply {
            text = "START PUBG"
            setOnClickListener {
                val intent = packageManager
                    .getLaunchIntentForPackage("com.tencent.ig")

                if (intent != null) {
                    startActivity(intent)
                } else {
                    Toast.makeText(
                        this@MainActivity,
                        "PUBG Mobile not found",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }

        layout.addView(title)
        layout.addView(subtitle)
        layout.addView(start)

        setContentView(layout)
    }
}
