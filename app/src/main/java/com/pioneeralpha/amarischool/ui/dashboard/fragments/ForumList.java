package com.pioneeralpha.amarischool.ui.dashboard.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pioneeralpha.amarischool.R;
import com.pioneeralpha.amarischool.adapters.CartAdapter;
import com.pioneeralpha.amarischool.adapters.ForumAdapter;
import com.pioneeralpha.amarischool.models.CartModel;
import com.pioneeralpha.amarischool.models.ForumModel;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ForumList#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ForumList extends Fragment implements ForumAdapter.OnCardListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    List<ForumModel> forumModels = new ArrayList<>();
    ForumAdapter forumAdapter;

    // TODO: Rename and change types of parameters
    private RecyclerView forumRecycleview,threadRecycleView;
    public ForumList() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ForumList.
     */
    // TODO: Rename and change types and number of parameters
    public static ForumList newInstance(String param1, String param2) {
        ForumList fragment = new ForumList();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_forum_list, container, false);
        forumRecycleview = view.findViewById(R.id.recycleviewForum);
        threadRecycleView = view.findViewById(R.id.threadRecycleview);

        forumModels.add(new ForumModel("General Discusstion","Use this forum to discuss things related to the course that dont \n" +
                "belong in any of the other forum.","Last post 3 days ago","660"));
        forumModels.add(new ForumModel("General Discusstion","Use this forum to discuss things related to the course that dont \n" +
                "belong in any of the other forum.","Last post 3 days ago","550"));
        forumAdapter = new ForumAdapter(getActivity(), forumModels, this);
        forumRecycleview.setHasFixedSize(true);
        forumRecycleview.addItemDecoration(new DividerItemDecoration(getContext(),
                DividerItemDecoration.VERTICAL));
        forumRecycleview.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        forumRecycleview.setAdapter(forumAdapter);

        threadRecycleView.setHasFixedSize(true);
        threadRecycleView.addItemDecoration(new DividerItemDecoration(getContext(),
                DividerItemDecoration.VERTICAL));
        threadRecycleView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        threadRecycleView.setAdapter(forumAdapter);

        return view;
    }

    @Override
    public void onCardClick(int position) {

    }

    @Override
    public void onExploreMyCourseBtnClick(int position) {

    }
}