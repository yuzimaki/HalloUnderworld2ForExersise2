package com.qm.example.hallounderworld2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class activity2ForExersise2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2_for_exersise2);
    }


    public static int getViewCount(View view) {
    // todo 补全你的代码
    int count=0;
    if(view instanceof ViewGroup){
        int x=((ViewGroup) view).getChildCount();
        for(int i=0;i<x;i++)
        {
            View v=((ViewGroup) view).getChildAt(i);
            count+=getViewCount(v);
        }
    }
    count++;
        return count;
    }
}
