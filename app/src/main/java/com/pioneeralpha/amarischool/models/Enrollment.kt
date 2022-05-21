package com.pioneeralpha.amarischool.models

sealed class Enrollment{
    class SingleQuestion(
        val question_no : Int,
        val question_title : String,
        val question : String,
        val answer_one : String,
        val answer_two : String,
        val answer_three : String,
        val answer_four : String

    ): Enrollment()

    class MultipleQuestion(
        val question_no : Int,
        val question_title : String,
        val question : String,
        val question_blank1 : Long = 0,
        val question_blank2 : String,
        val answer_one : String,
        val answer_two : String,
        val answer_three : String,
        val answer_four : String,
        val answer_five : String,
        val answer_six : String
    ) : Enrollment()
}
