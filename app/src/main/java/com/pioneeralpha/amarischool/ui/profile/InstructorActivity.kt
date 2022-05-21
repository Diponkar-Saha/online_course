package com.pioneeralpha.amarischool.ui.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import com.pioneeralpha.amarischool.R
import com.pioneeralpha.amarischool.databinding.ActivityDashboardBinding
import com.pioneeralpha.amarischool.databinding.ActivityInstructorBinding
import com.pioneeralpha.amarischool.ui.dashboard.adapter.OverViewPagerAdapter
import com.pioneeralpha.amarischool.ui.dashboard.fragments.EnrollmentFragment
import com.pioneeralpha.amarischool.ui.dashboard.fragments.Week1Fragment
import com.pioneeralpha.amarischool.ui.dashboard.fragments.Week2Fragment
import com.pioneeralpha.amarischool.ui.dashboard.fragments.Week3Fragment
import com.pioneeralpha.amarischool.ui.profile.adapter.InstructorPagerAdapter
import com.pioneeralpha.amarischool.ui.profile.fragment.ContactFragment
import com.pioneeralpha.amarischool.ui.profile.fragment.ExperienceFragment
import com.pioneeralpha.amarischool.ui.profile.fragment.LessonFragment
import com.pioneeralpha.amarischool.ui.profile.fragment.TutorFragment

class InstructorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInstructorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInstructorBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)
        binding.toolbar.title = "Instructor Profile"
        setSupportActionBar(binding.toolbar)
        if (supportActionBar != null) {
            supportActionBar!!.setDisplayHomeAsUpEnabled(true)
            supportActionBar!!.setDisplayShowHomeEnabled(true)
        }

        val fragments = ArrayList<Fragment>()
        fragments.add(ContactFragment())
        fragments.add(LessonFragment())
        fragments.add(ExperienceFragment())
        fragments.add(TutorFragment())

        val title = ArrayList<String>()
        title.add("Contact")
        title.add("Lesson")
        title.add("Experience")
        title.add("Tutor")

        val pagerAdapter = InstructorPagerAdapter(
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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.settings_menu, menu)
        // return true so that the menu pop up is opened
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.menu_notification) {
            Toast.makeText(this, "notification clicked", Toast.LENGTH_SHORT).show()
            return true
        } else if (item.itemId == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }

 }


