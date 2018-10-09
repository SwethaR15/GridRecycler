package com.example.admin.gridrecycler;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolderClass>{
    Context context;
    int[] img;
    String[]arr;
    public RecyclerAdapter(MainActivity mainActivity, int[] img, String[] arr) {
        context=mainActivity;
        this.img=img;
        this.arr=arr;
    }

    @NonNull
    @Override
    public ViewHolderClass onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.custom_list,viewGroup,false);
        ViewHolderClass viewHolderClass=new ViewHolderClass(view);
        return viewHolderClass;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderClass viewHolderClass, int i) {
        viewHolderClass.txt.setText(arr[i]);
        viewHolderClass.imageView.setImageResource(img[i]);

    }
    @Override
    public int getItemCount() {
        return arr.length;
    }

    public class ViewHolderClass extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView txt;

        public ViewHolderClass(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.image);
            txt=itemView.findViewById(R.id.name);
        }




    }
}
