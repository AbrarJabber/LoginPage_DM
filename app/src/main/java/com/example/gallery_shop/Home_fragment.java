package com.example.gallery_shop;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class Home_fragment extends Fragment {


    private ArrayList<Shopping> shoppingArrayList;
    private String[] shoppingHeading;
    private int[] imageResourceId;
    private RecyclerView recycelerview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        dataInitilize();
        recycelerview = view.findViewById(R.id.recyclerview);
        recycelerview.setLayoutManager(new LinearLayoutManager(getContext()));
        MyAdapter myAdapter = new MyAdapter(getContext(), shoppingArrayList);
        recycelerview.setAdapter(myAdapter);
        myAdapter.notifyDataSetChanged();


    }

    private void dataInitilize() {
        shoppingArrayList = new ArrayList<>();
        shoppingHeading = new String[]{
                getString(R.string.head_1),
                getString(R.string.head_2),
                getString(R.string.head_3),
                getString(R.string.head_4),
                getString(R.string.head_5),
                getString(R.string.head_6)
        };
        imageResourceId = new int[] {
                R.drawable.a,
                R.drawable.b,
                R.drawable.c,
                R.drawable.d,
                R.drawable.e,
                R.drawable.f
        };
        for (int i =0 ; i<shoppingHeading.length ; i++){
            Shopping shopping = new Shopping(shoppingHeading[i], imageResourceId[i]);
            shoppingArrayList.add(shopping);
        }

    }



}