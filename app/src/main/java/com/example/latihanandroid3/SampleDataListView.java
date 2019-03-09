package com.example.latihanandroid3;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SampleDataListView extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_listview2);
        ListView lv = findViewById(R.id.lv_sample2);
        List<String> data = new ArrayList<String>();
        data.add("Facebook");
        data.add("Twitter");
        data.add("Path");
        data.add("G+");
        data.add("Instagram");

        ArrayAdapter<String> array = new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1, data);
        lv.setAdapter(array);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Bundle b = new Bundle();
                switch (position){
                    case 0:{
//                        Toast.makeText(getApplicationContext(), "Hallo saya dari Facebook", Toast.LENGTH_SHORT).show();
                        b.putString("sosmed", "facebook");
                        Intent i = new Intent(SampleDataListView.this, FormDataList.class);
                        i.putExtras(b);
                        startActivity(i);
                    }break;
                    case 1:{
//                        Toast.makeText(getApplicationContext(), "Hallo saya dari Twitter", Toast.LENGTH_SHORT).show();
                        b.putString("sosmed", "twitter");
                        Intent i = new Intent(SampleDataListView.this, FormDataList.class);
                        i.putExtras(b);
                        startActivity(i);
                    }break;
                    case 2:{
//                        Toast.makeText(getApplicationContext(), "Hallo saya dari Path", Toast.LENGTH_SHORT).show();
                        b.putString("sosmed", "path");
                        Intent i = new Intent(SampleDataListView.this, FormDataList.class);
                        i.putExtras(b);
                        startActivity(i);
                    }break;
                    case 3:{
//                        Toast.makeText(getApplicationContext(), "Hallo saya dari Google+", Toast.LENGTH_SHORT).show();
                        b.putString("sosmed", "gplus");
                        Intent i = new Intent(SampleDataListView.this, FormDataList.class);
                        i.putExtras(b);
                        startActivity(i);
                    }break;
                    case 4:{
//                        Toast.makeText(getApplicationContext(), "Hallo saya dari Instagram", Toast.LENGTH_SHORT).show();
                        b.putString("sosmed", "instagram");
                        Intent i = new Intent(SampleDataListView.this, FormDataList.class);
                        i.putExtras(b);
                        startActivity(i);
                    }break;
                    default:{
                        Toast.makeText(getApplicationContext(), "Hallo", Toast.LENGTH_SHORT).show();
                    }break;
                }
//                if (position==0){
//                    Toast.makeText(getApplicationContext(), "Hallo saya dari Facebook", Toast.LENGTH_SHORT).show();
//                } else if (position==1){
//                    Toast.makeText(getApplicationContext(), "Hallo saya dari Twitter", Toast.LENGTH_SHORT).show();
//                }else{
//                    Toast.makeText(getApplicationContext(), "Hallo saya sosmed lain", Toast.LENGTH_SHORT).show();
//                }
            }
        });
        registerForContextMenu(lv);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_list, menu);
    }
}
