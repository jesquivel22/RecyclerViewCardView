package com.example.recyclerviewcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ListElement> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void init(){
        elements=new ArrayList<>();
        elements.add(new ListElement("#775447","Jhonatan","Lima","Activo"));
        elements.add(new ListElement("red","Analhi","Huancayo","Activo"));
        elements.add(new ListElement("blue","Reyna","Lima","Activo"));
        elements.add(new ListElement("yellow","Pedro","Trujillo","Inactivo"));

        ListAdapter listAdapter=new ListAdapter(elements,this);
        RecyclerView recyclerView=findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
}