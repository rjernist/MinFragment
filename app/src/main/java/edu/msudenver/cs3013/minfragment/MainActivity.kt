// RJ Sam
// MinFragment Homework
// CS 3013
package edu.msudenver.cs3013.minfragment

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }

    fun startFragment(view: View) {

        val blueFragment = BlueFragment.newInstance("FIRST")

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, blueFragment)
            .addToBackStack(null)
            .commit()
    }
}
