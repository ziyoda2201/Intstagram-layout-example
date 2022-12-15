package com.example.ziyoda_learing_android.recycler_view;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.ziyoda_learing_android.R;
import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<String> arrayList=new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        recyclerView=findViewById(R.id.recyclerView);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arrayList);
        recyclerView.setAdapter(arrayAdapter);
    }
}