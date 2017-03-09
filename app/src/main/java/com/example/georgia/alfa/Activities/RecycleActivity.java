package com.example.georgia.alfa.Activities;

/**
 * Created by Shade on 5/9/2016.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.georgia.alfa.R;

public class RecycleActivity extends RecyclerView.Adapter<RecycleActivity.ViewHolder> {

    private String[] titles = {"Mwanza",
            "Dar Es Salaam",
            "Musoma",
            "Mbeya",
            "Mtwara",
            "Morogoro",
            "Arusha",
            "Mara"};

    private String[] details = {"Mwanza details",
            "Dar Es Salaam details", "Musoma details",
            "Mbeya details", "Mtwara details",
            "Morogoro details", "Arusha details",
            "Mara details"};

    private int[] images = { R.drawable.unnamed,
            R.drawable.unnamed,
            R.drawable.unnamed,
            R.drawable.unnamed,
            R.drawable.unnamed,
            R.drawable.unnamed,
            R.drawable.unnamed,
            R.drawable.unnamed};

    class ViewHolder extends RecyclerView.ViewHolder{

        public int currentItem;
        public ImageView itemImage;
        public TextView itemTitle;
        public TextView itemDetail;



        public ViewHolder(View itemView) {
            super(itemView);
            itemImage = (ImageView)itemView.findViewById(R.id.item_image);
            itemTitle = (TextView)itemView.findViewById(R.id.item_title);
            itemDetail =
                    (TextView)itemView.findViewById(R.id.item_detail);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //int position = getAdapterPosition();

                    // Snackbar.make(v, "Click detected on item " + position,
                    //   Snackbar.LENGTH_LONG)
                    //  .setAction("Action", null).show();
                    // int position = getAdapterPosition();
                   // Intent intent=new Intent(v.getContext(),DetailActivity.class);
                   // v.getContext().startActivity(intent);


                }
            });
            //itemView.setOnClickListener(new View.OnClickListener() {
            ////  @Override public void onClick(View v) {


            // Intent intent=new Intent(v.getContext(),DetailActivity.class);
            // v.getContext().startActivity(intent);


            //  Snackbar.make(v, "Click detected on item " + position,
            //     Snackbar.LENGTH_LONG)
            //   .setAction("Action", null).show();

        }
        // });
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemDetail.setText(details[i]);
        viewHolder.itemImage.setImageResource(images[i]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}