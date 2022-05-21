package com.pioneeralpha.amarischool.adapters;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager.widget.ViewPager;

import com.google.android.flexbox.FlexDirection;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.flexbox.JustifyContent;
import com.pioneeralpha.amarischool.R;

import com.pioneeralpha.amarischool.databinding.ItemExploreBinding;
import com.pioneeralpha.amarischool.databinding.ItemHomeBetaVersionBinding;
import com.pioneeralpha.amarischool.databinding.ItemHomeContentGridBinding;
import com.pioneeralpha.amarischool.databinding.ItemHomeContentListBinding;
import com.pioneeralpha.amarischool.databinding.ItemHomeCourseMoreButtonBinding;
import com.pioneeralpha.amarischool.databinding.ItemHomeSearchBoxBinding;
import com.pioneeralpha.amarischool.databinding.ItemHomeTitleImageBinding;
import com.pioneeralpha.amarischool.databinding.ItemHomeTitleTextBinding;
import com.pioneeralpha.amarischool.databinding.SubscriptionHomeBinding;
import com.pioneeralpha.amarischool.databinding.SubscriptionMoreButtonBinding;
import com.pioneeralpha.amarischool.models.Category;
import com.pioneeralpha.amarischool.models.Image;
import com.pioneeralpha.amarischool.models.SubscriptionItem;
import com.pioneeralpha.amarischool.ui.home.model.CourseItem;
import com.pioneeralpha.amarischool.ui.home.model.HeaderItem;
import com.pioneeralpha.amarischool.ui.home.model.HomeItems;
import com.pioneeralpha.amarischool.ui.home.model.MoreButtonItem;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class HomeRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>  {
    private final ArrayList<HomeItems> mHomeItems;
    private final static int TYPE_TITLE_IMAGE = 1;
    private final static int TYPE_SEARCH_BOX = 2;
    private final static int TYPE_COURSE_CATEGORY = 3;
    private final static int TYPE_COURSE_LIST = 4;
    private final static int TYPE_COURSE_MORE_BUTTON = 5;
    private final static int TYPE_COURSE_SUBSCRIPTION_BUTTON = 8;
    private final static int TYPE_bug_BUTTON = 9;
    private final static int TYPE_SUBSCRIPTION_BUTTON = 7;
    private final static int  TYPE_VIEWPAGER = 6;
    private final static int VIEW_STYLE_LIST = 1;
    private final static int VIEW_STYLE_GRID = 0;

    private final int mViewStyle;
    private String mUsername;
    private Context mContext;
    private OnItemClickListener mListener;



    Runnable runnable;
    Handler handler;

    private int[] array_image_place = {
            R.drawable.ppmm,
            R.drawable.uu,
            R.drawable.pu,
            R.drawable.pi4,
            R.drawable.pi5,
            R.drawable.pi6,
    };

    private LinearLayout layout_dots;
    private ViewPager viewPager,v1,v2;
    private AdapterImageSlider adapterImageSlider;




    public interface OnItemClickListener {
        void onSwitchViewStyleClick();
        void onmoreClick();
        void onsubsClick();

        void onSubscribemoreClick();

        void onBugSubmitClick();
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    public static class TitleImageViewHolder extends RecyclerView.ViewHolder {
        private final ItemHomeTitleImageBinding mBinding;


        public TitleImageViewHolder(ItemHomeTitleImageBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
        }
    }

    public static class SearchBoxViewHolder extends RecyclerView.ViewHolder {
        private final com.pioneeralpha.amarischool.databinding.ItemHomeSearchBoxBinding mBinding;
        private OnItemClickListener mListener;

        public SearchBoxViewHolder(ItemHomeSearchBoxBinding binding, final OnItemClickListener listener) {
            super(binding.getRoot());
            mBinding = binding;
            mListener = listener;

        }
    }

    public static class CourseCategoryViewHolder extends RecyclerView.ViewHolder {
        private final ItemHomeTitleTextBinding mBinding;

        public CourseCategoryViewHolder(ItemHomeTitleTextBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
        }
    }
    public static class SUBSCRIPTIONButtonViewHolder extends RecyclerView.ViewHolder {
        private final SubscriptionHomeBinding mBinding;
        private OnItemClickListener mListener;

        public SUBSCRIPTIONButtonViewHolder(SubscriptionHomeBinding binding, final OnItemClickListener listener) {
            super(binding.getRoot());
            mBinding = binding;
            mListener = listener;
        }
    }

    public static class CourseMoroButtonViewHolder extends RecyclerView.ViewHolder {
        private final ItemHomeCourseMoreButtonBinding mBinding;
        private OnItemClickListener mListener;

        public CourseMoroButtonViewHolder(ItemHomeCourseMoreButtonBinding binding, final OnItemClickListener listener) {
            super(binding.getRoot());
            mBinding = binding;
            mListener = listener;
        }
    }
    public static class CourseBugButtonViewHolder extends RecyclerView.ViewHolder {
        private final ItemHomeBetaVersionBinding mBinding;
        private OnItemClickListener mListener;

        public CourseBugButtonViewHolder(ItemHomeBetaVersionBinding binding, final OnItemClickListener listener) {
            super(binding.getRoot());
            mBinding = binding;
            mListener = listener;
        }
    }

    public static class SubscriptionMoreButtonViewHolder extends RecyclerView.ViewHolder {
        private final SubscriptionMoreButtonBinding mBinding;
        private OnItemClickListener mListener;

        public SubscriptionMoreButtonViewHolder(SubscriptionMoreButtonBinding binding, final OnItemClickListener listener) {
            super(binding.getRoot());
            mBinding = binding;
            mListener = listener;
        }
    }



    public static class ContentViewHolder extends RecyclerView.ViewHolder {
        private final ViewBinding mBinding;

        public ContentViewHolder(ViewBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
        }
    }

    public HomeRecyclerAdapter(ArrayList<HomeItems> exampleItems, int viewType, String username) {
        mHomeItems = exampleItems;
        mViewStyle = viewType;
        mUsername = username;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        switch (viewType) {
            case TYPE_TITLE_IMAGE:
                return new TitleImageViewHolder(ItemHomeTitleImageBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
            case TYPE_SEARCH_BOX:
                return new SearchBoxViewHolder(ItemHomeSearchBoxBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false), mListener);
            case TYPE_COURSE_CATEGORY:
                return new CourseCategoryViewHolder(ItemHomeTitleTextBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
            case TYPE_COURSE_LIST:
                if (mViewStyle == VIEW_STYLE_LIST) {
                    System.out.println("changing the list view: ItemHomeContentListBinding");
                    return new ContentViewHolder(ItemHomeContentListBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
                } else {
                    System.out.println("changing the list view: ItemHomeContentGridBinding");
                    return new ContentViewHolder(ItemHomeContentGridBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
                }
            case TYPE_COURSE_MORE_BUTTON:
                return new CourseMoroButtonViewHolder(ItemHomeCourseMoreButtonBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false),mListener);

            case TYPE_COURSE_SUBSCRIPTION_BUTTON:
                return new SubscriptionMoreButtonViewHolder(SubscriptionMoreButtonBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false),mListener);

            case TYPE_SUBSCRIPTION_BUTTON:
                return new SUBSCRIPTIONButtonViewHolder(SubscriptionHomeBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false),mListener);


            case TYPE_VIEWPAGER:
                return new ContentViewHolder(ItemHomeTitleImageBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

            case TYPE_bug_BUTTON:
                return new CourseBugButtonViewHolder(ItemHomeBetaVersionBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false),mListener);

        }
        return new ContentViewHolder(ItemHomeContentListBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()) {
            case TYPE_TITLE_IMAGE:
                ((TitleImageViewHolder) holder).mBinding.userName.setText(mUsername);

                TitleImageViewHolder h1 = (TitleImageViewHolder) holder;
                handler = new Handler();
                layout_dots =h1.mBinding.layoutDots;
                viewPager = h1.mBinding.pager;
                v1 = h1.mBinding.pager1;
                v2 = h1.mBinding.pager2;
                adapterImageSlider = new AdapterImageSlider(mContext, new ArrayList());

                final List items = new ArrayList<>();
                for (int i = 0; i < array_image_place.length; i++) {
                    Image obj = new Image();
                    obj.image = array_image_place[i];
                    obj.imageDrw = mContext.getResources().getDrawable(obj.image);
                    items.add(obj);
                }

                adapterImageSlider.setItems(items);
                viewPager.setAdapter(adapterImageSlider);
                viewPager.setBackgroundColor(Color.BLACK);
                v1.setAdapter(adapterImageSlider);
                v2.setAdapter(adapterImageSlider);

                // displaying selected image first
                viewPager.setCurrentItem(0);

                v1.setCurrentItem(1);
                v2.setCurrentItem(2);

                addBottomDots(layout_dots, adapterImageSlider.getCount(), 0);
                viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                    @Override
                    public void onPageScrolled(int pos, float positionOffset, int positionOffsetPixels) {
                    }

                    @Override
                    public void onPageSelected(int pos) {
                        addBottomDots(layout_dots, adapterImageSlider.getCount(), pos);
                    }

                    @Override
                    public void onPageScrollStateChanged(int state) {
                    }
                });

                v1.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                    @Override
                    public void onPageScrolled(int pos, float positionOffset, int positionOffsetPixels) {
                    }

                    @Override
                    public void onPageSelected(int pos) {
                        addBottomDots(layout_dots, adapterImageSlider.getCount(), pos);
                    }

                    @Override
                    public void onPageScrollStateChanged(int state) {
                    }
                });
                v2.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                    @Override
                    public void onPageScrolled(int pos, float positionOffset, int positionOffsetPixels) {
                    }

                    @Override
                    public void onPageSelected(int pos) {
                        addBottomDots(layout_dots, adapterImageSlider.getCount(), pos);
                    }

                    @Override
                    public void onPageScrollStateChanged(int state) {
                    }
                });

                startAutoSlider(adapterImageSlider.getCount());


                break;

            case TYPE_SEARCH_BOX:
                SearchBoxViewHolder h = (SearchBoxViewHolder) holder;
                // changing button icon style
                if (mViewStyle == VIEW_STYLE_LIST) {
                    h.mBinding.buttonImage.setImageDrawable((Drawable)
                            ResourcesCompat.getDrawable(mContext.getResources(), R.drawable.ic_sort_list, null));
                } else {
                    h.mBinding.buttonImage.setImageDrawable((Drawable)
                            ResourcesCompat.getDrawable(mContext.getResources(), R.drawable.ic_sort_grid, null));
                }
                h.mBinding.textInputLayout.setOnKeyListener((v, keyCode, event) -> false);
                h.mBinding.button.setOnClickListener(v -> {
                    if (mListener != null) {
                        if (mViewStyle == VIEW_STYLE_LIST) {
                            System.out.println("changing the list view: VIEW_STYLE_GRID");
                        } else {
                            System.out.println("changing the list view: VIEW_STYLE_LIST");
                        }
                        Toast.makeText(mContext, "changing adapter", Toast.LENGTH_SHORT).show();

                        mListener.onSwitchViewStyleClick();
                    }
                });
                break;
            case TYPE_COURSE_CATEGORY:
                HeaderItem headerItem = (HeaderItem) mHomeItems.get(position);
                ((CourseCategoryViewHolder) holder).mBinding.coursesCategoryName.setText(headerItem.getName());

                break;
            case TYPE_COURSE_MORE_BUTTON:
                MoreButtonItem moreButtonItem = (MoreButtonItem) mHomeItems.get(position);
                ((CourseMoroButtonViewHolder) holder).mBinding.coursesMoreButton.setText(moreButtonItem.getName());
                CourseMoroButtonViewHolder hh = (CourseMoroButtonViewHolder) holder;
                hh.mBinding.coursesMoreButton.setOnClickListener(v -> {
                    mListener.onmoreClick();

                });

                break;
            case TYPE_COURSE_SUBSCRIPTION_BUTTON:
                MoreButtonItem moreButtonItem1 = (MoreButtonItem) mHomeItems.get(position);
                ((SubscriptionMoreButtonViewHolder) holder).mBinding.coursesMoreButton.setText(moreButtonItem1.getName());
                SubscriptionMoreButtonViewHolder hh3 = (SubscriptionMoreButtonViewHolder) holder;
                hh3.mBinding.coursesMoreButton.setOnClickListener(v -> {
                    mListener.onSubscribemoreClick();

                });

                break;

            case TYPE_SUBSCRIPTION_BUTTON:
                SubscriptionItem subscriptionItem = (SubscriptionItem) mHomeItems.get(position);
                RecyclerView.LayoutManager exlayoutManager;
                RecyclerView exrecyclerView;
                SUBSCRIPTIONButtonViewHolder hh1 = (SUBSCRIPTIONButtonViewHolder ) holder;

               // ArrayList<Category> categories = getData();
                FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(mContext);
                flexboxLayoutManager.setFlexDirection(FlexDirection.ROW);
                flexboxLayoutManager.setJustifyContent(JustifyContent.FLEX_END);
                SubscriptionHomeBinding exbinding = (SubscriptionHomeBinding) hh1.mBinding;

                exbinding.recyclerview.setLayoutManager(flexboxLayoutManager);
                HomeSubcriptionAdapter exploreRecyclerAdapter = new HomeSubcriptionAdapter(subscriptionItem.getCategories());


                //adapter.setClickListener(this);
                exbinding.recyclerview.setAdapter(exploreRecyclerAdapter);
               // SUBSCRIPTIONButtonViewHolder hh1 = (SUBSCRIPTIONButtonViewHolder ) holder;
