package com.example.ziyoda_learing_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecaundActivity extends AppCompatActivity {
    AppCompatButton btnSecound;
    TextView txtData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secaund);
        btnSecound = findViewById(R.id.button);
        txtData = findViewById(R.id.textView);
        String name=getIntent().getStringExtra("name_data");
        int age=getIntent().getIntExtra("age_data",0);
        txtData.setText(name+ "/n"+age);
        btnSecound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecaundActivity.this, FirstActivity.class);
                startActivity(intent);
            }
        });
    }
}