package com.example.nextapp;

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

 public class bs_Adapter extends RecyclerView.Adapter<bs_Adapter.itemViewHolder> {

    private ArrayList<items> itemslist;

    public bs_Adapter(Context context, ArrayList<items> itemslist) {
        this.itemslist = itemslist;
    }


    @Override
    public bs_Adapter.itemViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.bs_items, parent , false);
        return new itemViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull  bs_Adapter.itemViewHolder holder, int position) {
        holder.itemView.setTag(itemslist.get(position));
       holder.tvdesc.setText(itemslist.get(position).getTvdesc());

        if(itemslist.get(position).getIvPref().equals("h1"))
        {
        holder.ivPref.setImageResource(R.drawable.h1);
        }
        else if(itemslist.get(position).getIvPref().equals("h8"))
            {
            holder.ivPref.setImageResource(R.drawable.h8);
        }
        else {
            holder.ivPref.setImageResource(R.drawable.h6);
        }

    }

    @Override
    public int getItemCount() {
        return itemslist.size();
    }

    public class itemViewHolder extends RecyclerView.ViewHolder{
        ImageView ivPref;
        TextView tvdesc;
        public itemViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            ivPref = itemView.findViewById(R.id.ivPref);
            tvdesc =itemView.findViewById(R.id.tvdesc);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }
    }
}
