package com.example.ziyoda_learing_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MahsulotQoshishActivity extends AppCompatActivity {
    EditText nomi,sanasi,narxi;
    AppCompatButton qoshishuchn;
    RecyclerView recyclerView;
    ArrayList<ProductModel> mahsulotlarList=new ArrayList<>();
    MahsulotAdapter adapterMahsulot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahsulot_qoshish);
        nomi=findViewById(R.id.MahsulotNomi);
        narxi=findViewById(R.id.MahsulotNarxi);
        sanasi=findViewById(R.id.MahsulotSanasi);
        recyclerView=findViewById(R.id.productRecycler);
        adapterMahsulot=new MahsulotAdapter(this,mahsulotlarList);
        recyclerView.setAdapter(adapterMahsulot);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        qoshishuchn=findViewById(R.id.Qoshish);
        ProductModel productModel1=new ProductModel("Redmi Note 11",2.350000F,"2021");
        ProductModel productModel2=new ProductModel("Redmi Note 11 Pro",3.250000F,"2021");
        ProductModel productModel3=new ProductModel("iPhone 14 Pro Max",14.000000F,"2022");
        ProductModel productModel4=new ProductModel("iPhone 11",10.000000F,"2019");
        mahsulotlarList.add(productModel1);
        mahsulotlarList.add(productModel2);
        mahsulotlarList.add(productModel3);
        mahsulotlarList.add(productModel4);
        qoshishuchn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProductModel productModel=new ProductModel(nomi.getText().toString(),Float.valueOf(narxi.getText().toString()),sanasi.getText().toString());
             mahsulotlarList.add(productModel);
             adapterMahsulot.notifyDataSetChanged();
                nomi.setText("");
                narxi.setText("");
                sanasi.setText("");
            }
        });
    }
}