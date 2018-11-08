package com.reallydan.newbadgelist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //ListView
    private ListView mListView;

    //ArrayList
    static List<Item> items = new ArrayList<>();

    //Adapter
    ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing the ListView
        mListView = findViewById(R.id.mListView);

        //Adding Data to the ArrayList of items
        items.add(new Item("Danyl Fernandes", "Developer"));
        items.add(new Item("Henry Yuming", "Web Designer"));
        items.add(new Item("Ashley Janberg", " Park Naturalist"));
        items.add(new Item("Mary Almen", "Civil Drafter"));
        items.add(new Item("Carola Traino", "Insurance Appraiser"));
        items.add(new Item("Daniela Mocanu", "Infantry Officer"));
        items.add(new Item("Jaden Labuguen", "Surveyor"));
        items.add(new Item("Zaketa Nichola", "Petroleum Engineer"));

        //Initializing the Adapter
        itemAdapter = new ItemAdapter(this, items);

        //Set the Adapter to the ListView
        mListView.setAdapter(itemAdapter);

        //Handle ListItem Clicks
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                 Item item = (Item) mListView.getItemAtPosition(i);
                 item.setNew(false);
                 itemAdapter.notifyDataSetChanged();
            }
        });
    }
}
