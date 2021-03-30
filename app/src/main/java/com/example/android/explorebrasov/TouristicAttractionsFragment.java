package com.example.android.explorebrasov;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TouristicAttractionsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TouristicAttractionsFragment extends Fragment {

    public TouristicAttractionsFragment() {
        // Required empty public constructor
    }

    /**
     *
     * @return A new instance of fragment TouristicAttractionsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TouristicAttractionsFragment newInstance() {
        TouristicAttractionsFragment fragment = new TouristicAttractionsFragment();
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

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.drawable.bran_castle, getString(R.string.attractionTitle1), Float.parseFloat(getString(R.string.rating1)), getString(R.string.link1)));
        attractions.add(new Attraction(R.drawable.black_church, getString(R.string.attractionTitle2), Float.parseFloat(getString(R.string.rating2)), getString(R.string.link2)));
        attractions.add(new Attraction(R.drawable.poiana_brasov, getString(R.string.attractionTitle3), Float.parseFloat(getString(R.string.rating3)), getString(R.string.link3)));
        attractions.add(new Attraction(R.drawable.rasnov_citadel, getString(R.string.attractionTitle4), Float.parseFloat(getString(R.string.rating4)), getString(R.string.link4)));
        attractions.add(new Attraction(R.drawable.tampa, getString(R.string.attractionTitle5), Float.parseFloat(getString(R.string.rating5)), getString(R.string.link5)));
        attractions.add(new Attraction(R.drawable.council_square, getString(R.string.attractionTitle6), Float.parseFloat(getString(R.string.rating6)), getString(R.string.link6)));
        attractions.add(new Attraction(R.drawable.seven_ladders_canyon, getString(R.string.attractionTitle7), Float.parseFloat(getString(R.string.rating7)), getString(R.string.link7)));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
