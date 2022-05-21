package com.pioneeralpha.amarischool.adapters

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.pioneeralpha.amarischool.databinding.ItemQuestionBinding
import com.pioneeralpha.amarischool.databinding.ItemQuestionMultipleBinding
import com.pioneeralpha.amarischool.models.Enrollment

sealed class EnrollmentViewHolder(binding: ViewBinding) : RecyclerView.ViewHolder(binding.root){

    class QuestionViewHolder(private val binding: ItemQuestionBinding) : EnrollmentViewHolder(binding){

        fun bind(enrollment: Enrollment.SingleQuestion){
            binding.questionTitle.text = enrollment.question_title
            binding.questionNo.text = enrollment.question_no.toString()
            binding.question.text = enrollment.question
            binding.questionOne.text =  enrollment.answer_one
            binding.questionTwo.text = enrollment.answer_two
            binding.questionThree.text = enrollment.answer_three
            binding.questionFour.text = enrollment.answer_four
        }
    }

    class QuestionMultipleViewHolder(private val binding : ItemQuestionMultipleBinding) : EnrollmentViewHolder(binding){

        fun bind(enrollment: Enrollment.MultipleQuestion){
            binding.question1.text = enrollment.question_blank1.toString()
            binding.question2.text = enrollment.question_blank2
            binding.questionTitle.text = enrollment.question_title
            binding.questionNo.text = enrollment.question_no.toString()
            binding.question.text = enrollment.question
            binding.questionOne.text =  enrollment.answer_one
            binding.questionTwo.text = enrollment.answer_two
            binding.questionThree.text = enrollment.answer_three
            binding.questionFour.text = enrollment.answer_four
            binding.questionFive.text = enrollment.answer_five
            binding.questionSix.text = enrollment.answer_six
        }
    }
}
