package com.sy.whattoeat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import com.sy.whattoeat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar!!.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM)
        supportActionBar!!.setCustomView(R.layout.action_bar_layout)
        var actionbar = findViewById(R.id.appbar_title) as Button

        actionbar.setOnClickListener {
            Toast.makeText(this, "title", Toast.LENGTH_SHORT)
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }

        init()

    }
    private fun init(){

        binding.eatoutButton.setOnClickListener {
            val intent = Intent(this, EatOutActivity::class.java)
            startActivity(intent)
        }
        binding.eathomeButton.setOnClickListener {
            val intent = Intent(this, EatHomeActivity::class.java)
            startActivity(intent)
        }
        binding.dietbydayButton.setOnClickListener {
            val intent = Intent(this, DietActivity::class.java)
            startActivity(intent)
        }
        binding.settingButton.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            startActivity(intent)
        }




    }





}