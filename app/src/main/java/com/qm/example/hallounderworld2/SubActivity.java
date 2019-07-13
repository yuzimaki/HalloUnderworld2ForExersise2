package com.qm.example.hallounderworld2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        int data=getIntent().getIntExtra("position",-1);

        TextView tv1=findViewById(R.id.textview1);
        tv1.setText(" "+data);
    }
}
