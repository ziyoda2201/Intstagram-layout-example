package com.example.ziyoda_learing_android.shopping;

import static com.example.ziyoda_learing_android.shopping.AddProductsActivity.products;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.example.ziyoda_learing_android.R;

public class ShowProductsActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ShopItemAdapter shopItemAdapter;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_products);
        recyclerView = findViewById(R.id.productRecycler);
        shopItemAdapter = new ShopItemAdapter(this, products);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(shopItemAdapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.show_products_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.delete_settings:
//                headerView.setText("Настройки");
                return true;
            case R.id.cleaning_settings:
                products.clear();
//                headerView.setText("Открыть");
                return true;
            case R.id.return_settings:
                finish();
//                headerView.setText("Сохранить");
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}