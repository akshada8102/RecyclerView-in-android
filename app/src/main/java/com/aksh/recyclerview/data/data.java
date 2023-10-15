package com.aksh.recyclerview.data;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aksh.recyclerview.R;
import com.aksh.recyclerview.model.item;

import java.util.List;


public class data extends RecyclerView.Adapter<data.ViewHolder> {
    Context context;
    List<item> ll;

    public data(Context context, List<item> ll) {
        this.context = context;
        this.ll = ll;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.data,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.name.setText(ll.get(position).getName());
        holder.occupation.setText(ll.get(position).getOccupation());

    }

    @Override
    public int getItemCount() {
        return ll.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public  TextView occupation;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name=itemView.findViewById(R.id.name);
            occupation=itemView.findViewById(R.id.occupation);


        }
    }


}
