package com.example.movie;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ProductViewHolder> {

    public ArrayList<ProdectModel> productList;
    public ProductViewHolder.OnListClickListener onListClickListener;
    @NonNull
    @Override
    public  ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_sample_layout,parent,false);
        ProductViewHolder viewHolder = new ProductViewHolder(v,onListClickListener);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        ProdectModel item = productList.get(position);

        holder.image.setImageResource(item.getImage());
        holder.price.setText(item.getPrice());
        holder.name.setText(item.getName());
        holder.code.setText(item.getCode());


    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView image;
        TextView name,price,code;
        OnListClickListener onListClickListener;

        public ProductViewHolder(@NonNull View itemView,OnListClickListener onListClickListener) {
            super(itemView);

            image = itemView.findViewById(R.id.image_id);
            name = itemView.findViewById(R.id.name_Id);
            price = itemView.findViewById(R.id.price_Id);
            code = itemView.findViewById(R.id.code_Id);
            this.onListClickListener = onListClickListener;
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            onListClickListener.onListClick(getAdapterPosition());
        }

        public interface OnListClickListener{
            void onListClick(int position);
        }
    }

    public RecyclerViewAdapter(ArrayList<ProdectModel> productList, ProductViewHolder.OnListClickListener onListClickListener) {
        this.productList = productList;
        this.onListClickListener = onListClickListener;
    }
}
