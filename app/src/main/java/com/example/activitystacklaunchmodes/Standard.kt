package com.example.activitystacklaunchmodes

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Standard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_standard)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Log.d("ASLM", "=========STANDARD onCreate ==============")
    }
    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        Log.d("ASLM", "=========STANDARD  onNewIntent() ==============")
    }
    fun buttonRespond(v: View) {
        Log.d("ASLM", "=========STANDARD  buttonRespond ==============")
        // v points to the Button object
        when( v.id )  {
            R.id.standardB -> {
                startActivity(Intent(this, Standard::class.java))
                Log.d("ASLM", "=========STANDARD  TO STANDARD ==============")
            }
            R.id.mainB -> startActivity(Intent(this, MainActivity::class.java) )
            R.id.singletopB -> startActivity(Intent(this, Singletop::class.java) )
            R.id.backB -> {
                // go back to the Activity that called me
                finish()
            }
        }
    }
}