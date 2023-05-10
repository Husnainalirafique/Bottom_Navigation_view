package com.example.bottomnavigationbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.onNavDestinationSelected
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.bottomnavigationbar.databinding.ActivityHomeBinding


class Home : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)
        //handling Clicks
        bottomNavigation()
    }

    private fun bottomNavigation() {
        navController = findNavController(R.id.nav_host_fragment)

        //setup bottom navigation
        binding.bottomNavigation.setupWithNavController(navController)

        //drawer
        appBarConfiguration = AppBarConfiguration(
            setOf(R.id.profileFragment, R.id.notificationFragment,R.id.exploreFragment),
            binding.drawerLayout
        )
        //setup actionbar
        binding.navView.setupWithNavController(navController)
        setupActionBarWithNavController(navController, appBarConfiguration)
    }

    //handle drawer icon
    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration)
    }
}