package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter  extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    int []img1;
    String name[];
    String contact[];
    public CustomAdapter(int []img1, String name[], String contact[]) {

        this.img1=img1;
        this.name=name;
        this.contact=contact;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row_item,parent,false);
        return new ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.imageView.setImageResource(img1[position]);
    holder.txtName.setText("" + name[position]);
    holder.txtContact.setText("" + contact[position]);

    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageView;
        public TextView txtName;
        public TextView txtContact;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.img1);
            txtName=itemView.findViewById(R.id.txt2);
            txtContact=itemView.findViewById(R.id.txt3);

        }
    }

}
