package com.example.ziyoda_learing_android;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class ListAdapter extends ArrayAdapter<FoydalanuvchiNomi> {

    private int resourceLayout;
    private Context mcontext;


    public ListAdapter(@NonNull Context context, int resource, List<FoydalanuvchiNomi> items) {
        super(context, resource);
        this.resourceLayout = resource;
        this.mcontext = context;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if (view == null) {

            LayoutInflater vi;
            vi=LayoutInflater.from(mcontext);
            view=vi.inflate(resourceLayout,null);
        }
        FoydalanuvchiNomi p=getItem(position);


        if (p != null) {
            TextView name = (TextView) view.findViewById(R.id.name);
            TextView job = (TextView) view.findViewById(R.id.job);
            if (name != null) {
                name.setText(p.getName());
            }
            if (job != null) {
                job.setText(p.getJob());
            }
        }
        return view;
    }
}

