package com.example.ahmaadyunus.imageload;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by ahmaadyunus on 07/12/16.
 */

public class DataAdapter extends BaseAdapter {
    ArrayList listItem;
    Activity activity;

    public DataAdapter(Activity activity, ArrayList listItem){
        this.activity = activity;
        this.listItem = listItem;
    }

    @Override
    public int getCount() {
        return listItem.size();
    }

    @Override
    public Object getItem(int position) {
        return listItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ViewHolder{
        ImageView imgItem;
        TextView txtTitle;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        ViewHolder holder = null;

        if (view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_list, null);
            holder.txtTitle = (TextView)view.findViewById(R.id.txt_item_merk);
            holder.imgItem = (ImageView)view.findViewById(R.id.img_item);
            view.setTag(holder);
        }else{
            holder = (ViewHolder)view.getTag();
        }

        DataModel data = (DataModel)getItem(position);
        holder.txtTitle.setText(data.getTitle());
        Glide.with(activity).load(data.getImage()).into(holder.imgItem);

        return view;
    }
}