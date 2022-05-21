package com.pioneeralpha.amarischool.ui.dashboard.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class OverViewPagerAdapter (
    private val fragments: ArrayList<Fragment>,
    fragmentActivity: Fragment
): FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {

        return fragments[position]
    }


}
