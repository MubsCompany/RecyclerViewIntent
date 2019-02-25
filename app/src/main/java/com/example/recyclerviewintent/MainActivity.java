package com.example.recyclerviewintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
RecyclerView rvIntent;
IntentAdapter intentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        rvIntent = findViewById( R.id.rv_intent );
        rvIntent.setLayoutManager( new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false) );
        intentAdapter = new IntentAdapter(this);
        rvIntent.setAdapter( intentAdapter );
    }
}
