package com.example.roshan.vedis.Menus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.roshan.vedis.AdapterClass.MenuAdapter;
import com.example.roshan.vedis.ModelClass.MenuItem;
import com.example.roshan.vedis.R;

import java.util.ArrayList;

public class Deserts extends AppCompatActivity {

    ArrayList<MenuItem> itemList=new ArrayList<>();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        listView=(ListView)findViewById(R.id.listView);

        itemList.add(new MenuItem("Samosa",3.90, R.drawable.samosa," 2 knusprige Teigtaschen aus Weizenmehl gefüllt mit Gemüse, Rosinen und Nüssen in Begleitung feiner Joghurtsoße."));
        itemList.add(new MenuItem("Onion Bhaji",3.50,R.drawable.onionbhaji," Zwiebelringe frittiert in würzigem Teig aus Kichererbsenmehl"));
        itemList.add(new MenuItem("Paneer Pakora",4.50,R.drawable.paneer_pakora," indischer Käse frittiert in würzigem Teig aus Kichererbsenmehl"));
        itemList.add(new MenuItem("Chicken Pakor",4.50,R.drawable.chicken_pakora," Blumenkohl frittiert in würzigem Teig aus Kichererbsenmehl"));
        itemList.add(new MenuItem("Ghobi Pakora",3.50,R.drawable.gobi_pakora," Blumenkohl frittiert in würzigem Teig aus Kichererbsenmehl"));
        itemList.add(new MenuItem("Khumbi Pakora",3.50,R.drawable.khumbi_pakora_vedis,"frische Champignons frittiert in würzigem Teig aus Kichererbsenmehl"));
        itemList.add(new MenuItem("Mix Pakora",8.50,R.drawable.mix_pakora,"Paneer Pakora,Ghobii Pakora, Chicken Pakora, Khumbi Pakora"));
        itemList.add(new MenuItem("Aloo Tikki",3.90,R.drawable.tikki_vedis,"Kartoffelplätzchen zubereitet nach nordindischen Art"));

        MenuAdapter adapter=new MenuAdapter(getApplicationContext(),R.layout.item_detail,itemList);
        listView.setAdapter(adapter);

    }
}

