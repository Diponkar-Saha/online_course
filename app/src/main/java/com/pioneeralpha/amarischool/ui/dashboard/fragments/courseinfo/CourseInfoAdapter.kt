package com.pioneeralpha.amarischool.ui.dashboard.fragments.courseinfo

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pioneeralpha.amarischool.adapters.CartAdapter
import com.pioneeralpha.amarischool.databinding.MycourseInfoHeaderBinding
import com.pioneeralpha.amarischool.ui.home.model.CourseItem

class CourseInfoAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val mCourseItems: ArrayList<CourseItem>? = null
    private val COURSE_INFO_HEADER = 1
    private val CUSTOM_CHIPS_LAYOUT = 2
    private val COURSE_INFO_VIDEO = 3
    private val COURSEDETAILS = 4
    private val TYPE_COURSE_MORE_BUTTON = 5
    private val TYPE_VIEWPAGER = 6
    private val VIEW_STYLE_LIST = 1
    private val VIEW_STYLE_GRID = 0
    private var mContext: Context? = null


    class TitleImageViewHolder(binding: MycourseInfoHeaderBinding) :
        RecyclerView.ViewHolder(binding.getRoot()) {
        private val mBinding: MycourseInfoHeaderBinding = binding

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        mContext = parent.context;
        when (viewType) {
            COURSE_INFO_HEADER -> TitleImageViewHolder(
                MycourseInfoHeaderBinding.inflate(
                    LayoutInflater.from(
                        parent.context
                    ), parent, false
                )
            )
        }
        return TitleImageViewHolder(
            MycourseInfoHeaderBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}