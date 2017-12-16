package com.example.roshan.vedis.Menus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.roshan.vedis.AdapterClass.MenuAdapter;
import com.example.roshan.vedis.ModelClass.MenuItem;
import com.example.roshan.vedis.R;

import java.util.ArrayList;

public class Chicken extends AppCompatActivity {

    ArrayList<MenuItem> itemList=new ArrayList<>();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        listView=(ListView)findViewById(R.id.listView);

        itemList.add(new MenuItem("Chicken Curry",8.90,R.drawable.chicken_curry,"Hühnerfilet in roter Currysoße, nach nordindischer Art zubereitet"));
        itemList.add(new MenuItem("Chicken Korma",9.90,R.drawable.chicken_korna,"Hühnerfilet in milder Safran-Cashew-Soße mit Mandeln und Rosinen garniert"));
        itemList.add(new MenuItem("Butter Chicken",10.90,R.drawable.butter_chicken,"zarte Tandoori Hähnchenstücke, kurz gegrillt und fertig gegart , mit verschiedenen Gewürzen in einer sahnigen Tomatensauce mit Cashews und Mandeln"));
        itemList.add(new MenuItem("Chicken Madras",10.50,R.drawable.chicken_madras,"Hühnerbrustfilet mit Kreuzkümmel gebraten, nach südindischer Art in Kokosmilch scharf zubereitet"));
        itemList.add(new MenuItem("Chicken Vindaloo",10.90,R.drawable.chicken_vindaloo,"Hähnchenspezialität mit gebackenen Kartoffeln in einer pikanten Soße, nach südindischer Art mit Kokosraspeln zubereitet"));
        itemList.add(new MenuItem("Chicken Saag",10.90,R.drawable.chicken_saag,"Hühnerfilet in Spinat nach indischer Art gewürzt mit frischem Ingwer und Knoblauch"));
        itemList.add(new MenuItem("Chicken Jalfrezi",10.50,R.drawable.chicken_jalfrezi,"Hühnerfilet mit Zwiebeln, Tomaten, Paprika, scharf gewürzt mit frischem Ingwer, Knoblauch und Koriander"));
        itemList.add(new MenuItem("Chicken Mango",10.90,R.drawable.mango_chicken,"Hänchenfilet in einer milden Sahne-Mango Soße verfeinert mit Rosinen und Mandeln"));







        MenuAdapter adapter=new MenuAdapter(getApplicationContext(),R.layout.item_detail,itemList);
        listView.setAdapter(adapter);

    }
}
