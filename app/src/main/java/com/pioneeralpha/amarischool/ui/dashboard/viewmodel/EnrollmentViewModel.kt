package com.pioneeralpha.amarischool.ui.dashboard.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pioneeralpha.amarischool.models.Enrollment
import com.pioneeralpha.amarischool.repository.EnrollmentRepository
import com.pioneeralpha.amarischool.utils.Constants
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class EnrollmentViewModel(private val repository: EnrollmentRepository) : ViewModel() {

    private val _questionListItemsLiveData = MutableLiveData<List<Enrollment>>()
    val questionListItemsLiveData: LiveData<List<Enrollment>>
        get() = _questionListItemsLiveData

    init {
        getQuestionListItems()
    }

    private fun getQuestionListItems() = viewModelScope.launch {


    val localSingle = async { repository.getLocalSingleQuestion() }
    val localMultiple = async { repository.getLocalMultipleQuestion() }


    val singleLocal = localSingle.await()
    val multipleLocal = localMultiple.await()

    val questionItemsList = mutableListOf<Enrollment>()


    questionItemsList.addAll(singleLocal)
    questionItemsList.addAll(multipleLocal)
    _questionListItemsLiveData.postValue(questionItemsList)


   }
}