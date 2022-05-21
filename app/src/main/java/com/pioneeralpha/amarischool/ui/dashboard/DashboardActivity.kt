package com.pioneeralpha.amarischool.ui.dashboard

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.pioneeralpha.amarischool.R
import com.pioneeralpha.amarischool.databinding.ActivityDashboardBinding
import com.pioneeralpha.amarischool.ui.dashboard.adapter.DashboardPagerAdapter
import com.pioneeralpha.amarischool.ui.dashboard.fragments.*
import com.pioneeralpha.amarischool.ui.dashboard.fragments.courseinfo.CourseInfoFragment

class DashboardActivity : AppCompatActivity() {

    private lateinit var settingsBinding: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        settingsBinding = ActivityDashboardBinding.inflate(layoutInflater)
        val view: View = settingsBinding.root
        setContentView(view)

        settingsBinding.toolbar.title = "Complete Graphic Design For Engineers"
       setSupportActionBar(settingsBinding.toolbar)
        if (supportActionBar != null) {
            supportActionBar!!.setDisplayHomeAsUpEnabled(true)
            supportActionBar!!.setDisplayShowHomeEnabled(true)
        }

        val tabTitles = arrayOf(
                "Overview",
                "Grades",
                "Notes",
                "Forums",
                "Messages",
                "Course Info",
                "Certificates"
        )

        val dashboardTabLayout: TabLayout = settingsBinding.dashboardTabLayout

        for (title in tabTitles) {
            dashboardTabLayout.addTab(dashboardTabLayout.newTab().setText(title))
        }

        val viewPagerAdapter = DashboardPagerAdapter(this)
        viewPagerAdapter.addFragment(OverviewFragment())
        viewPagerAdapter.addFragment(GradesFragment.newInstance())
        viewPagerAdapter.addFragment(NotesFragment.newInstance())
        viewPagerAdapter.addFragment(ForumsFragment.newInstance())
        viewPagerAdapter.addFragment(MessagesFragment.newInstance())
        viewPagerAdapter.addFragment(CourseInfoFragment())
        viewPagerAdapter.addFragment(CertificatesFragment.newInstance())

        val dashboardViewPager: ViewPager2 = settingsBinding.dashboardViewPager
        dashboardViewPager.adapter = viewPagerAdapter

        TabLayoutMediator(
                dashboardTabLayout,
                dashboardViewPager
        ) { tab: TabLayout.Tab, position: Int -> tab.text = tabTitles[position] }.attach()


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