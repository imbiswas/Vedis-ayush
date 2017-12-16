package com.example.roshan.vedis.Menus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.roshan.vedis.AdapterClass.MenuAdapter;
import com.example.roshan.vedis.ModelClass.MenuItem;
import com.example.roshan.vedis.R;

import java.util.ArrayList;

public class Cocktail extends AppCompatActivity {

    ArrayList<MenuItem> itemList=new ArrayList<>();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        listView=(ListView)findViewById(R.id.listView);

        //with alcohol

        itemList.add(new MenuItem("Caipirinha",4.90,R.drawable.drinks,"Hühnerfilet in roter Currysoße, nach nordindischer Art zubereitet"));
        itemList.add(new MenuItem("Mojito",4.90,R.drawable.drinks,"Havana Club 3 Jahre, Frische Minze, Limette, Rohrzucker, Lime juice"));
        itemList.add(new MenuItem("Piña Colada",4.90,R.drawable.drinks,"Weißer Rum, Brauner Rum, Kokossahne, Ananassaft"));
        itemList.add(new MenuItem("Mango Colada",4.90,R.drawable.drinks,"Weißer Rum, Brauner Rum, Mangopüree, Ananassaft, Sahne"));
        itemList.add(new MenuItem("Erdbeer Colada",4.90,R.drawable.drinks,"Weißer Rum, Brauner Rum, Erdbeermark, Erdbeersirup, Ananassaft, Sahne"));
        itemList.add(new MenuItem("Swimming Pool",4.90,R.drawable.drinks,"Wodka, Weißer Rum, Blue curaçao, Kokossahne, Ananassaft"));
        itemList.add(new MenuItem("Crazy Pooja",4.90,R.drawable.drinks,"Baileys Cream, Kokos, Sahne, Ananassaft, Maracujasaft, Bananensaft"));
        itemList.add(new MenuItem("Miss Universe",4.90,R.drawable.drinks,"Baileys cream, Kokos, Sahne, Ananassaft, Maracujasaft, Bananasaft"));
        itemList.add(new MenuItem("Priya’s Dream",4.90,R.drawable.drinks,"Wodka, Erdbeere, Vanille, Zitronensaft, Lime juice, Maracujasaft"));
        itemList.add(new MenuItem("Sex on the Beach",4.90,R.drawable.drinks,"Wodka, Peach Tree, Melonenlikör, Grenadine, Zitronensaft, Lime juice, Orangensaft, Cranberrysaft"));
        itemList.add(new MenuItem("Watermelon Man",4.90,R.drawable.drinks,"Wodka, Melonenlikör, Grenadine, Lime Juice, Zitronensaft, Orangensaft"));
        itemList.add(new MenuItem("Mango Cooler",4.90,R.drawable.drinks,"Wodka, Triple sec, Lime juice, Mangosaft, Orangensaft"));
        itemList.add(new MenuItem("Cosmopolitan",4.90,R.drawable.drinks,"Wodka, Triple sec, Lime juice, Cranberrysaft"));
        itemList.add(new MenuItem("Hurricane",4.90,R.drawable.drinks,"Weißer Rum, Brauner Rum, Maracujasirup, Ananassaft, Orangensaft, Zitronensaft"));
        itemList.add(new MenuItem("Tropical Heat",4.90,R.drawable.drinks,"Weißer Rum, Brauner Rum, Kokos, Erdbeer, Maracujasaft, Bananensaft, Grapefruitsaft"));
        itemList.add(new MenuItem("Bollywood Dancer",4.90,R.drawable.drinks,"Brauner Rum, Erdbeermark, Zitronensaft, Orangensaft, Maracujasaft"));
        itemList.add(new MenuItem("Singh is King",4.90,R.drawable.drinks,"Weißer Rum, Triple sec, Lime juice, Grenadine, Mangosaft, Orangensaft"));
        itemList.add(new MenuItem("Indian Sunset",4.90,R.drawable.drinks,"Gin, Triple sec, Lime juice, Grenadine, Orangensaft"));
        itemList.add(new MenuItem("Singapore Sling",4.90,R.drawable.drinks,"Gin, Cherry Brandy, Grenadine, Angostura, Lime juice, Zitronensaft, Soda"));
        itemList.add(new MenuItem("Gin Fizz",4.90,R.drawable.drinks,"Gin, Zitronensaft, Lime juice, Zuckersirup, Soda"));
        itemList.add(new MenuItem("Tequila Sunrise",4.90,R.drawable.drinks,"Tequila, Zitronensaft, Orangensaft, Grenadine"));
        itemList.add(new MenuItem("Classic Margarita",4.90,R.drawable.drinks,"Tequila, Triple sec, Zitronensaft, Limejuice (wahlweise mit Salz/Zucker)"));
        itemList.add(new MenuItem("Long Island Ice Tea",4.90,R.drawable.drinks,"Wodka, Weißer Rum, Tequila, Gin, Triple sec, Lime juice, Coca-cola"));
        itemList.add(new MenuItem("Mai Tai",4.90,R.drawable.drinks,"Weißer Rum, Brauner Rum, Rum 73%, Apricot Brandy, Mandelsirup, Zitronensaft, Lime juice, Orangensaft, Ananassaft"));
        itemList.add(new MenuItem("Zombie",4.90, R.drawable.drinks,"Weißer Rum, Brauner Rum, Rum 73%, Cherry Brandy, Zitrone, Grenadine, Orangensaft, Zitronensaft, Lime Juice, Ananassaft"));
        itemList.add(new MenuItem("Sheikh Sahil",4.90, R.drawable.drinks,"Tequila, Kokos, Erdbeerpüree, Zitronensaft, Maracujasaft"));
        itemList.add(new MenuItem("Alabama Slammer",4.90, R.drawable.drinks,"Southern Comfort, Wodka, Grenadine, Zitronensaft, Ananassaft, Orangensaft"));
        itemList.add(new MenuItem("Kamasutra",4.90, R.drawable.drinks,"Southern Comfort, Baileys, Kahlùa, Kokos, Orangensaft"));
        itemList.add(new MenuItem("Sugar Daddy",4.90, R.drawable.drinks,"Bourbon, Maracujasirup, Grenadine, Ananassaft, Orangensaft"));
        itemList.add(new MenuItem("Whiskey Sour",4.90, R.drawable.drinks,"Bourbon, Maracujasirup, Grenadine, Ananassaft, Orangensaft"));

