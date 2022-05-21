package com.pioneeralpha.amarischool.ui.enterprise

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.core.view.updateLayoutParams
import com.pioneeralpha.amarischool.R
import com.pioneeralpha.amarischool.databinding.ActivityEnterpriseBinding
import com.squareup.picasso.Picasso


class EnterpriseActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityEnterpriseBinding
    private val enterpriseList: ArrayList<Enterprise> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityEnterpriseBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        setSupportActionBar(mBinding.toolbar)
        mBinding.toolbar.title = "Enterprise"
        setSupportActionBar(mBinding.toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)

        initData()
        listenToClickEvents(mBinding.enterpriseContainer)
    }

    private fun initData() {
        enterpriseList.add(Enterprise(getString(R.string.enterprise_name_1),
                getString(R.string.enterprise_description_1),
                getString(R.string.enterprise_preview_1, ((Math.random() + 1) % 20).toInt())))
        enterpriseList.add(Enterprise(getString(R.string.enterprise_name_1),
                getString(R.string.enterprise_description_1),
                getString(R.string.enterprise_preview_1, ((Math.random() + 1) % 20).toInt())))
        enterpriseList.add(Enterprise(getString(R.string.enterprise_name_1),
                getString(R.string.enterprise_description_1),
                getString(R.string.enterprise_preview_1, ((Math.random() + 1) % 20).toInt())))
        enterpriseList.add(Enterprise(getString(R.string.enterprise_name_1),
                getString(R.string.enterprise_description_1),
                getString(R.string.enterprise_preview_1, ((Math.random() + 1) % 20).toInt())))
        enterpriseList.add(Enterprise(getString(R.string.enterprise_name_1),
                getString(R.string.enterprise_description_1),
                getString(R.string.enterprise_preview_1, ((Math.random() + 1) % 20).toInt())))
    }


    private fun listenToClickEvents(view: View) {
        val initialSize = 168
        val enlargedSize = 200
        var selectedView: View = mBinding.imageView4
        changeSize(selectedView, enlargedSize)
        changeContent(0)

        if (view is ViewGroup) {
            for (i in 0 until view.childCount) {
                view.getChildAt(i).setOnClickListener {
                    if (selectedView != view.getChildAt(i)) {
                        // changed size of previously selected view to default
                        changeSize(selectedView, initialSize)
                        // change current selected view size
                        changeSize(it, enlargedSize)
                        selectedView = view.getChildAt(i)
                        changeContent(i)
                    }
                }
            }
        }
    }

    private fun changeContent(i: Int) {
        mBinding.description.text = enterpriseList[i].description
        mBinding.textView24.text = getString(R.string.enterprise_name, enterpriseList[i].name)
        Picasso.get()
                .load(enterpriseList[i].previewUrl)
                .placeholder(R.drawable.placeholder_loading)
                .error(R.drawable.placeholder_error)
                .into(mBinding.enterpriseImage)
    }

    /**
     * Changes the size of the @view by the amount @size
     * */
    private fun changeSize(view: View, size: Int) {
        view.updateLayoutParams {
            height = size
            width = size
        }
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

data class Enterprise(
        val name: String,
        val description: String,
        val previewUrl: String,
)


