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
 * Use the {@link RestaurantsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    /**
     *
     * @return A new instance of fragment RestaurantsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RestaurantsFragment newInstance() {
        RestaurantsFragment fragment = new RestaurantsFragment();
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

        final ArrayList<Location> restaurants = new ArrayList<Location>();

        restaurants.add(new Location(getString(R.string.restaurantName1), getString(R.string.restaurantPhone1), getString(R.string.restaurantAddress1), Float.parseFloat(getString(R.string.restaurantRating1))));
        restaurants.add(new Location(getString(R.string.restaurantName2), getString(R.string.restaurantPhone2), getString(R.string.restaurantAddress2), Float.parseFloat(getString(R.string.restaurantRating2))));
        restaurants.add(new Location(getString(R.string.restaurantName3), getString(R.string.restaurantPhone3), getString(R.string.restaurantAddress3), Float.parseFloat(getString(R.string.restaurantRating3))));
        restaurants.add(new Location(getString(R.string.restaurantName4), getString(R.string.restaurantPhone4), getString(R.string.restaurantAddress4), Float.parseFloat(getString(R.string.restaurantRating4))));
        restaurants.add(new Location(getString(R.string.restaurantName5), getString(R.string.restaurantPhone5), getString(R.string.restaurantAddress5), Float.parseFloat(getString(R.string.restaurantRating5))));
        restaurants.add(new Location(getString(R.string.restaurantName6), getString(R.string.restaurantPhone6), getString(R.string.restaurantAddress6), Float.parseFloat(getString(R.string.restaurantRating6))));
        restaurants.add(new Location(getString(R.string.restaurantName7), getString(R.string.restaurantPhone7), getString(R.string.restaurantAddress7), Float.parseFloat(getString(R.string.restaurantRating7))));
        restaurants.add(new Location(getString(R.string.restaurantName8), getString(R.string.restaurantPhone8), getString(R.string.restaurantAddress8), Float.parseFloat(getString(R.string.restaurantRating8))));
        restaurants.add(new Location(getString(R.string.restaurantName9), getString(R.string.restaurantPhone9), getString(R.string.restaurantAddress9), Float.parseFloat(getString(R.string.restaurantRating9))));
        restaurants.add(new Location(getString(R.string.restaurantName10), getString(R.string.restaurantPhone10), getString(R.string.restaurantAddress10), Float.parseFloat(getString(R.string.restaurantRating10))));

        LocationAdapter adapter = new LocationAdapter(getActivity(), restaurants);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
