package com.pioneeralpha.amarischool.ui.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pioneeralpha.amarischool.MoreCourseFragment;
import com.pioneeralpha.amarischool.R;
import com.pioneeralpha.amarischool.adapters.CoursesRecyclerAdapter;
import com.pioneeralpha.amarischool.adapters.HomeRecyclerAdapter;
import com.pioneeralpha.amarischool.databinding.FragmentHomeBinding;
import com.pioneeralpha.amarischool.models.Category;
import com.pioneeralpha.amarischool.models.Course;
import com.pioneeralpha.amarischool.models.SubscriptionItem;
import com.pioneeralpha.amarischool.ui.aboutCourse.AboutCourseFragment;
import com.pioneeralpha.amarischool.ui.home.model.CourseItem;
import com.pioneeralpha.amarischool.ui.home.model.HeaderItem;
import com.pioneeralpha.amarischool.ui.home.model.HomeItems;
import com.pioneeralpha.amarischool.ui.home.model.MoreButtonItem;
import com.pioneeralpha.amarischool.ui.menu.subscription.SubscriptionFragment;
import com.pioneeralpha.amarischool.ui.menu.webview.WebviewMenuitemActivity;

import java.util.ArrayList;


public class HomeFragment extends Fragment implements CoursesRecyclerAdapter.OnItemClickListener{
    private FragmentHomeBinding mBinding;
    private HomeRecyclerAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private final static int TYPE_TITLE_IMAGE = 1;
    private final static int TYPE_SEARCH_BOX = 2;
    private final static int TYPE_COURSE_CATEGORY = 3;
    private final static int TYPE_COURSE_LIST = 4;
    private final static int TYPE_COURSE_MORE_BUTTON = 5;
    private final static int TYPE_VIEWPAGER = 6;
    private final static int TYPE_SUBSCRIPTION_BUTTON = 7;
    private final static int TYPE_COURSE_SUBSCRIPTION_BUTTON = 8;
    private final static int TYPE_bug_BUTTON = 9;
    private final static int VIEW_TYPE_LIST = 1;
    private final static int VIEW_TYPE_GRID = 0;

    private int mCurrentViewStyle = VIEW_TYPE_LIST;
    private HomeFragmentListener mListener;
    private String mUsername;

    public HomeFragment(int currentViewStyle, String username) {
        mCurrentViewStyle = currentViewStyle;
        mUsername = username;
    }

    @Override
    public void onItemClick(int position) {
        changeFragment(new AboutCourseFragment());

    }

    public interface HomeFragmentListener {
        void onSwitchViewStyle(int viewStyle);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = FragmentHomeBinding.inflate(inflater, container, false);

        mLayoutManager = new LinearLayoutManager(this.getContext());
        mAdapter = new HomeRecyclerAdapter(getItemList(), mCurrentViewStyle, mUsername);
        mBinding.mainRecyclerView.setLayoutManager(mLayoutManager);
        mBinding.mainRecyclerView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new HomeRecyclerAdapter.OnItemClickListener() {
            @Override
            public void onSwitchViewStyleClick() {
                if (mCurrentViewStyle == VIEW_TYPE_LIST) {
                    // change to grid view
                    //Toast.makeText(getContext(), "changing to grid view", Toast.LENGTH_SHORT).show();
                    mListener.onSwitchViewStyle(VIEW_TYPE_GRID);
                } else {
                    //Toast.makeText(getContext(), "changing to list view", Toast.LENGTH_SHORT).show();
                    mListener.onSwitchViewStyle(VIEW_TYPE_LIST);
                }
            }

            @Override
            public void onmoreClick() {

                Fragment newFragment = new MoreCourseFragment();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, newFragment);
                transaction.addToBackStack(null);
                transaction.commit();

            }

            @Override
            public void onsubsClick() {
                changeFragment(new SubscriptionFragment());
            }

