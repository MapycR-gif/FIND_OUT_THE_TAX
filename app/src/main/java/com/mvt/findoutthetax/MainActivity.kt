package com.mvt.findoutthetax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.mvt.findoutthetax.databinding.ActivityMainBinding
import com.mvt.findoutthetax.screens.MAIN

class MainActivity() : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navController = Navigation.findNavController(this,R.id.nav_host_fragment )
        MAIN = this
    }



    }

