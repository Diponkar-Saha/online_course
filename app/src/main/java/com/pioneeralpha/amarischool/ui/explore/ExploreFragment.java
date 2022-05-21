package com.pioneeralpha.amarischool.ui.explore;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.DividerItemDecoration;

import com.google.android.flexbox.FlexDirection;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.flexbox.JustifyContent;
import com.pioneeralpha.amarischool.R;
import com.pioneeralpha.amarischool.WishlistFragment;
import com.pioneeralpha.amarischool.adapters.ExploreRecyclerAdapter;
import com.pioneeralpha.amarischool.databinding.FragmentExploreBinding;
import com.pioneeralpha.amarischool.models.Category;

import java.util.ArrayList;

public class ExploreFragment extends Fragment implements ExploreRecyclerAdapter.ItemClickListener {
    private FragmentExploreBinding mBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = FragmentExploreBinding.inflate(inflater, container, false);


        ArrayList<Category> categories = getData();
        FlexboxLayoutManager layoutManager = new FlexboxLayoutManager(getContext());
        layoutManager.setFlexDirection(FlexDirection.ROW);
        layoutManager.setJustifyContent(JustifyContent.FLEX_END);
        mBinding.recyclerview.setLayoutManager(layoutManager);
        ExploreRecyclerAdapter adapter = new ExploreRecyclerAdapter(categories);
        adapter.setClickListener(this);
        mBinding.recyclerview.setAdapter(adapter);
        return mBinding.getRoot();
    }

    private ArrayList<Category> getData() {
        ArrayList<Category> categories = new ArrayList<>();
        categories.add(new Category("Arts & Science", "https://source.unsplash.com/random/200x200?sig=1"));
        categories.add(new Category("Business","https://source.unsplash.com/random/200x300?sig=2"));
        categories.add(new Category("Programming", "https://source.unsplash.com/random/200x200?sig=3"));
        categories.add(new Category("Social Science","https://source.unsplash.com/random/300x200?sig=4"));
        categories.add(new Category("IELTS","https://source.unsplash.com/random/200x200?sig=5"));
        categories.add(new Category("GRE", "https://source.unsplash.com/random/400x300?sig=1"));
        categories.add(new Category("Maths and Logic", "https://source.unsplash.com/random/200x200?sig=21"));
        categories.add(new Category("UI/UX Design", "https://source.unsplash.com/random/400x300?sig=3"));
        categories.add(new Category("Graphics Design", "https://source.unsplash.com/random/200x200?sig=4"));
        categories.add(new Category("Health and Medical", "https://source.unsplash.com/random/600x300?sig=2"));
        categories.add(new Category("Data Science", "https://source.unsplash.com/random/300x400?sig=5"));
        categories.add(new Category("Information and Technology", "https://source.unsplash.com/random/200x200?sig=6"));
        categories.add(new Category("Arts & Science", "https://source.unsplash.com/random/300x400?sig=11"));
        categories.add(new Category("Business", "https://source.unsplash.com/random/300x200?sig=6"));
        categories.add(new Category("Programming", "https://source.unsplash.com/random/400x250?sig=12"));
        categories.add(new Category("Social Science","https://source.unsplash.com/random/300x250?sig=7"));
        categories.add(new Category("IELTS","https://source.unsplash.com/random/300x350?sig=10"));

        return categories;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mBinding = null;
    }

    @Override
    public void onItemClick(View view, int position) {
        changeFragment(new ExploreCatagoriesFragment());
    }
    public void changeFragment(Fragment fragment) {
        Fragment newFragment = fragment;
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, newFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
