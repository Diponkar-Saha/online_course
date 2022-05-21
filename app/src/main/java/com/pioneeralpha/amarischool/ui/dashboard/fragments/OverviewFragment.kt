package com.pioneeralpha.amarischool.ui.dashboard.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.google.android.material.tabs.TabLayoutMediator
import com.pioneeralpha.amarischool.databinding.FragmentOverviewBinding
import com.pioneeralpha.amarischool.ui.dashboard.adapter.OverViewPagerAdapter
import com.pioneeralpha.amarischool.utils.BindingFragment


class OverviewFragment : BindingFragment<FragmentOverviewBinding>() {


    override val bindingInflater: (LayoutInflater) -> ViewBinding
        get() = FragmentOverviewBinding::inflate


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /*
        Fragment don't have supportActionBar method,  it's the activity method & when we need toolbar
        we may cast the activity
         */

//        if(activity is AppCompatActivity){
//            (activity as AppCompatActivity).setSupportActionBar(binding.toolbar)
//        }
//        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val fragments = ArrayList<Fragment>()
        fragments.add(EnrollmentFragment())
        fragments.add(Week1Fragment())
        fragments.add(Week2Fragment())
        fragments.add(Week3Fragment())

        val title = ArrayList<String>()
        title.add("Enrollment")
        title.add("Week 1")
        title.add("Week 2")
        title.add("Week 3")

        val pagerAdapter = OverViewPagerAdapter(
            fragments,
            this
        )
        binding.viewPager2.apply {
            adapter = pagerAdapter
        }

        TabLayoutMediator(binding.tabLayout, binding.viewPager2) { tab, position ->
            tab.text = title[position]
        }.attach()
    }


}