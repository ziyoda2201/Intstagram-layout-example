package com.example.ziyoda_learing_android.shopping;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.ziyoda_learing_android.R;

import java.util.ArrayList;

public class AddProductsActivity extends AppCompatActivity {
    EditText productName, productPrice, productSize, productColor, productNumber;
    AppCompatButton Save, View;
    Spinner SpinnerProductType;
    String[] types = {"Clothing", "Accessories"};
    public static ArrayList<ShopModel> products = new ArrayList<>();
    int productsType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_products);
        productName = findViewById(R.id.productName);
        productPrice = findViewById(R.id.productPrice);
        productNumber = findViewById(R.id.productNumber);
        productColor = findViewById(R.id.productColor);
        productSize = findViewById(R.id.productSize);
        Save = findViewById(R.id.productSave);
        View = findViewById(R.id.productView);
        SpinnerProductType = findViewById(R.id.spinnerProductType);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, types);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SpinnerProductType.setAdapter(adapter);

        SpinnerProductType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 1) {
                    productSize.setVisibility(View.GONE);
                } else {
                    productSize.setVisibility(View.VISIBLE);
                }
                productsType = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShopModel shopModel = new ShopModel(productName.getText().toString(), Integer.valueOf(productNumber.getText().toString()), productSize.getText().toString(), Float.valueOf(productPrice.getText().toString()), productColor.getText().toString(), productsType);
                products.add(shopModel);
                productName.setText("");
                productNumber.setText("");
                productSize.setText("");
                productPrice.setText("");
                productColor.setText("");
            }
        });
        View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Intent intent = new Intent(AddProductsActivity.this, ShowProductsActivity.class);
                startActivity(intent);
            }
        });
    }
}