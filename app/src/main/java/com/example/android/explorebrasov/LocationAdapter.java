package com.example.android.explorebrasov;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    private static final String LOG_TAG = AttractionAdapter.class.getSimpleName();

    public LocationAdapter(Activity context, ArrayList<Location> pWords) {
        super(context, 0, pWords);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.restaurant_item, parent, false);
        Location my_description = (Location) getItem(position);

        TextView restaurantName = (TextView) listItemView.findViewById(R.id.restaurant_name);
        restaurantName.setText(my_description.getRestaurantName());

        TextView rating = (TextView) listItemView.findViewById(R.id.rating_text_view);
        String ratingNr = String.valueOf(my_description.getRatingNr());
        rating.setText(ratingNr);

        RatingBar ratingBar = (RatingBar) listItemView.findViewById(R.id.rating_bar);
        ratingBar.setRating(Float.parseFloat(ratingNr));


        final TextView address = (TextView) listItemView.findViewById(R.id.restaurant_address);
        address.setText(Html.fromHtml("<u>" + my_description.getAddress() + "</u>"));

        address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent geoIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=" + address.getText().toString()));
                getContext().startActivity(geoIntent);
            }
        });

        TextView phone = (TextView) listItemView.findViewById(R.id.restaurant_telephone);
        phone.setText(my_description.getPhoneNumber());

        listItemView.setBackgroundResource(R.drawable.rounded_corners);

        return listItemView;
    }

}
