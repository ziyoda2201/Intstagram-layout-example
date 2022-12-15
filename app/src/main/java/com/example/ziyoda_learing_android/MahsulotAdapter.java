package com.example.ziyoda_learing_android;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public  class MahsulotAdapter extends RecyclerView.Adapter<MahsulotAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<ProductModel> mahsulotlarList;

    MahsulotAdapter(Context context, List<ProductModel> mahsulotlarList) {
        this.mahsulotlarList = mahsulotlarList;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public MahsulotAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item_mahsulot, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MahsulotAdapter.ViewHolder holder, int position) {
        ProductModel product = mahsulotlarList.get(position);
        holder.mAhSuLoTnOmI.setText(product.getNomi());
        holder.mAhSuLoTsAnAsI.setText(product.getSanasi());
        holder.mAhSuLoTnArXi.setText(String.valueOf(product.getNarxi()));
    }

    @Override
    public int getItemCount() {
        return mahsulotlarList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        final TextView mAhSuLoTnOmI, mAhSuLoTsAnAsI,mAhSuLoTnArXi;
        ViewHolder(View view){
            super(view);
            mAhSuLoTnOmI = view.findViewById(R.id.mAhSuLoTnOmI);
            mAhSuLoTsAnAsI = view.findViewById(R.id.mAhSuLoTsAnAsI);
            mAhSuLoTnArXi = view.findViewById(R.id.mAhSuLoTnArXi);
        }
    }
}