//                hh1.mBinding.subscriptionCon.setOnClickListener(v -> {
//                    mListener.onsubsClick();
//
//                });


                break;

            case TYPE_COURSE_LIST:
                CourseItem courseList = (CourseItem) mHomeItems.get(position);
                CoursesRecyclerAdapter adapter;
                RecyclerView.LayoutManager layoutManager;
                RecyclerView recyclerView;
                ContentViewHolder cHolder = (ContentViewHolder) holder;
                if (mViewStyle == VIEW_STYLE_LIST) {
                    ItemHomeContentListBinding binding = (ItemHomeContentListBinding) cHolder.mBinding;
                    recyclerView = binding.coursesRecyclerView;
                    layoutManager = new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false);
                } else {
                    ItemHomeContentGridBinding binding = (ItemHomeContentGridBinding) cHolder.mBinding;
                    recyclerView = binding.coursesRecyclerView;
                    layoutManager = new LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false);
                }

                adapter = new CoursesRecyclerAdapter(courseList.getCourseList(), mViewStyle,courseList.getListener());
                recyclerView.setLayoutManager(layoutManager);
                recyclerView.setAdapter(adapter);

                break;

            case TYPE_bug_BUTTON:
               // CourseBugButtonViewHolder bugButtonItem = (MoreButtonItem) mHomeItems.get(position);
                //((CourseBugButtonViewHolder) holder).mBinding.coursesBugSubmitButton.setText(moreButtonItem.getName());
                CourseBugButtonViewHolder bugbt = (CourseBugButtonViewHolder) holder;
                String blueString= "<font color='#0000FF'><u><b>Here!</b></u></font>";
                String blackString = "<font color='#000000'>Beta version of our app. If you submit more than 30 bugs, you can join any of our courses without payment;report your bug </font>";
                //test.setText(Html.fromHtml(redString + blackString));
                //Beta version of our app. If you submit more than 30 bugs, you can join any of our courses without payment;report your bug "
                bugbt.mBinding.coursesMoreButton.setText(fromHtml(blackString+blueString));
                bugbt.mBinding.coursesMoreButton.setOnClickListener(v -> {
                    mListener.onBugSubmitClick();

                });


                break;

        }

    }

    private void startBannerSlider() {

    }


    @Override
    public int getItemCount() {
        return mHomeItems.size();
    }

    @Override
    public int getItemViewType(int position) {
        return mHomeItems.get(position).getItemType();

    }

    private void startAutoSlider(final int count) {
        runnable = new Runnable() {
            @Override
            public void run() {
                int pos = viewPager.getCurrentItem();
                int pos1 = v1.getCurrentItem();
                int pos2 = v2.getCurrentItem();
                pos = pos + 1;
                pos1 = pos1 + 1;
                pos2 = pos2 + 1;
                if (pos >= count) pos = 0;
                if (pos1 >= count) pos1 = 0;
                if (pos2 >= count) pos2 = 0;
                viewPager.setCurrentItem(pos);
                v1.setCurrentItem(pos1);
                v2.setCurrentItem(pos2);
                handler.postDelayed(runnable, 3000);
            }
        };
        handler.postDelayed(runnable, 3000);

    }

    private void addBottomDots(LinearLayout layout_dots, int size, int current) {
        ImageView[] dots = new ImageView[size];

        layout_dots.removeAllViews();
        for (int i = 0; i < dots.length; i++) {
            dots[i] = new ImageView(mContext);
            int width_height = 18;
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(new ViewGroup.LayoutParams(width_height, width_height));
            params.setMargins(8, 0, 8, 0);
            dots[i].setLayoutParams(params);
            dots[i].setImageResource(R.drawable.circle_outline);
            dots[i].setColorFilter(ContextCompat.getColor(mContext, R.color.grey40), PorterDuff.Mode.SRC_ATOP);
            layout_dots.addView(dots[i]);
        }

        if (dots.length > 0) {
            dots[current].setImageResource(R.drawable.circle_shape);
            dots[current].setColorFilter(ContextCompat.getColor(mContext, R.color.circleColor), PorterDuff.Mode.SRC_ATOP);
        }
    }

    public static Spanned fromHtml(String source) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return Html.fromHtml(source, Html.FROM_HTML_MODE_LEGACY);
        } else {
            return Html.fromHtml(source);
        }
    }


}