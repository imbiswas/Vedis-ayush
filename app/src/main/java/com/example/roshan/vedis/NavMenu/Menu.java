package com.example.roshan.vedis.NavMenu;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.roshan.vedis.AdapterClass.CategoryAdapter;
import com.example.roshan.vedis.ModelClass.Category;
import com.example.roshan.vedis.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Menu extends Fragment {

    View view;
    private RecyclerView recyclerView;
    private CategoryAdapter pAdapter;
    private int Item_Image[]={R.drawable.day_ticket,R.drawable.samosa,R.drawable.dal_soup,R.drawable.tandoori_aloo_paratha,R.drawable.vedis_justveg_salat,R.drawable.ente,R.drawable.chicken_sabzi,R.drawable.mutton_sabzi,R.drawable.chicken_madras,R.drawable.fish_curry,R.drawable.veg_biryani_vedis,R.drawable.tandoori_chicken_vedis,R.drawable.gulabjamun,R.drawable.drinks};
    private int Item_Name[]={R.id.tageskarte,R.id.vorspeisen,R.id.supen,R.id.beilagen,R.id.salate,R.id.vegetarisch,R.id.hühnerfleisch,R.id.Lammfleisch,R.id.Ente,R.id.Fisch,R.id.Reisgerichte,R.id.Tandoori,R.id.Desserts,R.id.Cocktails};

    public Menu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_menu, container, false);

        final Toolbar tool = view.findViewById(R.id.toolbar1);

        tool.setTitle("");

        recyclerView = view.findViewById(R.id.recyclerView);
        ArrayList<Category> categorie_model_detail = prepareData();
        pAdapter = new CategoryAdapter(getActivity(),categorie_model_detail);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getActivity(),2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(pAdapter);
        pAdapter.notifyDataSetChanged();

        return view;
    }

    private ArrayList<Category> prepareData(){

        ArrayList<Category> categorie_detail = new ArrayList<>();
        for(int i = 0; i< Item_Image.length; i++){
            Category category_model = new Category();
            category_model.setCategory_image(Item_Image[i]);
            category_model.setCategory_name(Item_Name[i]);
            categorie_detail.add(category_model);
        }
        return categorie_detail;
    }

}






//        c.setTitleEnabled(false);


//        collapsingToolbarLayout.setTitle("Menus");
//        collapsingToolbarLayout.setContentScrimColor(getResources().getColor(R.color.colorPrimary));
//        collapsingToolbarLayout.setStatusBarScrimColor(getResources().getColor(R.color.colorPrimaryDark));

//        appbar.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
//
//            boolean isVisible = true;
//            int scrollRange = -1;
//            @Override
//            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
//                if (scrollRange == -1) {
//                    scrollRange = appBarLayout.getTotalScrollRange();
//                }
//                if (scrollRange + verticalOffset == 0) {
//                    tool.setTitle("Title");
//                    isVisible = true;
//                } else if(isVisible) {
//                    tool.setTitle("");
//                    isVisible = false;
//                }
//            }
//        });
//
//    CollapsingToolbarLayout collapsingToolbarLayout = view.findViewById(R.id.collapsing_toolbar);
//    AppBarLayout appbar = view.findViewById(R.id.app_bar);
