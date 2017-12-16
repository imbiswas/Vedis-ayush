package com.example.roshan.vedis.AdapterClass;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.roshan.vedis.ModelClass.MenuItem;
import com.example.roshan.vedis.R;

import java.util.ArrayList;

/**
 * Created by roshan on 10/8/17.
 */

public class MenuAdapter extends ArrayAdapter {
    public ArrayList<MenuItem> menuItems=new ArrayList<>();
    private int resource;
    private LayoutInflater inflater;
    Context context;



    public MenuAdapter(Context context, int resource, ArrayList<MenuItem> menuItems) {
        super(context, resource, menuItems);
        this.menuItems = menuItems;
        this.resource = resource;
        this.context=context;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewholder=new ViewHolder();

        if (convertView==null){
            convertView = inflater.inflate(R.layout.item_detail, null);
            viewholder.txtName= convertView.findViewById(R.id.txt_item_name);
            viewholder.txtPrice= convertView.findViewById(R.id.txt_price);
            viewholder.txtDesc= convertView.findViewById(R.id.txt_desc);
            viewholder.imageView= convertView.findViewById(R.id.image);
            convertView.setTag(viewholder);
        }else {
            viewholder = (ViewHolder) convertView.getTag();
        }

        MenuItem current=menuItems.get(position);
        viewholder.txtName.setText(current.getItem_name());
        viewholder.txtDesc.setText(current.getItem_description());
        viewholder.txtPrice.setText("€ "+current.getItem_price());
        Glide.with(context).load(current.getItem_image()).asBitmap().into(viewholder.imageView);

        return convertView;
    }

    class ViewHolder {
        private TextView txtName,txtDesc,txtPrice;
        private ImageView imageView;
    }
}