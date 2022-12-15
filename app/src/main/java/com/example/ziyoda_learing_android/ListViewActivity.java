package com.example.ziyoda_learing_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import com.example.ziyoda_learing_android.R;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {
    ListView listview;
    String[] massivPuplis={"Umida","Xurmatoy","Nazima","Ziyoda"};
    ArrayList<FoydalanuvchiNomi> OquvchiList=new ArrayList<>();
    AppCompatButton btnadd;
    EditText editname;
    EditText nametxt;
    EditText editJob;
    ListAdapter listCustomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listview=findViewById(R.id.listView);
        btnadd=findViewById(R.id.btnAdd);
        editname=findViewById(R.id.editText);
        editJob=findViewById(R.id.editJob);
        nametxt=findViewById(R.id.editName);


//        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,OquvchiList);
//        listview.setAdapter(adapter);
//            ListAdapter listCustomAdapter=new ListAdapter(this,R.layout.item_user,OquvchiList);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FoydalanuvchiNomi foydalanuvchiNomi=new FoydalanuvchiNomi();
                foydalanuvchiNomi.setName(foydalanuvchiNomi.name);
                foydalanuvchiNomi.setJob(foydalanuvchiNomi.Job);
                OquvchiList.add(foydalanuvchiNomi);
                listCustomAdapter.notifyDataSetChanged();
                editname.setText("");
                editJob.setText("");


            }
        });

   }
}