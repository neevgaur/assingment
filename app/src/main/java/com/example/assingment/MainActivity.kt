package com.example.assingment

// MainActivity.kt
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.assingment.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewPager: ViewPager2
    private lateinit var pagerAdapter: pagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gioActionbar.btnRefine.visibility = View.VISIBLE
        binding.gioActionbar.btnSideBar.visibility = View.VISIBLE
        binding.gioActionbar.btnback.visibility = View.INVISIBLE
        binding.gioActionbar.titleTv.text = "Howdy !!"

        viewPager = findViewById(R.id.viewPager)
        pagerAdapter = pagerAdapter(this)
        viewPager.adapter = pagerAdapter

        binding.gioActionbar.btnRefine.setOnClickListener {
            startActivity(Intent(this,refineScreen::class.java))
            finish()
        }


        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        // Link ViewPager with TabLayout
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            // Customize tab labels if needed
            if (position == 0){
                tab.text = "Personal"
            }
            else if (position == 1){
                tab.text = "Business"
            }
            else if(position == 2){
                tab.text = "Merchant"
            }
        }.attach()
    }


    // Method to change the current fragment in the ViewPager
    fun changeFragment(position: Int) {
        viewPager.setCurrentItem(position, true)
    }
}