        //without alcohol
        itemList.add(new MenuItem("Coconut Kiss",4.90, R.drawable.drinks,"Kokos, Sahne, Ananassaft, Kirschsaft"));
        itemList.add(new MenuItem("Strawberry Kiss",4.90,R.drawable.drinks,"Kokos, Sahne, Ananassaft, Erdbeerpüree"));
        itemList.add(new MenuItem("Pretty Woman",4.90,R.drawable.drinks,"Kokos, Grenadine, Ananassaft, Sahne"));
        itemList.add(new MenuItem("Tom & Cherry",4.90,R.drawable.drinks,"Ananassaft, Maracujasaft, Pfirsichsaft, Sahne, Kirschsaft"));
        itemList.add(new MenuItem("Mosquito",4.90,R.drawable.drinks,"Limette, Rohrzucker, Minze, Tonic-water"));
        itemList.add(new MenuItem("Wild Lotus",4.90,R.drawable.drinks,"Limette, Rohrzucker, Minze, Ginger Ale"));
        itemList.add(new MenuItem("Car Driver",4.90,R.drawable.drinks,"Limette, Rohrzucker, Guavensaft"));
        itemList.add(new MenuItem("Cinderella",4.90,R.drawable.drinks,"Mangosirup, Maracujasirup, Zitronensaft, Orangensaft, Kirschsaft"));
        itemList.add(new MenuItem("Sportsman",4.90,R.drawable.drinks,"Kokos, Blue Curaçao, Zitronensaft, Ananassaft, Orangensaft, Maracujasaft"));
        itemList.add(new MenuItem("Vedi´s Shake",4.90,R.drawable.drinks,"Kokos, Bananensirup, Zitronensaft, Orangensaft, Ananassaft, Erdbeerpüree"));


        MenuAdapter adapter=new MenuAdapter(getApplicationContext(),R.layout.item_detail,itemList);
        listView.setAdapter(adapter);

    }
}

