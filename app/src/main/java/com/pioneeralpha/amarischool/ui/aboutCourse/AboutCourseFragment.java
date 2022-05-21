package com.pioneeralpha.amarischool.ui.aboutCourse;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;

import androidx.fragment.app.Fragment;

import com.pioneeralpha.amarischool.R;
import com.pioneeralpha.amarischool.databinding.FragmentAboutCourseBinding;


public class AboutCourseFragment extends Fragment {
    private FragmentAboutCourseBinding mBinding;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mBinding = FragmentAboutCourseBinding.inflate(inflater, container, false);

        MediaController mediaController= new MediaController(requireContext());
        mediaController.setAnchorView(mBinding.courseInfoVideo.vidvw);

        Uri uri = Uri.parse("android.resource://com.pioneeralpha.amarischool" + "/" + R.raw.tt);
        mBinding.courseInfoVideo.vidvw.setMediaController(mediaController);
        mBinding.courseInfoVideo.vidvw.setVideoURI(uri);
        mBinding.courseInfoVideo.vidvw.requestFocus();
        mBinding.courseInfoVideo.vidvw.start();
        return mBinding.getRoot();

    }
}