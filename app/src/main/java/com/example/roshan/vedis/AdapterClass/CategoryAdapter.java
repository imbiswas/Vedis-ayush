package com.example.roshan.vedis.AdapterClass;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.roshan.vedis.MainActivity;
import com.example.roshan.vedis.Menus.Appetizer;
import com.example.roshan.vedis.ModelClass.Category;
import com.example.roshan.vedis.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by roshan on 10/8/17.
 */

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.MyViewHolder> {

    private ArrayList<Category> category_models;
    private Context context;

    public CategoryAdapter(Context context,ArrayList<Category> category_models) {
        this.category_models = category_models;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.menu_item, parent, false);
        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.item_name.setText(category_models.get(position).getCategory_name());
        Glide.with(context).load(category_models.get(position).getCategory_image()).into(holder.item_image);
    }

    @Override
    public int getItemCount() {
        return category_models.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView item_image;
        private TextView item_name;
        public MyViewHolder(View view) {
            super(view);
            item_name = view.findViewById(R.id.txt_category);
            item_image = view.findViewById(R.id.image_Category);
            context = view.getContext();
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

            final Intent intent;
            //  Toast.makeText(view.getContext(), DataProvider.JAVA_BOOKS[getAdapterPosition()], Toast.LENGTH_SHORT).show();
            String item= item_name.getText().toString();
            Toast.makeText(view.getContext(),"You Clicked : "+item, Toast.LENGTH_SHORT).show();

            switch (getAdapterPosition()){
                case 1:
                    intent =  new Intent(context,Appetizer.class);
                    break;
//                case 1:
//                    intent =  new Intent(context, Breakfast.class);
//                    break;
//                case 2:
//                    intent =  new Intent(context, Lunch.class);
//                    break;
//                case 3:
//                    intent =  new Intent(context, Biryani.class);
//                    break;
//                case 4:
//                    intent =  new Intent(context, Snacks.class);
//                    break;
//                case 5:
//                    intent =  new Intent(context, Fastfood.class);
//                    break;
//                case 6:
//                    intent =  new Intent(context, Deserts.class);
//                    break;
//                case 7:
//                    intent =  new Intent(context, Nepali_Specialaist.class);
//                    break;
//                case 8:
//                    intent =  new Intent(context, Dinner.class);
//                    break;
//                case 9:
//                    intent =  new Intent(context, Beverage.class);
//                    break;
                default:
                    intent =  new Intent(context, MainActivity.class);
                    break;
            }
            context.startActivity(intent);
        }
        }
    }
