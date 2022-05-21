package com.pioneeralpha.amarischool.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

import com.google.android.flexbox.FlexboxLayoutManager;
import com.pioneeralpha.amarischool.R;
import com.pioneeralpha.amarischool.databinding.ItemExploreBinding;
import com.pioneeralpha.amarischool.databinding.ItemExploreHeaderBinding;
import com.pioneeralpha.amarischool.models.Category;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class HomeSubcriptionAdapter extends RecyclerView.Adapter<com.pioneeralpha.amarischool.adapters.HomeSubcriptionAdapter.ExploreViewHolder> {

    private final ArrayList<Category> mCategories;
    private HomeSubcriptionAdapter.ItemClickListener mClickListener;
    private static final int HEADER = 1;
    private static final int BODY = 2;


    public class ExploreViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ViewBinding mBinding;

        ExploreViewHolder(@NonNull ViewBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    public HomeSubcriptionAdapter(ArrayList<Category> categories) {
        this.mCategories = categories;

    }


    @Override
    @NonNull
    public HomeSubcriptionAdapter.ExploreViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
//        if (viewType == HEADER) {
//            return new ExploreRecyclerAdapter.ExploreViewHolder(ItemExploreHeaderBinding.inflate(inflater, parent, false));
//        } else {
        return new HomeSubcriptionAdapter.ExploreViewHolder(ItemExploreBinding.inflate(inflater, parent, false));
        //  }

    }

    @Override
    public void onBindViewHolder(@NonNull HomeSubcriptionAdapter.ExploreViewHolder holder, int position) {
//        if (holder.mBinding instanceof ItemExploreHeaderBinding) {
//
//        } else {
        Picasso.get().load(mCategories.get(position).getImage())
                .placeholder(R.drawable.placeholder_loading)
                .error(R.drawable.placeholder_error)
                .into(((ItemExploreBinding) holder.mBinding).imageview);
        ((ItemExploreBinding) holder.mBinding).textView.setText(mCategories.get(position).getName());
        ViewGroup.LayoutParams lp = ((ItemExploreBinding) holder.mBinding).root.getLayoutParams();
        if (lp instanceof FlexboxLayoutManager.LayoutParams) {
            ((FlexboxLayoutManager.LayoutParams) lp).setFlexGrow(1f);
        }
        // }


    }

    @Override
    public int getItemViewType(int position) {
//        if (position == 0) {
//            return HEADER;
//        }
        return BODY;
    }

    @Override
    public int getItemCount() {
        return mCategories.size();
    }

    public void setClickListener(HomeSubcriptionAdapter.ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}