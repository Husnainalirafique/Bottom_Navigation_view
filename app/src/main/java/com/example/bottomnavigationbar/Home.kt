package com.example.bottomnavigationbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.bottomnavigationbar.databinding.ActivityHomeBinding
import com.example.bottomnavigationbar.fragments.ProfileFragment

class Home : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    private lateinit var toogle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)

        //handling Clicks
        clickListners()

        //handling tool bar
        actionbar()

        //Drawer Layout
        drawerLayout()
    }

    private fun drawerLayout() {
        val drawerLayout = binding.drawerLayout
        val navView = binding.navigationView

        toogle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toogle)
        toogle.syncState()

        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            title = "Husnain Ali Rafique"
        }

        val navController = findNavController(R.id.nav_host_fragment_container)
        navView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {

            }
            true
        }
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            binding.drawerLayout.close()
        } else {
            super.getOnBackPressedDispatcher().onBackPressed()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (toogle.onOptionsItemSelected(item)) {
            true
        } else {
            return super.onOptionsItemSelected(item)
        }
    }

    private fun clickListners() {
        binding.bottomNavigation.setupWithNavController(findNavController(R.id.nav_host_fragment_container))
    }

    private fun actionbar() {

    }
}