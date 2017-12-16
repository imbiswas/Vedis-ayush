package com.example.roshan.vedis.AdapterClass;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.roshan.vedis.R;

/**
 * Created by Ashu on 10/10/2017.
 */

public class ViewPagerAdapter extends PagerAdapter {
    private Context context;
    TextView txt_Count;
    private LayoutInflater layoutInflater;
    private Integer [] images={R.drawable.chicken, R.drawable.aloogobi, R.drawable.bhatura};


    public ViewPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view= layoutInflater.inflate(R.layout.image_view,null);
        ImageView imageView=(ImageView) view.findViewById(R.id.imageView);

        imageView.setImageResource(images[position]);

        ViewPager vp=(ViewPager) container;
        vp.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        ViewPager vp= (ViewPager) container;
        View view=(View) object;
        vp.removeView(view);
    }
}