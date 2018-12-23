package com.pbsi2.mytownvisit;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EconomyFragment extends Fragment {


    public EconomyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.attraction_list, container, false);



        // Create a list of words
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.economy_1, R.string.economy_1_addr, R.string.economy_1_desc,
                R.drawable.parc));
        attractions.add(new Attraction(R.string.economy_2, R.string.economy_2_addr, R.string.economy_2_desc,
                R.drawable.air));
        attractions.add(new Attraction(R.string.economy_3, R.string.economy_3_addr, R.string.economy_3_desc,
                R.drawable.walis));
        attractions.add(new Attraction(R.string.economy_4, R.string.economy_4_addr, R.string.economy_4_desc,
                R.drawable.resto2));
        
        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions,R.color.category_economy );

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootview.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootview;
    }

}
