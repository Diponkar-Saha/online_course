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
import com.pioneeralpha.amarischool.adapters.ForumAdapter;
import com.pioneeralpha.amarischool.adapters.ThreadAdapter;
import com.pioneeralpha.amarischool.models.ForumModel;
import com.pioneeralpha.amarischool.models.ThreaModel;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AllThreadsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AllThreadsFragment extends Fragment implements ThreadAdapter.OnCardListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    List<ThreaModel> threadModels = new ArrayList<>();
    ThreadAdapter threadAdapter;

    // TODO: Rename and change types of parameters
    private RecyclerView forumRecycleview,threadRecycleView;

    public AllThreadsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AllThreadsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AllThreadsFragment newInstance(String param1, String param2) {
        AllThreadsFragment fragment = new AllThreadsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_all_threads, container, false);
        threadRecycleView = view.findViewById(R.id.recycleviewThread);

        threadModels.add(new ThreaModel("General Discusstion","Use this forum to discuss things related to the course that dont \n" +
                "belong in any of the other forum.","Last post 3 days ago","Amar i school","44","244"));
        threadModels.add(new ThreaModel("General Discusstion","Use this forum to discuss things related to the course that dont \n" +
                "belong in any of the other forum.","Last post 3 days ago","Amar i school","44","244"));
        threadAdapter = new ThreadAdapter(getActivity(), threadModels, this);
        threadRecycleView.setHasFixedSize(true);
        threadRecycleView.addItemDecoration(new DividerItemDecoration(getContext(),
                DividerItemDecoration.VERTICAL));
        threadRecycleView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        threadRecycleView.setAdapter(threadAdapter);
        return view;
    }

    @Override
    public void onCardClick(int position) {

    }

    @Override
    public void onExploreMyCourseBtnClick(int position) {

    }
}