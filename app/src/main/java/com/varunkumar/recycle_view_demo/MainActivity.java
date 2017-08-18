package com.varunkumar.recycle_view_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<RowBean> beanList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView =(RecyclerView) findViewById(R.id.recycle_view);
        for (int i=0;i<12;i++){
            RowBean bean = new RowBean();
            bean.setTitl("Title" + (i+1));
            bean.setDiscp("Discp" + (i+1));
            beanList.add(bean);
        }
        RowAdapter adapter= new RowAdapter(this, beanList) ;
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
