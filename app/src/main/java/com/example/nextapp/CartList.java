package com.example.nextapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class CartList extends RecyclerView.Adapter<CartList.CartViewHolder> {
    private ArrayList<items> arrayList;
    Context context;

    public CartList(ArrayList<items> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public CartList.CartViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_list, parent , false);
        return new CartViewHolder(v);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull CartList.CartViewHolder holder, int position) {
        holder.itemView.setTag(arrayList.get(position));
        holder.tvCart.setText(arrayList.get(position).getTvdesc());
        if(arrayList.get(position).getIvPref().equals("h1"))
        {
            holder.ivCart.setImageResource(R.drawable.h1);
        }
        else if(arrayList.get(position).getIvPref().equals("h2")) {
            holder.ivCart.setImageResource(R.drawable.h2);
        }

        else if(arrayList.get(position).getIvPref().equals("h7"))
        {
            holder.ivCart.setImageResource(R.drawable.h7);
        }
        else {
            holder.ivCart.setImageResource(R.drawable.h6);
        }
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class CartViewHolder extends RecyclerView.ViewHolder {
        ImageView ivCart;
        TextView tvCart;
        public CartViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
