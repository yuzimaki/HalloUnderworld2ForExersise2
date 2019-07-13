package com.qm.example.hallounderworld2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;
import android.content.Intent;

public class Activity1 extends AppCompatActivity {
    private String TAG="ansen";
    private String[] data={"游戏小助手","抖音好助手","系统消息","你好你好","陌生人消息","喂喂喂"
    ,"我家的大黄啊","卢老爷","天天","阿水","victory","游戏小助手","抖音好助手","系统消息","你好你好","陌生人消息","喂喂喂"
            ,"我家的大黄啊","卢老爷","天天","阿水","victory","游戏小助手","抖音好助手","系统消息","你好你好","陌生人消息","喂喂喂"
            ,"我家的大黄啊","卢老爷","天天","阿水","victory"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        Log.e(TAG,"onCreat");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(Activity1.this,android.R.layout.simple_list_item_1,data);
        ListView listview=(ListView)findViewById(R.id.listview);
        listview.setAdapter(new ListVIewAdapter(this));

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Toast.makeText(Activity1.this,"点击了第几个:"+i,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Activity1.this, SubActivity.class);
                intent.putExtra("position",i);
                startActivity(intent);
            }
        });





    }

    static class ListVIewAdapter extends BaseAdapter {

        private Context context;

        public ListVIewAdapter(Context context) {
            this.context = context;
        }

        @Override
        public int getCount() {
            return 100;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

                View inflate = LayoutInflater.from(context).inflate(R.layout.list_item, null);
                return inflate;

        }
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.e(TAG,"onStart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.e(TAG,"onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.e(TAG,"onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.e(TAG,"onStop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.e(TAG,"onDestroy");
    }
}
//正常情况下，activity生命周期为oncreat-onstart-onresume-onpause-pnstop-ondestroy
//旋转后的activity生命周期变化为onPase()->onStop->onDestory()->onCreate()->onStart()->onResume()
