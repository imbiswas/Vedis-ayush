package com.example.roshan.vedis.Menus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.roshan.vedis.AdapterClass.MenuAdapter;
import com.example.roshan.vedis.ModelClass.MenuItem;
import com.example.roshan.vedis.R;

import java.util.ArrayList;

public class Duck extends AppCompatActivity {

    ArrayList<MenuItem> itemList=new ArrayList<>();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        listView=(ListView)findViewById(R.id.listView);

        itemList.add(new MenuItem("Batakh do piazza",13.50, R.drawable.batakh_do_piazza,"Entenbrustfilet gebraten mit Zwiebeln, Tomaten, Ingwer und Erbsen in pikanter Curry Soße"));
        itemList.add(new MenuItem("Batakh Madras",13.50,R.drawable.batakh_madras," Entenfleisch mit Kreuzkümmel gebraten, nach südindischer Art in Kokosmilch scharf zubereitet"));
        itemList.add(new MenuItem("Batakh Vindaloo",13.90,R.drawable.batakh_vindaloo,"Entenfleisch Spezialität mit gebackenen Kartoffeln in einer pikanten Soße, nach südindischen Art Art mit Kokosraspeln zubereitet"));
        itemList.add(new MenuItem("Batakh Sabzi",14.50,R.drawable.chicken_sabzi," Entenbrustfilet mit verschiedenen Gemüsesorten der Saison in einem Curry-Tomaten Mix, garniert mit frischem Koriander"));


        MenuAdapter adapter=new MenuAdapter(getApplicationContext(),R.layout.item_detail,itemList);
        listView.setAdapter(adapter);

    }
}