            @Override
            public void onSubscribemoreClick() {
                changeFragment(new SubscriptionFragment());
            }

            @Override
            public void onBugSubmitClick() {

                Intent startMapIntent = new Intent(getActivity(), WebviewMenuitemActivity.class);
                startMapIntent.putExtra("itemName", "bug");
                startActivity(startMapIntent);
            }
        });



        return mBinding.getRoot();
    }

    private ArrayList<HomeItems> getItemList() {
        ArrayList<HomeItems> itemList = new ArrayList<>();

        itemList.add(new HeaderItem(null, TYPE_TITLE_IMAGE));

        //itemList.add(new SliderItem(TYPE_VIEWPAGER,getSliderList()));


        itemList.add(new HeaderItem(null, TYPE_SEARCH_BOX));

        itemList.add(new HeaderItem("All Courses", TYPE_COURSE_CATEGORY));
        itemList.add(new CourseItem(TYPE_COURSE_LIST, getCourseList(),this));
        itemList.add(new MoreButtonItem("View All", TYPE_COURSE_MORE_BUTTON));

        itemList.add(new HeaderItem("Subscription", TYPE_COURSE_CATEGORY));

        itemList.add(new SubscriptionItem( TYPE_SUBSCRIPTION_BUTTON,getData()));
        itemList.add(new MoreButtonItem("View All", TYPE_COURSE_SUBSCRIPTION_BUTTON));


        itemList.add(new HeaderItem("Updated Courses", TYPE_COURSE_CATEGORY));
        itemList.add(new CourseItem(TYPE_COURSE_LIST, getCourseList(),this));
        itemList.add(new MoreButtonItem("More", TYPE_COURSE_MORE_BUTTON));

        itemList.add(new HeaderItem("Latest Courses", TYPE_COURSE_CATEGORY));
        itemList.add(new CourseItem(TYPE_COURSE_LIST, getCourseList(),this));
        itemList.add(new MoreButtonItem("More", TYPE_COURSE_MORE_BUTTON));


        return itemList;
    }

    private ArrayList<Category> getData() {
        ArrayList<Category> categories = new ArrayList<>();

        categories.add(new Category("Business","https://source.unsplash.com/random/200x300?sig=1"));
        categories.add(new Category("Programming", "https://source.unsplash.com/random/200x200?sig=2"));
        categories.add(new Category("Social Science","https://source.unsplash.com/random/300x200?sig=3"));
        categories.add(new Category("IELTS","https://source.unsplash.com/random/200x200?sig=4"));


        return categories;

    }



    private ArrayList<Course> getCourseList() {
        ArrayList<Course> courseItems = new ArrayList<>();
        courseItems.add(new Course("Complete Graphic Design Course", 468, "5 months", 4.5, "4600", "https://source.unsplash.com/random/200x200?sig=1"));
        courseItems.add(new Course("Competitive Programming", 468, "5 months", 4.5, "4600", "https://source.unsplash.com/random/200x200?sig=2"));
        courseItems.add(new Course("Introduction to data structure ", 468, "5 months", 4.5, "4600", "https://source.unsplash.com/random/200x200?sig=3"));
        courseItems.add(new Course("Complete Graphic Design Course", 468, "5 months", 4.5, "4600", "https://source.unsplash.com/random/200x200?sig=5"));
        courseItems.add(new Course("Competitive Programming", 468, "5 months", 4.5, "4600", "https://source.unsplash.com/random/200x200?sig=6"));
        courseItems.add(new Course("Introduction to data structure ", 468, "5 months", 4.5, "4600", "https://source.unsplash.com/random/200x200?sig=7"));
        return courseItems;
    }

    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof HomeFragmentListener) {
            mListener = (HomeFragmentListener) context;
        } else {
            throw new RuntimeException(context.toString());
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        //mBinding = null;
        //mListener = null;
    }

    public void changeFragment(Fragment fragment) {
        Fragment newFragment = fragment;
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, newFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }



}
