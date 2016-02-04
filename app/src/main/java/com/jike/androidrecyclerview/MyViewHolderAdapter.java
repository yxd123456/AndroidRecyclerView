package com.jike.androidrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/2/4.
 */
class MyViewHolderAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private MainActivity mainActivity;

    private CellData[] datas = new CellData[]{
            new CellData("1", "2"),
            new CellData("1", "2"),
            new CellData("1", "2"),
            new CellData("1", "2"),
            new CellData("1", "2"),
            new CellData("1", "2"),
            new CellData("1", "2"),
            new CellData("1", "2"),
            new CellData("1", "2"),
            new CellData("1", "2"),
    };

    public MyViewHolderAdapter(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext())
        .inflate(R.layout.my_cell, null));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
            holder.getTv1().setText(datas[position].getTitle());
            holder.getTv2().setText(datas[position].getContent());
    }

    @Override
    public int getItemCount() {
        return datas.length;
    }
}
