package com.example.android.explorebrasov;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HikingFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    /**
     *
     * @return A new instance of fragment HikingFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HotelsFragment newInstance() {
        HotelsFragment fragment = new HotelsFragment();
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

        final ArrayList<Location> hotels = new ArrayList<Location>();

        hotels.add(new Location(getString(R.string.hotelName1), getString(R.string.hotelPhone1), getString(R.string.hotelAddress1), Float.parseFloat(getString(R.string.hotelRating1))));
        hotels.add(new Location(getString(R.string.hotelName2), getString(R.string.hotelPhone2), getString(R.string.hotelAddress2), Float.parseFloat(getString(R.string.hotelRating2))));
        hotels.add(new Location(getString(R.string.hotelName3), getString(R.string.hotelPhone3), getString(R.string.hotelAddress3), Float.parseFloat(getString(R.string.hotelRating3))));
        hotels.add(new Location(getString(R.string.hotelName4), getString(R.string.hotelPhone4), getString(R.string.hotelAddress4), Float.parseFloat(getString(R.string.hotelRating4))));
        hotels.add(new Location(getString(R.string.hotelName5), getString(R.string.hotelPhone5), getString(R.string.hotelAddress5), Float.parseFloat(getString(R.string.hotelRating5))));
        hotels.add(new Location(getString(R.string.hotelName6), getString(R.string.hotelPhone6), getString(R.string.hotelAddress6), Float.parseFloat(getString(R.string.hotelRating6))));
        hotels.add(new Location(getString(R.string.hotelName7), getString(R.string.hotelPhone7), getString(R.string.hotelAddress7), Float.parseFloat(getString(R.string.hotelRating7))));
        hotels.add(new Location(getString(R.string.hotelName8), getString(R.string.hotelPhone8), getString(R.string.hotelAddress8), Float.parseFloat(getString(R.string.hotelRating8))));
        hotels.add(new Location(getString(R.string.hotelName9), getString(R.string.hotelPhone9), getString(R.string.hotelAddress9), Float.parseFloat(getString(R.string.hotelRating9))));
        hotels.add(new Location(getString(R.string.hotelName10), getString(R.string.hotelPhone10), getString(R.string.hotelAddress10), Float.parseFloat(getString(R.string.hotelRating10))));

        LocationAdapter adapter = new LocationAdapter(getActivity(), hotels);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
