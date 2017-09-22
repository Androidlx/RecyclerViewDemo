package com.example.lixin.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by hua on 2017/9/22.
 */

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{



    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate;
        RecyclerView.ViewHolder holder = null;
        switch (viewType){

            case 0:
                inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item1, parent, false);
                holder = new MyViewHolder(inflate);
                break;
            case 1:
                inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item2, parent, false);
                holder = new MyViewHolder2(inflate);
                break;
        }


        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        switch (getItemViewType(position)){
            case 0:
                MyViewHolder holder1 = (MyViewHolder) holder;
                holder1.textViewt.setText("李鑫最帅");
                holder1.img.setImageResource(R.mipmap.ic_launcher);
                break;
            case 1:
                MyViewHolder2 holder2 = (MyViewHolder2) holder;
                holder2.text2.setText("lixin");
                break;
        }
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    @Override
    public int getItemViewType(int position) {
        if (position%2==0){
            return 0;
        }else {
            return 1;
        }
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        private final TextView textViewt;
        private final ImageView img;

        public MyViewHolder(View itemView) {
            super(itemView);
            textViewt = itemView.findViewById(R.id.text);
            img = itemView.findViewById(R.id.img);
        }
    }
    class MyViewHolder2 extends RecyclerView.ViewHolder{

        private final TextView text2;

        public MyViewHolder2(View itemView) {
            super(itemView);
            text2 = itemView.findViewById(R.id.text2);
        }
    }
}
