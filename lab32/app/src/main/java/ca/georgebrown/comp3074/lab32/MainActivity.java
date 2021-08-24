package ca.georgebrown.comp3074.lab32;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ListActivity {

  //  String[] list = {"Android", "iOS", "Symbian"};
    List<Item> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ArrayList<Item>();
        list.add(new Item("Android", "is cool", android.R.drawable.ic_dialog_map));
        list.add(new Item("iOS", "is NEXT", android.R.drawable.ic_media_next));
        list.add(new Item("Symbian", "is old", android.R.drawable.ic_delete));

        ArrayAdapter<Item> adapter = new ItemArrayAdapter(this,
            //android.R.layout.simple_list_item_1, android.R.id.text1, list); //using built-in layout
            R.layout.row_layout, R.id.my_row_text_large,
                R.id.small_text, R.id.icon, list);//using custom layout

        setListAdapter(adapter);

        /*
        ListView lv = findViewById(android.R.id.list);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(),
                        "Item "+position+" was selected: "+list[position],Toast.LENGTH_LONG)
                        .show();
            }
        });
         */
    }


    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Toast.makeText(this, "Item "+position+" was selected: "+list.get(position).getLargeText(),
                Toast.LENGTH_LONG)
                .show();
    }
}