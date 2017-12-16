package com.example.roshan.vedis.Menus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.roshan.vedis.AdapterClass.MenuAdapter;
import com.example.roshan.vedis.ModelClass.MenuItem;
import com.example.roshan.vedis.R;

import java.util.ArrayList;

public class Fishes extends AppCompatActivity {

    ArrayList<MenuItem> itemList=new ArrayList<>();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        listView=(ListView)findViewById(R.id.listView);

        itemList.add(new MenuItem("Machli Masala ",10.90, R.drawable.fish_curry," scharfes Rotbarschfilet in roter Currysoße, gewürzt nach nordindischer Art"));
        itemList.add(new MenuItem("Machli Madras  ",10.50,R.drawable.fish_madras,"Rotbarschfilet mit Kreuzkümmel gebraten, nach südindischer Art in Kokosmilch scharf zubereitet"));
        itemList.add(new MenuItem("Machli Vindaloo  ",10.90,R.drawable.fish_vindaloo_vedis," Rotbarschfiletspezialität mit gebackenen Kartoffeln in einer pikanten Soße, nach südindischen Art mit Kokosraspeln zubereitet"));
        itemList.add(new MenuItem("Machli Sabzi ",10.50,R.drawable.chicken_sabzi," Rotbarschfilet mit verschiedenen Gemüsesorten der Saison in einem Curry-Tomaten Mix, garniert mit frischen Koriander"));
        itemList.add(new MenuItem("Jhinga Masala ",13.90,R.drawable.prawn_masala_vedis," Riesengarnelen gewürzt nach nordindischer Art"));
        itemList.add(new MenuItem("Jhinga Madras ",13.50,R.drawable.prawn_madras_vedis,"Riesengarnelen mit Kreuzkümmel gebraten, nach südindischer Art in Kokosmilch scharf zubereitet"));
        itemList.add(new MenuItem("Jhinga Vindaloo ",14.90,R.drawable.prawn_vindaloo_vedis,"Riesengarnelen mit gebackenen Kartoffeln in einer pikanten Soße, nach südindischen Art mit Kokosraspeln zubereitet"));
        itemList.add(new MenuItem("Jhinga Jhalfrezi ",14.50,R.drawable.prawn_jalfrezi_vedis,"Würzige Riesengarnelen gebraten mit frischen Tomaten, Ingwer, Zwiebeln, Paprika , garniert mit frischem Koriander"));

        MenuAdapter adapter=new MenuAdapter(getApplicationContext(),R.layout.item_detail,itemList);
        listView.setAdapter(adapter);

    }
}
