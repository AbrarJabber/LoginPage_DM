package com.example.gallery_shop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;

public class MyAdapter<context> extends RecyclerView.Adapter<MyAdapter.Myviewholder>
{
    context context;
    ArrayList<Shopping>shoppingArrayList;

    public MyAdapter(context context,ArrayList<Shopping>shoppingArrayList){
        this.context= context;
        this.shoppingArrayList=shoppingArrayList;
    }


    @NonNull
    @Override
    public Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from((Context) context) .inflate(R.layout.list_item,parent,false);
        return new Myviewholder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull Myviewholder holder, int position) {

        Shopping shopping = shoppingArrayList.get(position);
        //holder.tvheading.(shopping.heading);
        holder.titleImage.setImageResource(shopping.titleImage);
    }

    @Override
    public int getItemCount() {
        return shoppingArrayList.size();
    }

    public static class Myviewholder extends RecyclerView.ViewHolder {

        ShapeableImageView titleImage;
        MaterialTextView tvheading;
        public Myviewholder(@NonNull View itemView) {


            super(itemView);
            titleImage = itemView.findViewById(R.id.title_image);
            tvheading = itemView.findViewById(R.id.tvHeading);
        }
    }
}

