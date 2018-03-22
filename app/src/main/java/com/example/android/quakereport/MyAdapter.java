package com.example.android.quakereport;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class MyAdapter extends ArrayAdapter<Elementi> {

    public MyAdapter(Activity context, ArrayList<Elementi> eleme) {

        super ( context, 0, eleme );
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from ( getContext () ).inflate ( R.layout.elemlayout, parent, false );
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Elementi elemAdapter = getItem ( position );

        TextView magTextView = (TextView) listItemView.findViewById ( R.id.magnitude );
        magTextView.setText ( elemAdapter.getmMagnitude () );

        TextView cityTextView = (TextView) listItemView.findViewById ( R.id.city );
        cityTextView.setText ( elemAdapter.getmCity () );

        TextView dateTextView = (TextView) listItemView.findViewById ( R.id.date );
        dateTextView.setText ( elemAdapter.getmDate () );


        return listItemView;
    }
}