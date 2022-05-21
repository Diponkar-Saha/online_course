package com.pioneeralpha.amarischool.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.pioneeralpha.amarischool.R;
import com.pioneeralpha.amarischool.databinding.ItemOurProductsBinding;
import com.pioneeralpha.amarischool.models.Product;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class OurProductsRecyclerAdapter extends RecyclerView.Adapter<OurProductsRecyclerAdapter.ProductsViewHolder> {
    private ArrayList<Product> mProducts;

    public static class ProductsViewHolder extends RecyclerView.ViewHolder {
        private ItemOurProductsBinding mBinding;

        public ProductsViewHolder(@NonNull ItemOurProductsBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
        }
    }

    public OurProductsRecyclerAdapter(ArrayList<Product> exampleItems) {
        mProducts = exampleItems;
    }

    @NonNull
    @Override
    public ProductsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new OurProductsRecyclerAdapter.ProductsViewHolder(ItemOurProductsBinding.inflate(
                LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProductsViewHolder holder, int position) {
        Product currentItem = mProducts.get(position);
        Picasso.get()
                .load(currentItem.getPreviewImageUrl()).placeholder(R.drawable.placeholder_loading)
                .error(R.drawable.placeholder_error)
                .into(holder.mBinding.imageView25);

        holder.mBinding.textView23.setText(currentItem.getTitle());
        holder.mBinding.textView22.setText(currentItem.getDescription());
    }

    @Override
    public int getItemCount() {
        // we need to return how many items are there in our array list
        return mProducts.size();
    }
}