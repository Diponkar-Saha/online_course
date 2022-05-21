package com.pioneeralpha.amarischool.ui.dashboard

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import java.util.*

class DashboardPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    private val settingsFragments: MutableList<Fragment> = ArrayList()
    override fun createFragment(position: Int): Fragment {
        return settingsFragments[position]
    }

    override fun getItemCount(): Int {
        return settingsFragments.size
    }

    fun addFragment(fragment: Fragment) {
        settingsFragments.add(fragment)
    }
}