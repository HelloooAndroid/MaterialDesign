package com.seeker.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setSupportActionBar(toolbar)

        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(LoginFragment(), "Login 1")
        adapter.addFragment(LoginFragment2(), "Login 2")
        adapter.addFragment(MyBottomAppBar(), "Bottom App Bar")
        adapter.addFragment(RegistrationFragment(), "Registration")
        adapter.addFragment(ProfileFragment(), "Profile")
        adapter.addFragment(ComponentsFragment(), "Components")
        adapter.addFragment(ComponentsFragment(), "Components2")
        adapter.addFragment(ComponentsFragment(), "Component3")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
        tabs.setTabMode(TabLayout.MODE_SCROLLABLE);
    }
}
