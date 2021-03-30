package com.example.android.explorebrasov;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HikingAdapter extends ArrayAdapter<Hiking> {

    private int mColorResourceId;

    private static final String LOG_TAG = HikingAdapter.class.getSimpleName();

    public HikingAdapter(Activity context, ArrayList<Hiking> pWords) {
        super(context, 0, pWords);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        Hiking my_description = (Hiking) getItem(position);

        TextView hikingTitleTextView = (TextView) listItemView.findViewById(R.id.hiking_title_text_view);
        hikingTitleTextView.setText(my_description.getHikingTitle());

        ImageView hikingImageView = (ImageView) listItemView.findViewById(R.id.hiking_image_view);
        hikingImageView.setImageResource(my_description.getHikingImgId());

        TextView hikingDuration = (TextView) listItemView.findViewById(R.id.duration_text_view);
        String duration = "Duration: " + my_description.getDuration();
        hikingDuration.setText(duration);

        TextView hikingDifficulty = (TextView) listItemView.findViewById(R.id.difficulty_text_view);
        String difficulty = "Difficulty: " + my_description.getDifficulty();
        hikingDifficulty.setText(difficulty);

        TextView hikingSeasonality = (TextView) listItemView.findViewById(R.id.seasonality_text_view);
        String seasonality = "Seasonality: " + my_description.getSeasonality();
        hikingSeasonality.setText(seasonality);

        TextView hikingMountainsName = (TextView) listItemView.findViewById(R.id.mountains_text_view);
        String mountains = "Mountains: " + my_description.getMountainsName();
        hikingMountainsName.setText(mountains);

        listItemView.setBackgroundResource(R.drawable.rounded_corners);

        return listItemView;
    }

}
