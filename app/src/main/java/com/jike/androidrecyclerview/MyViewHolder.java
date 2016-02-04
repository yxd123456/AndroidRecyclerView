package com.jike.androidrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/2/4.
 */
class MyViewHolder extends RecyclerView.ViewHolder {
    TextView tv1;
    TextView tv2;
    View root;

    public MyViewHolder(View itemView) {
        super(itemView);
        root = itemView;
        tv1 = (TextView) root.findViewById(R.id.textView);
        tv2 = (TextView) root.findViewById(R.id.textView2);
    }

    public TextView getTv1() {
        return tv1;
    }

    public TextView getTv2() {
        return tv2;
    }
}
