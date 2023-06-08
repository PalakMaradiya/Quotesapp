package com.example.quoetsapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class QuotesAdapter extends RecyclerView. Adapter<QuotesAdapter.MyViewHolder> {

    Context quoetsActivity;

    ArrayList<ModalClassQuetes> quoteslist;

    QuotesInterface quotesInterface;
    public QuotesAdapter(QuoetsActivity quoetsActivity, ArrayList<ModalClassQuetes> quoteslist, QuotesInterface quotesInterface) {

        this.quoetsActivity = quoetsActivity;
        this.quoteslist = quoteslist;
        this.quotesInterface = quotesInterface ;
    }

    @NonNull
    @Override
    public QuotesAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(quoetsActivity).inflate(R.layout.quotes_item_file,parent,false);
        MyViewHolder m = new MyViewHolder(view);
        return m;
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull QuotesAdapter.MyViewHolder holder, int position) {



        int p ;
        p = position ;

        holder.txtQuotes.setText(quoteslist.get(position).Quoets);
//        holder.imgQuetos.setImageResource(quoteslist.get(position).img);


        holder.imgCopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                quotesInterface.Clickcopy(quoteslist.get(p).Quoets);




            }
        });

        holder.imgShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                quotesInterface.Clickshare(quoteslist.get(p).Quoets);

            }
        });


//        holder.imgDwonlod.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                quotesInterface.ClickDwonalod(quoteslist.get(p).Quoets);
//            }
//        });



    }

    @Override
    public int getItemCount() {
        return quoteslist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txtQuotes;

        ImageView imgCopy , imgShare , imgDwonlod;

//        ImageView imgQuetos;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtQuotes = itemView.findViewById(R.id.txtQuotes);
            imgDwonlod = itemView.findViewById(R.id.imgDwonlod);
            imgCopy = itemView.findViewById(R.id.imgCopy);
            imgShare = itemView.findViewById(R.id.imgShare);
//            imgQuetos = itemView.findViewById(R.id.imgQuetos);
        }
    }
}
