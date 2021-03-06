package com.tasomaniac.android.widget.example;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TwoLineListItem;

@SuppressWarnings("deprecation")
public class PairAdapter extends ArrayAdapter<Pair> {
    public PairAdapter(Context context, Pair[] list) {
        super(context, android.R.layout.simple_list_item_2, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TwoLineListItem twoLineListItem;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            twoLineListItem = (TwoLineListItem) inflater.inflate(android.R.layout.simple_list_item_2, null);
        } else {
            twoLineListItem = (TwoLineListItem) convertView;
        }

        twoLineListItem.getText1().setText(getItem(position).first.toString());
        twoLineListItem.getText2().setText(getItem(position).second.toString());

        return twoLineListItem;
    }
}