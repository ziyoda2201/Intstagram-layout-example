package com.example.ziyoda_learing_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
public class FirstActivity extends AppCompatActivity {
    AppCompatButton btn;
    EditText editName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        btn = findViewById(R.id.clickbtn);
        editName = findViewById(R.id.editText);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BTNclick();
            }
        });
    }
    public void BTNclick() {
        Intent intent = new Intent(FirstActivity.this, SecaundActivity.class);
        intent.putExtra("name_data",editName.getText().toString());
        intent.putExtra("age_data",15);
        startActivity(intent);
    }
}