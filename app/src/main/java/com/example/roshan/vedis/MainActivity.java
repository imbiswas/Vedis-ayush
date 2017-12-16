package com.example.roshan.vedis;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.roshan.vedis.AdapterClass.ViewPagerAdapter;
import com.example.roshan.vedis.NavMenu.Gallery;
import com.example.roshan.vedis.NavMenu.HomeFragment;
import com.example.roshan.vedis.NavMenu.Menu;

import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {


    private TextView mTextMessage;
    BottomNavigationView navigation;

    public static void disableShiftMode(BottomNavigationView view) {
        BottomNavigationMenuView menuView = (BottomNavigationMenuView) view.getChildAt(0);
        try {
            Field shiftingMode = menuView.getClass().getDeclaredField("mShiftingMode");
            shiftingMode.setAccessible(true);
            shiftingMode.setBoolean(menuView, false);
            shiftingMode.setAccessible(false);
            for (int i = 0; i < menuView.getChildCount(); i++) {
                BottomNavigationItemView item = (BottomNavigationItemView) menuView.getChildAt(i);
                //noinspection RestrictedApi
                item.setShiftingMode(false);
                // set once again checked value, so view will be updated
                //noinspection RestrictedApi
                item.setChecked(item.getItemData().isChecked());
            }
        } catch (NoSuchFieldException e) {
            Log.e("BNVHelper", "Unable to get shift mode field", e);
        } catch (IllegalAccessException e) {
            Log.e("BNVHelper", "Unable to change value of shift mode", e);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().replace(R.id.content, new HomeFragment()).commit();
        navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        disableShiftMode(navigation);

    }


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
//                    navigation.setItemTextColor(ColorStateList.valueOf(R.color.selected));
//                    navigation.setItemIconTintList(ColorStateList.valueOf(R.color.selected));
                    getSupportFragmentManager().beginTransaction().replace(R.id.content,new HomeFragment()).commit();
                    return true;
                case R.id.navigation_menu:
                    getSupportFragmentManager().beginTransaction().replace(R.id.content,new Menu()).commit();
                    return true;
                case R.id.navigation_gallery:
                    getSupportFragmentManager().beginTransaction().replace(R.id.content,new Gallery()).commit();

                    return true;
                case R.id.navigation_info:

                    return true;
            }
            return false;
        }

    };

}
