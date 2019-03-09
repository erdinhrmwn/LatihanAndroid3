package com.example.latihanandroid3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class FormDataList extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_from_list);
        ImageView gambar = findViewById(R.id.gambar_data);
        TextView text = findViewById(R.id.text_data);
        String sosmed;
        Bundle b = getIntent().getExtras();
        if (b != null) {
            sosmed = b.getString("sosmed");
            switch (sosmed){
                case "facebook":{
                    gambar.setImageResource(R.mipmap.facebook);
                    text.setText(R.string.facebook);
                }break;
                case "twitter":{
                    gambar.setImageResource(R.mipmap.twitter);
                    text.setText(R.string.twitter);
                }break;
                case "path":{
                    gambar.setImageResource(R.mipmap.path);
                    text.setText(R.string.path);
                }break;
                case "gplus":{
                    gambar.setImageResource(R.mipmap.gplus);
                    text.setText(R.string.gplus);
                }break;
                case "instagram":{
                    gambar.setImageResource(R.mipmap.instagram);
                    text.setText(R.string.instagram);
                }break;
                default:{

                }break;
            }
        }
    }
}
