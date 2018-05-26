package com.kangzayd.likeinstagram.old

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.kangzayd.likeinstagram.BottomNavigationViewHelper
import com.kangzayd.likeinstagram.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                pushFragment(FragmentHome())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                pushFragment(FragmentHome())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                pushFragment(FragmentHome())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications2 -> {
                pushFragment(FragmentHome())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications3 -> {
                pushFragment(FragmentHome())
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowCustomEnabled(true)
        BottomNavigationViewHelper.disableShiftMode(navigation)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        pushFragment(FragmentHome())
    }

    protected fun pushFragment(fragment: Fragment?) {
        if (fragment == null)
            return

        val fragmentManager = supportFragmentManager
        if (fragmentManager != null) {
            val ft = fragmentManager.beginTransaction()
            if (ft != null) {
                ft.replace(R.id.rootLayout, fragment)
                ft.commit()
            }
        }
    }

}
