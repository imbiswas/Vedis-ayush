package com.example.roshan.vedis.NavMenu;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Toolbar;
import android.widget.ViewFlipper;

import com.example.roshan.vedis.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    View view;
    ViewFlipper viewFlipper;
    Animation Fade_in,Fade_out;

    Toolbar toolbar;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_home, container, false);
        viewFlipper=view.findViewById(R.id.viewFlipper);
//        toolbar= view.findViewById(R.id.toolbar);
//        toolbar.setTitle("Home");
        viewFlipper.setAnimation(Fade_in);
        viewFlipper.setAnimation(Fade_out);
        viewFlipper.setAutoStart(true);
        viewFlipper.startFlipping();
        viewFlipper.setFlipInterval(2000);


        return view;
    }

}
