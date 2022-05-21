package com.pioneeralpha.amarischool.ui.dashboard.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewbinding.ViewBinding
import com.pioneeralpha.amarischool.adapters.EnrollmentAdapter
import com.pioneeralpha.amarischool.databinding.FragmentEnrollmentBinding
import com.pioneeralpha.amarischool.repository.EnrollmentRepository
import com.pioneeralpha.amarischool.ui.dashboard.viewmodel.EnrollmentViewModel
import com.pioneeralpha.amarischool.ui.dashboard.viewmodel.EnrollmentViewModelFactory
import com.pioneeralpha.amarischool.utils.BindingFragment

class EnrollmentFragment : BindingFragment<FragmentEnrollmentBinding>() {

    private val mAdapter by lazy { EnrollmentAdapter() }
    lateinit var viewModel : EnrollmentViewModel

    override val bindingInflater: (LayoutInflater) -> ViewBinding
        get() = FragmentEnrollmentBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val repository = EnrollmentRepository()
        val  viewModelProviderFactory = EnrollmentViewModelFactory(repository)
        viewModel = ViewModelProvider(this,viewModelProviderFactory).get(EnrollmentViewModel::class.java)

        initRecyclerView()
        viewModel.questionListItemsLiveData.observe(viewLifecycleOwner, { result ->
            mAdapter.items = result

        })
    }

    private fun initRecyclerView() {
        binding.recyclerview.adapter = mAdapter
        binding.recyclerview.setHasFixedSize(true)
        binding.recyclerview.layoutManager =
            LinearLayoutManager(
                requireContext()
                    .applicationContext,
                LinearLayoutManager.VERTICAL,
                false
            )
    }

}