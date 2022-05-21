package com.pioneeralpha.amarischool.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;
import com.pioneeralpha.amarischool.models.WishListModel;
import com.pioneeralpha.amarischool.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class WishListAdapter extends RecyclerView.Adapter<WishListAdapter.WishlistViewHolder> {
    ViewGroup parent;
    private Context context;
    private Activity activity;
    List<WishListModel> wishListModels;
    private WishListAdapter.OnWishListCardListener onWishListCardListener;

    public WishListAdapter(FragmentActivity activity, Context context, List<WishListModel> wishListModels, WishListAdapter.OnWishListCardListener onCardListener) {
        this.activity = activity;
        this.context = context;
        this.wishListModels = wishListModels;
        this.onWishListCardListener = onCardListener;

    }

    @NonNull
    @Override
    public WishlistViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_single_wishlist_layout, parent, false);
        this.parent = parent;
        return new WishListAdapter.WishlistViewHolder(view, onWishListCardListener);
    }

    @Override
    public void onBindViewHolder(@NonNull WishlistViewHolder holder, int position) {
        WishListModel wishListModel = wishListModels.get(position);
        holder.courserTitle.setText(wishListModel.getCourseTitle());
        holder.courseBillTextView.setText(wishListModel.getCourseBill());
       // Picasso.get().load(wishListModel.getCourseImg()).placeholder(R.drawable.cart_demo_img).into(holder.courseImg);
    }

    @Override
    public int getItemCount() {
        return wishListModels.size();
    }

    class WishlistViewHolder extends RecyclerView.ViewHolder {
        ShapeableImageView courseImg;
        TextView courserTitle, courseBillTextView;
        OnWishListCardListener onWishListCardListener;
        Button addToCartBtn, wishListCancelBan;

        public WishlistViewHolder(@NonNull View itemView, OnWishListCardListener onWishListCardListener) {
            super(itemView);
            this.onWishListCardListener = onWishListCardListener;
            //courseImg = itemView.findViewById(R.id.courseImg);
            courserTitle = itemView.findViewById(R.id.courseTitle);
            courseBillTextView = itemView.findViewById(R.id.courseBillTextView);
//            wishListCancelBan = itemView.findViewById(R.id.wishListCancelBan);
//            addToCartBtn = itemView.findViewById(R.id.addToCartBtn);
        }
    }

    public interface OnWishListCardListener {
        void onCardClick(int position);

        void onBuyBtnClick(int position);
    }


}
