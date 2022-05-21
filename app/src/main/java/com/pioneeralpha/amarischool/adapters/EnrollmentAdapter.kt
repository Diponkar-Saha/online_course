package com.pioneeralpha.amarischool.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pioneeralpha.amarischool.R
import com.pioneeralpha.amarischool.databinding.ItemQuestionBinding
import com.pioneeralpha.amarischool.databinding.ItemQuestionMultipleBinding
import com.pioneeralpha.amarischool.models.Enrollment
import java.lang.IllegalArgumentException



class EnrollmentAdapter : RecyclerView.Adapter<EnrollmentViewHolder>(){

    var items = listOf<Enrollment>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EnrollmentViewHolder {
        return when(viewType){

            R.layout.item_question -> EnrollmentViewHolder.QuestionViewHolder(
                ItemQuestionBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            )
            R.layout.item_question_multiple -> EnrollmentViewHolder.QuestionMultipleViewHolder(
                ItemQuestionMultipleBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
            else -> throw IllegalArgumentException("Invalid Layout Provider")
        }
    }
    override fun onBindViewHolder(holder: EnrollmentViewHolder, position: Int) {
        when(holder){
            is EnrollmentViewHolder.QuestionViewHolder -> holder.bind(items[position] as Enrollment.SingleQuestion)
            is EnrollmentViewHolder.QuestionMultipleViewHolder -> holder.bind(items[position] as Enrollment.MultipleQuestion)
        }
    }
    override fun getItemCount() = items.size

    override fun getItemViewType(position: Int): Int {
        return when(items[position]){
            is Enrollment.MultipleQuestion -> R.layout.item_question_multiple
            is Enrollment.SingleQuestion -> R.layout.item_question
            else -> R.layout.item_question
        }
    }
}