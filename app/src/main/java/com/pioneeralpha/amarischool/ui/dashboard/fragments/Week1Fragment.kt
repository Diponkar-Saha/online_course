package com.pioneeralpha.amarischool.ui.dashboard.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.pioneeralpha.amarischool.databinding.FragmentEnrollmentBinding
import com.pioneeralpha.amarischool.databinding.FragmentWeek1Binding
import com.pioneeralpha.amarischool.utils.BindingFragment

class Week1Fragment : BindingFragment<FragmentWeek1Binding>() {

    override val bindingInflater: (LayoutInflater) -> ViewBinding
        get() = FragmentWeek1Binding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}