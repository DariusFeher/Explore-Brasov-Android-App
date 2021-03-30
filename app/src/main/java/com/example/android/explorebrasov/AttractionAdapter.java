package com.example.android.explorebrasov;

import android.app.Activity;
import android.content.Intent;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    private static final String LOG_TAG = AttractionAdapter.class.getSimpleName();

    public AttractionAdapter(Activity context, ArrayList<Attraction> pWords) {
        super(context, 0, pWords);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.attraction_item, parent, false);
        Attraction my_description = (Attraction) getItem(position);

        ImageView attractionImg = (ImageView) listItemView.findViewById(R.id.attraction_image_view);
        attractionImg.setImageResource(my_description.getAttractionId());


        TextView rating = (TextView) listItemView.findViewById(R.id.rating_text_view);
        String ratingNr = String.valueOf(my_description.getRatingNr());
        rating.setText(ratingNr);

        RatingBar ratingBar = (RatingBar) listItemView.findViewById(R.id.rating_bar);
        ratingBar.setRating(Float.parseFloat(ratingNr));


        TextView link = (TextView) listItemView.findViewById(R.id.link_text_view);
        link.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='" + my_description.getLink() + "'>" + " More info about " + my_description.getAttractionName() + " </a>";
        link.setText(Html.fromHtml(text));

        TextView attractionName = (TextView) listItemView.findViewById(R.id.attraction_name_text_view);
        attractionName.setText(my_description.getAttractionName());

        listItemView.setBackgroundResource(R.drawable.rounded_corners);

        return listItemView;
    }

}
