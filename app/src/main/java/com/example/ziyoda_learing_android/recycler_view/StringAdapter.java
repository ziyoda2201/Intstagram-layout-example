package com.example.ziyoda_learing_android.recycler_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.solver.state.State;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ziyoda_learing_android.R;

import java.util.List;

public  class StringAdapter extends RecyclerView.Adapter<StringAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<String> data;

    StringAdapter(Context context, List<String> data) {
        this.data = data;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public StringAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item_name, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(StringAdapter.ViewHolder holder, int position) {
       String name = data.get(position);
        holder.nameView.setText(name);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView nameView;
        ViewHolder(View view){
            super(view);
            nameView = view.findViewById(R.id.nameTxT);
        }
    }
}