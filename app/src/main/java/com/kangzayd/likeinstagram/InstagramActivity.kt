package com.kangzayd.likeinstagram

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_instagram.*

class InstagramActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                changeFragment(FragmentSatu())
                Toast.makeText(applicationContext, "Menu Home", Toast.LENGTH_SHORT).show()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_search -> {
                Toast.makeText(applicationContext, "Menu Search", Toast.LENGTH_SHORT).show()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_new_story -> {
                Toast.makeText(applicationContext, "Menu New Story", Toast.LENGTH_SHORT).show()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_timeline -> {
                Toast.makeText(applicationContext, "Menu Timeline", Toast.LENGTH_SHORT).show()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_profile -> {
                Toast.makeText(applicationContext, "Menu Profile", Toast.LENGTH_SHORT).show()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instagram)

        setSupportActionBar(toolbar_instagram)
        BottomNavigationViewHelper.disableShiftMode(navigation)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    fun changeFragment(fragment: Fragment){
        if (fragment == null)
            return

        val fragmentManager = supportFragmentManager
        if (fragmentManager !=null){
            val  ft = fragmentManager.beginTransaction()
            if (ft != null){
                ft.replace(R.id.root_layout, fragment)
                ft.commit()
            }
        }
    }
}
