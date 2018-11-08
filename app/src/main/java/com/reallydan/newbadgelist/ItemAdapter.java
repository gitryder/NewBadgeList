package com.reallydan.newbadgelist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

public class ItemAdapter extends ArrayAdapter<Item> {
    private List<Item> items;
    private Context context;


    public ItemAdapter(Context context, List<Item> items) {
        super(context, R.layout.single_list_item, items);
        this.context = context;
        this.items = items;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.single_list_item, parent, false);

        //Binding the views from the single_item_layout
        TextView mName = view.findViewById(R.id.mName);
        TextView mProfession = view.findViewById(R.id.mProfession);
        ImageView new_badge = view.findViewById(R.id.new_badge);

        //Get the data from the List
        Item item = items.get(position);

        //Setting the data
        mName.setText(item.getName());
        mProfession.setText(item.getProfession());

        //Make 'new_badge' VISIBLE if the item is new
        if (item.isNew()){
            new_badge.setVisibility(View.VISIBLE);
        }

        //Return the view
        return view;
    }
}
