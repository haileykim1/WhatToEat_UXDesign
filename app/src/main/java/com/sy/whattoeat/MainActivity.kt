package com.sy.whattoeat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sy.whattoeat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}