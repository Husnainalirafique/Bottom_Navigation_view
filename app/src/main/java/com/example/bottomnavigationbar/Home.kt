package com.example.bottomnavigationbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.bottomnavigationbar.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)

        //handling Clicks
        clickListners()

        //handling tool bar
        actionbar()
    }

    private fun clickListners() {
        binding.bottomNavigation.setupWithNavController(findNavController(R.id.nav_host_fragment_container))
    }

    private fun actionbar() {
        supportActionBar?.apply {
            this.hide()
        }
    }
}