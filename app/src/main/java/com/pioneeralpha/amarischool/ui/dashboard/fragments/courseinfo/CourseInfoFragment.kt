package com.pioneeralpha.amarischool.ui.dashboard.fragments.courseinfo

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.MediaController
import androidx.viewbinding.ViewBinding
import com.pioneeralpha.amarischool.R
import com.pioneeralpha.amarischool.databinding.FragmentCourseInfoBinding
import com.pioneeralpha.amarischool.utils.BindingFragment


class CourseInfoFragment : BindingFragment<FragmentCourseInfoBinding>() {



    override val bindingInflater: (LayoutInflater) -> ViewBinding
        get() = FragmentCourseInfoBinding::inflate



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mediaController = MediaController(requireContext())
        mediaController.setAnchorView(binding.courseInfoVideo.vidvw)

        val uri : Uri = Uri.parse("android.resource://com.pioneeralpha.amarischool" + "/" + R.raw.tt)
        binding.courseInfoVideo.vidvw.setMediaController(mediaController)
        binding.courseInfoVideo.vidvw.setVideoURI(uri)
        binding.courseInfoVideo.vidvw.requestFocus()
        binding.courseInfoVideo.vidvw.start()

//        binding.goToInstructor.setOnClickListener {
//          val  intent =  Intent(activity, InstructorActivity::class.java)
//            startActivity(intent)
//        }
    }
}