package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<SetterGetter> datamenu;
    GridLayoutManager gridLayoutManager;
    DashboardAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView =  findViewById(R.id.rv_menu);

        addData();
        gridLayoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(gridLayoutManager);
        adapter = new DashboardAdapter(datamenu);
        recyclerView.setAdapter(adapter);
    }
    public void addData(){
        datamenu = new ArrayList<>();
        datamenu.add(new SetterGetter("Top UP" , "logomenu1"));
        datamenu.add(new SetterGetter("PDAM" , "logomenu2"));
        datamenu.add(new SetterGetter("Pinjol" , "logomenu3"));
        datamenu.add(new SetterGetter("PLN" , "logomenu4"));
        datamenu.add(new SetterGetter("Belanja" , "logomenu5"));
        datamenu.add(new SetterGetter("Reseller" , "logomenu6"));

    }
}