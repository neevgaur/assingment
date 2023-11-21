package com.example.assingment

// MyPagerAdapter.kt
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.assingment.business.businessFragment
import com.example.assingment.merchant.MerchantFragment
import com.example.assingment.personal.personalFragment

class pagerAdapter(fragment: MainActivity) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 3 // Number of pages
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> personalFragment()
            1 -> businessFragment()
            2 -> MerchantFragment()
            else -> throw IllegalArgumentException("Invalid position: $position")
        }
    }
}
