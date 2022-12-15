package com.example.ziyoda_learing_android;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KalkulatorActivity extends AppCompatActivity implements KalkulatorActivity1 {
    EditText birinchi_son;
    EditText ikkinchi_son;
    AppCompatButton qoshishbtn;
    AppCompatButton oluvbtn;
    AppCompatButton kopaytirishbtn;
    AppCompatButton bolishbtn;

    TextView amal;
    TextView natija;

    String oper = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        birinchi_son = (EditText) findViewById(R.id.birinchi_son);
        ikkinchi_son = (EditText) findViewById(R.id.ikkinchi_son);

        qoshishbtn = (AppCompatButton) findViewById(R.id.qoshishbtn);
        oluvbtn = (AppCompatButton) findViewById(R.id.oluvbtn);
        kopaytirishbtn = (AppCompatButton) findViewById(R.id.kopaytirishbtn);
        bolishbtn = (AppCompatButton) findViewById(R.id.bolishbtn);


        amal = (TextView) findViewById(R.id.amal);
        qoshishbtn.setOnClickListener((View.OnClickListener) this);
        oluvbtn.setOnClickListener((View.OnClickListener) this);
        kopaytirishbtn.setOnClickListener((View.OnClickListener) this);
        bolishbtn.setOnClickListener((View.OnClickListener) this);
    }
    @Override
    public void onClick(View v) {
       float birinchi_son1 = 0;
        float ikkinchi_son2 = 0;
        float result = 0;

        if (TextUtils.isEmpty(birinchi_son.getText().toString())
                || TextUtils.isEmpty(ikkinchi_son.getText().toString())) {
                    return;
                } else {
            birinchi_son1 = Float.parseFloat(birinchi_son.getText().toString());
            ikkinchi_son2 = Float.parseFloat(ikkinchi_son.getText().toString());

            switch (v.getId()) {
                case R.id.qoshishbtn:
                    oper = "+";
                    result = birinchi_son1 + ikkinchi_son2;
                    break;
                case R.id.oluvbtn:
                    oper = "-";
                    result = birinchi_son1 - ikkinchi_son2;
                    break;
                case R.id.kopaytirishbtn:
                    oper = "*";
                    result = birinchi_son1 * ikkinchi_son2;
                    break;
                case R.id.bolishbtn:
                    oper = "/";
                    result = birinchi_son1 / ikkinchi_son2;
                    break;
                default:
                    break;
            }

            amal.setText(birinchi_son + " " + oper + " " + ikkinchi_son + " = " + result);
        }

    }
}
