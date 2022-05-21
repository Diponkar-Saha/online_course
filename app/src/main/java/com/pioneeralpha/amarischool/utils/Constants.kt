package com.pioneeralpha.amarischool.utils

import com.pioneeralpha.amarischool.models.Enrollment

object Constants {

    fun getMultipleQuestion(): ArrayList<Enrollment.MultipleQuestion> {

        val questionList = ArrayList<Enrollment.MultipleQuestion>()

        val question1 = Enrollment.MultipleQuestion(
            4,
            "Choose the right word in the blank",
            "Which internet company began life as an online bookstore called 'Cadabra' ?",
            1,
            "2",
            "ebay",
            "Shopify",
            "Amazon",
            "Overstock",
            "Alibaba",
            "Flipkart"
        )

        questionList.add(question1)

        val question2 = Enrollment.MultipleQuestion(
            5,
            "Choose the right word in the blank",
            "Best smart phone company in world?",
            1,
            "2",
            "Apple",
            "Samsung",
            "Amazon",
            "Xiaomi",
            "Oppo",
            "One plus"
        )

        questionList.add(question2)
        return questionList
    }

    fun getSingleQuestion() : ArrayList<Enrollment.SingleQuestion>{

        val singleQuestionList = ArrayList<Enrollment.SingleQuestion>()

        val question3 = Enrollment.SingleQuestion(
            1,
            "Choose the right word in the blank",
            "Which movie is all time hit ?",
            "3 idiots",
            "No Body",
            "Who i am",
            "Avenger",
        )

        singleQuestionList.add(question3)

        val question4 = Enrollment.SingleQuestion(
            2,
            "Choose the right word in the blank",
            "Why you upset?",
            "lonely",
            "angry",
            "board",
            "worried"
        )

        singleQuestionList.add(question4)

        val question5 = Enrollment.SingleQuestion(
            3,
            "Choose the right word in the blank",
            "Which internet provider is good in dhaka?",
            "link 3",
            "Triangle",
            "Amber it",
            "Icc"
        )
        singleQuestionList.add(question5)
        return singleQuestionList

    }

}