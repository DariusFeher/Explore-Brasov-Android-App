package com.example.android.explorebrasov;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HikingFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HikingFragment extends Fragment {

    public HikingFragment() {
        // Required empty public constructor
    }

    /**
     *
     * @return A new instance of fragment HikingFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HikingFragment newInstance() {
        HikingFragment fragment = new HikingFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.items_list, container, false);

        final ArrayList<Hiking> hikings = new ArrayList<Hiking>();
        hikings.add(new Hiking(getString(R.string.hikingTitle1), getString(R.string.hikingDuration1), getString(R.string.difficulty1), getString(R.string.mountains1), getString(R.string.seasonalityWholeYear), R.drawable.mountain1));
        hikings.add(new Hiking(getString(R.string.hikingTitle2), getString(R.string.hikingDuration2), getString(R.string.difficulty1), getString(R.string.mountains1), getString(R.string.seasonalityWholeYear), R.drawable.mountain2));
        hikings.add(new Hiking(getString(R.string.hikingTitle3), getString(R.string.hikingDuration3), getString(R.string.difficulty1), getString(R.string.mountains3), getString(R.string.seasonalityWholeYear), R.drawable.mountain3));
        hikings.add(new Hiking(getString(R.string.hikingTitle4), getString(R.string.hikingDuration4), getString(R.string.difficulty1), getString(R.string.mountains4), getString(R.string.seasonalityWholeYear), R.drawable.mountain4));
        hikings.add(new Hiking(getString(R.string.hikingTitle5), getString(R.string.hikingDuration5), getString(R.string.difficulty5), getString(R.string.mountains5), getString(R.string.seasonality5), R.drawable.mountain5));
        hikings.add(new Hiking(getString(R.string.hikingTitle6), getString(R.string.hikingDuration6), getString(R.string.difficulty1), getString(R.string.mountains6), getString(R.string.seasonalityWholeYear), R.drawable.mountain6));
        hikings.add(new Hiking(getString(R.string.hikingTitle7), getString(R.string.hikingDuration7), getString(R.string.difficulty1), getString(R.string.mountains7), getString(R.string.seasonality7), R.drawable.mountain7));
        HikingAdapter adapter = new HikingAdapter(getActivity(), hikings);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
