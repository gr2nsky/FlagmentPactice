package com.greensky0526.flagmentpactice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.viewbinding.ViewBinding
import com.greensky0526.flagmentpactice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val b by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val fragmentManager by lazy {
        supportFragmentManager
    }

    private val homeFragment by lazy {
        MainHomeFragment()
    }

    private val anotherFragment by lazy {
        MainAnotherFragment()
    }

    private lateinit var transaction: FragmentTransaction
    private var nowFragment: Fragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(b.root)
        replaceTransaction(homeFragment)

        b.btnPresentMainFragment.setOnClickListener {
            replaceTransaction(homeFragment)
        }
        b.btnPresentAnotherFragment.setOnClickListener {
            replaceTransaction(anotherFragment)
        }
    }

    private fun replaceTransaction(fragment: Fragment){
        if(nowFragment == fragment){
            Toast.makeText(this, "이미 해당 Fragment를 보여주고 있습니다.", Toast.LENGTH_SHORT).show()
            return
        }
        transaction = fragmentManager.beginTransaction()
        transaction.replace(b.flFlagmentContainer.id, fragment).commitAllowingStateLoss()
        nowFragment = fragment

    }
}