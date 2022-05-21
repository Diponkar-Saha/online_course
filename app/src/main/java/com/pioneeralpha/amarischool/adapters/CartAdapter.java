package com.pioneeralpha.amarischool.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.pioneeralpha.amarischool.R;
import com.pioneeralpha.amarischool.models.CartModel;


import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {
    private Context context;
    private Activity activity;
    List<CartModel> cartModels;
    ViewGroup parent;
    private OnCardListener mOnCardListener;

    public CartAdapter(Activity activity, Context context, List<CartModel> cartModels, OnCardListener onCardListener) {
        this.activity = activity;
        this.context = context;
        this.cartModels = cartModels;
        this.mOnCardListener = onCardListener;
    }

    @NonNull
    @Override
    public CartAdapter.CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_single_cart_layout, parent, false);
        this.parent = parent;
        return new CartViewHolder(view, mOnCardListener);
    }

    @Override
    public void onBindViewHolder(@NonNull CartAdapter.CartViewHolder holder, int position) {
        CartModel cartModel = cartModels.get(position);
        holder.courseTitle.setText(cartModel.getCourseTitle());
       // holder.courseBillTextView.setText(cartModel.getCourseBill());
       // holder.studentsEnrolledTextView.setText(cartModel.getStudentsEnrolled() + " students takes");

        //Picasso.get().load(cartModel.getCourseImg()).placeholder(R.drawable.cart_demo_img).into(holder.courseImg);
        //holder.courseRatingBar.setRating(Float.parseFloat(cartModel.getRating()));
        //holder.ratingTextView.setText(cartModel.getRating());

    }

    @Override
    public int getItemCount() {
        return cartModels.size();
    }

    public class CartViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView courseTitle, courseBillTextView, studentsEnrolledTextView, ratingTextView;
        Button buyNowBtn;
        ImageView cancelBan;
        ImageView courseImg;
        RatingBar courseRatingBar;
        CardView cardView;
        OnCardListener onCardListener;

        public CartViewHolder(@NonNull View itemView, OnCardListener onCardListener) {
            super(itemView);
            this.onCardListener = onCardListener;
            courseTitle = itemView.findViewById(R.id.courseTitle);
//            courseBillTextView = itemView.findViewById(R.id.courseBillTextView);
//            studentsEnrolledTextView = itemView.findViewById(R.id.studentsEnrolledTextView);
//            ratingTextView = itemView.findViewById(R.id.ratingTextView);
            buyNowBtn = itemView.findViewById(R.id.buyNowBtn);
            courseImg = itemView.findViewById(R.id.courseImg);
//            cancelBan = itemView.findViewById(R.id.cancelBan);
//            courseRatingBar = itemView.findViewById(R.id.courseRatingBar);
//            cardView = itemView.findViewById(R.id.cardBtn);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onCardListener.onCardClick(getAdapterPosition());
                }
            });
            buyNowBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onCardListener.onBuyBtnClick(getAdapterPosition());
                }
            });
        }

        @Override
        public void onClick(View v) {

        }
    }

    public interface OnCardListener {
        void onCardClick(int position);

        void onBuyBtnClick(int position);
    }
}
