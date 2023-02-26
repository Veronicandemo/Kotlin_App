package eu.tutorials.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val tvMyTextView = findViewById<TextView>(R.id.myname)
        var  timesclicked  = 0
        btnClickMe.setOnClickListener{
            timesclicked = timesclicked + 1

            tvMyTextView.text = timesclicked.toString()
            Toast.makeText(this, "Hey Veronica", Toast.LENGTH_LONG).show()
        }
    }
}