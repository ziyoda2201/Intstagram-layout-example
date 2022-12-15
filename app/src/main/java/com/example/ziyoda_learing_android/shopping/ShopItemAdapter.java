package com.example.ziyoda_learing_android.shopping;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ziyoda_learing_android.R;

import java.util.List;

public class ShopItemAdapter extends RecyclerView.Adapter<ShopItemAdapter.ViewHolder> {

    private final LayoutInflater inflater;
    private final List<ShopModel> products;

    ShopItemAdapter(Context context, List<ShopModel> products) {
        this.products = products;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public ShopItemAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.shop_item_layout, parent, false);
        return new ViewHolder(view);
    }

    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override
    public void onBindViewHolder(ShopItemAdapter.ViewHolder holder, int position) {
        ShopModel shopModel = products.get(position);
        holder.nameView.setText(shopModel.getProductName());
        holder.priceText.setText(shopModel.getProductPrice() + "$");
        holder.numberText.setText(String.valueOf(shopModel.getProductNumber()));
        String size = " ";
        if (shopModel.getProductTypeId()==1){
            holder.productImageView.setBackgroundResource(R.drawable.img);
        }else{
            holder.productImageView.setBackgroundResource(R.drawable.cardigan);
        }
        if (!shopModel.getProductSize().equals(" ")) {
            size = " | size=" + shopModel.getProductSize();
        }
        holder.colorText.setText(shopModel.getProductColor() + size);
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView productImageView;
        final TextView nameView, numberText, priceText, SizeText, colorText;

        ViewHolder(View view) {
            super(view);
            nameView = view.findViewById(R.id.productName1);
            numberText = view.findViewById(R.id.productNumber1);
            priceText = view.findViewById(R.id.productPrice1);
            SizeText = view.findViewById(R.id.productSize1);
            colorText = view.findViewById(R.id.productSize1);
            productImageView = view.findViewById(R.id.productImage);
        }
    }
}