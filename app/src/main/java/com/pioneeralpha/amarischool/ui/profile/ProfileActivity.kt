package com.pioneeralpha.amarischool.ui.profile

import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import com.pioneeralpha.amarischool.R
import com.pioneeralpha.amarischool.databinding.ActivityProfileBinding


class ProfileActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityProfileBinding
    private var userSkills: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        setSupportActionBar(mBinding.toolbar)
        mBinding.toolbar.title = "Profile"
        setSupportActionBar(mBinding.toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)

        mBinding.content.floatingActionButton2.setOnClickListener {
            selectImage()
        }
        mBinding.content.pdfupload.setOnClickListener {
            selectPdf()
        }

       // initSpinner()
    }

//    private fun initSpinner() {
//        val items = listOf("Graphics Design", "UI/UX Design", "C++", "Website Development",
//                "Adobe Creative Suit", "Content Writing", "User Experience Design", "Creating Marketing")
//        val adapter = ArrayAdapter(baseContext, R.layout.item_spinner, items)
//        (mBinding.content.skillsInputSpinner.editText as? AutoCompleteTextView)?.setAdapter(adapter)
//        mBinding.content.skillsInputSpinner.editText?.addTextChangedListener(object : TextWatcher {
//            override fun afterTextChanged(s: Editable?) {
//            }
//
//            override fun beforeTextChanged(
//                    s: CharSequence?,
//                    start: Int,
//                    count: Int,
//                    after: Int
//            ) {
//            }
//
//            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
//                if (!userSkills.contains(s.toString())) {
//                    userSkills.add(s.toString())
//                    addChipToGroup(s.toString(), mBinding.content.skillsGroup)
//                } else {
//                    Toast.makeText(applicationContext, "Skill is already chosen", Toast.LENGTH_SHORT).show()
//                }
//
//            }
//        })
//
//    }

    private fun addChipToGroup(txt: String, chipGroup: ChipGroup) {
        val chip = Chip(this@ProfileActivity)
        chip.text = txt
        chip.isCloseIconVisible = true
        chip.setCloseIconTintResource(R.color.purple)
        //Callback fired when chip close icon is clicked
        chip.setOnCloseIconClickListener {
            chipGroup.removeView(chip)
            userSkills.remove(chip.text)
        }

        chipGroup.addView(chip)

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

    fun onFacebookLinkClick(view: View) {
        (view as ImageView).setImageDrawable(ResourcesCompat.getDrawable(resources, R.drawable.ic_facebook, null) as Drawable);
    }

    fun onLinkedInLinkClick(view: View) {
        (view as ImageView).setImageDrawable(ResourcesCompat.getDrawable(resources, R.drawable.ic_linkedin, null) as Drawable);
    }

    fun onGithubLinkClick(view: View) {
        (view as ImageView).setImageDrawable(ResourcesCompat.getDrawable(resources, R.drawable.ic_github, null) as Drawable);
    }

    private fun selectImage() {
        val intent = Intent()
        intent.type = "image/*"
        intent.action = Intent.ACTION_GET_CONTENT
        startActivityForResult(intent, 100)
    }
    private fun selectPdf() {
        val pdfIntent = Intent(Intent.ACTION_GET_CONTENT)
        pdfIntent.type = "application/pdf"
        pdfIntent.addCategory(Intent.CATEGORY_OPENABLE)
        startActivityForResult(pdfIntent, 12)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 100 && data != null && data.data != null) {

           // mBinding.content.userImg.setImageURI(da)
        }
    }

}