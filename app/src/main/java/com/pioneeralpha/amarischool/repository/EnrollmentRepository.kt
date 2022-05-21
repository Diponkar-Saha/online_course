package com.pioneeralpha.amarischool.repository

import com.pioneeralpha.amarischool.utils.Constants

class EnrollmentRepository {
    suspend fun getLocalSingleQuestion() = Constants.getSingleQuestion()
    suspend fun getLocalMultipleQuestion() = Constants.getMultipleQuestion()
}
