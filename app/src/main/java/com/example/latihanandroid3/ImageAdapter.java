package com.example.latihanandroid3;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context ctx;

    public Integer[] datagambar = {
        R.mipmap.facebook, R.mipmap.gplus, R.mipmap.instagram, R.mipmap.path, R.mipmap.twitter
    };

    public ImageAdapter(Context c){
        ctx = c;
    }

    @Override
    public int getCount() {
        return datagambar.length;
    }

    @Override
    public Object getItem(int position) {
        return datagambar[position];
    }

    @Override
    public long getItemId(int position) {
        return datagambar[position];
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(ctx);
        imageView.setImageResource(datagambar[position]);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setLayoutParams(new GridView.LayoutParams(160,160));
        return imageView;
    }
}
