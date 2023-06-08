package com.example.quoetsapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.MyViewHolder> {

    Context categoryActivity;

    ArrayList<ModalClassCategory> categorylist;

    CategoryIntreface categoryIntreface;
    public CategoryAdapter(CategoryActivity categoryActivity, ArrayList<ModalClassCategory> categorylist, CategoryIntreface categoryIntreface) {
        this.categoryActivity = categoryActivity;
        this.categorylist = categorylist;
        this.categoryIntreface = categoryIntreface ;
    }

    @NonNull
    @Override
    public CategoryAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(categoryActivity).inflate(R.layout.catrgory_item_file,parent,false);
        MyViewHolder m = new MyViewHolder(view);
        return m;

    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.MyViewHolder holder, @SuppressLint("RecyclerView") int position) {


        holder.imgCategory.setImageResource(categorylist.get(position).catrgoryImage);
        holder.txtCategory.setText(categorylist.get(position).catrgory);
        int p;
        p = position;
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                categoryIntreface.CategoryClick(categorylist.get(p).catrgory);



            }
        });




    }

    @Override
    public int getItemCount() {
        return categorylist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txtCategory;

        ImageView imgCategory;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imgCategory=itemView.findViewById(R.id.imgCategory);
            txtCategory=itemView.findViewById(R.id.txtCategory);

        }
    }
}
