package com.example.roshan.vedis.NavMenu;


import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.roshan.vedis.AdapterClass.ViewPagerAdapter;
import com.example.roshan.vedis.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Gallery extends Fragment {
    ViewPager viewPager;
    LinearLayout sliderDotspanel;
    private int dotscount;
    private ImageView[] dots;
    View view;
    TextView txt_Count;


    public Gallery() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.fragment_gallery, container, false);

        viewPager= view.findViewById(R.id.view_pager);
        sliderDotspanel= view.findViewById(R.id.SliderDots);
        txt_Count= view.findViewById(R.id.count);
        final ViewPagerAdapter viewPagerAdapter= new ViewPagerAdapter(getActivity());
        viewPager.setAdapter(viewPagerAdapter);
        dotscount=viewPagerAdapter.getCount();
        dots=new ImageView[dotscount];

        for (int i=0;i<dotscount;i++){
            dots[i]=new ImageView(getActivity());
            dots[i].setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.nonactive_dot));
            LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(8,0,8,0);
            sliderDotspanel.addView(dots[i],params);
            System.out.println("dot :"+dots);

        }
        dots[0].setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.active_dot));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i =0;i<dotscount;i++){
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.nonactive_dot));
                }
                dots[position].setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.active_dot));

                int pos=position+1;
                txt_Count.setText(""+pos+"/"+viewPagerAdapter.getCount());

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        return view;
    }

        // Inflate the layout for this fragment


    }


