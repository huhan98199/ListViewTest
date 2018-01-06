package com.example.wuhan.listviewtest;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class FruitAdapter extends ArrayAdapter<Fruit> {
    private int resourceId;

    public FruitAdapter(Context context, int textViewResourceId, List<Fruit>objects) {
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Fruit fruit=getItem(position);
        View view;
        ViewHolder viewHolder;
        if(convertView==null){
            view=LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder=new ViewHolder();
            viewHolder.fruitImage=(ImageView) view.findViewById(R.id.fruit_imagId);
            viewHolder.fruitname=(TextView)view.findViewById(R.id.fruit_name);
            view.setTag(viewHolder);
        }
        else{
            view=convertView;
            viewHolder=(ViewHolder)view.getTag();
        }
        viewHolder.fruitImage.setImageResource(fruit.getImagId());
        viewHolder.fruitname.setText(fruit.getName());
        return view;
    }
    class ViewHolder{
        ImageView fruitImage;
        TextView fruitname;
    }

}
