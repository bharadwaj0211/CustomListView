package com.example.customlistview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends ArrayAdapter {

    private final Activity context;
    private String[] city;
    private String[] state;
    private int[] imageId;

    public MyAdapter(Activity context, String[] city, String[] state, int[] imageId) {
        super(context, R.layout.mylist, city);
        this.context=context;
        this.city=city;
        this.state=state;
        this.imageId=imageId;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.mylist,null,true);

        TextView cityText = rowView.findViewById(R.id.city);
        ImageView imageView = rowView.findViewById(R.id.image);
        TextView stateText = rowView.findViewById(R.id.state);

        cityText.setText(city[position]);
        imageView.setImageResource(imageId[position]);
        stateText.setText(state[position]);


        return rowView;

    }


}
