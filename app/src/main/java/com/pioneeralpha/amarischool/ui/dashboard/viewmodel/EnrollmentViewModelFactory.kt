package com.pioneeralpha.amarischool.ui.dashboard.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.pioneeralpha.amarischool.repository.EnrollmentRepository

class EnrollmentViewModelFactory(private val repository: EnrollmentRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return EnrollmentViewModel(repository) as T
    }
}