package com.example.roshan.vedis.Menus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.roshan.vedis.AdapterClass.MenuAdapter;
import com.example.roshan.vedis.ModelClass.MenuItem;
import com.example.roshan.vedis.R;

import java.util.ArrayList;

public class Rice_dish extends AppCompatActivity {

    ArrayList<MenuItem> itemList=new ArrayList<>();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        listView=(ListView)findViewById(R.id.listView);

        itemList.add(new MenuItem("Sabzi Biryani",10.90, R.drawable.veg_biryani_vedis,"Basmati Reis, gebraten mit frischem Gemüse, Nüssen, Rosinen, feinen Kräutern und Gewürzen. "));
        itemList.add(new MenuItem(" Chicken Biryani",11.50,R.drawable.chicken_biryani_vedis," Zartes Hühnerfleisch zubereitet mit Basmati Reis, gebraten mit frischem Gemüse, Nüssen, Rosinen, feinen Kräutern und Gewürzen."));
        itemList.add(new MenuItem(" Mutton Biryani",12.90,R.drawable.lamm_biryani_vedis," Zartes Lammfleisch zubereitet mit Basmati Reis, gebraten mit frischem Gemüse, Nüssen, Rosinen, feinen"));
        itemList.add(new MenuItem(" Jhingha Biryani",13.90,R.drawable.prawn_biryani_vedis," Riesengarnelen zubereitet mit Basmati Reis, gebraten mit frischem Gemüse, Nüssen, Rosinen, feinen Kräutern und Gewürzen."));
        itemList.add(new MenuItem(" Biryani Spezial",14.90,R.drawable.mix_biryani_vedis,"  Basmati Reis zubereitet mit Lamm, Hühnchen und Garnelen, gebraten mit frischem Gemüse, Nüssen, Rosinen, feinen Kräutern und Gewürzen."));

        MenuAdapter adapter=new MenuAdapter(getApplicationContext(),R.layout.item_detail,itemList);
        listView.setAdapter(adapter);

    }
}
