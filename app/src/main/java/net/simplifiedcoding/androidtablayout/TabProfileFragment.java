package net.simplifiedcoding.androidtablayout;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Belal on 2/3/2016.
 */

public class TabProfileFragment extends Fragment {

    private RecyclerView vertical_recycler_view;
    private ArrayList<String> verticalList_name_ngo;
    private ArrayList<String> verticalList_location_ngo;
    private VerticalAdaptorProfileTab verticalAdapter;
    FloatingActionButton EditProfileFab;

    String[] socialInterest = {"Children" , "Environment" , "Health"};



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.tab4, container, false);

        vertical_recycler_view = (RecyclerView)view.findViewById(R.id.vertical_recycler_view_tab4);
        ListView socialInterestList = (ListView)view.findViewById(R.id.social_interest_list);


        verticalList_name_ngo=new ArrayList<>();
        verticalList_name_ngo.add("Green Peace India Katraj");
        verticalList_name_ngo.add("Child Rights and You (Cry)");
        verticalList_name_ngo.add("Child Rights and You (Cry)");
        verticalList_name_ngo.add("Child Rights and You (Cry)");

        verticalList_location_ngo=new ArrayList<>();
        verticalList_location_ngo.add("Katraj");
        verticalList_location_ngo.add("Warje");
        verticalList_location_ngo.add("Warje");
        verticalList_location_ngo.add("Warje");


          ArrayAdapter adapter = new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_list_item_1,socialInterest);
        socialInterestList.setAdapter(adapter);

        EditProfileFab = (FloatingActionButton) view.findViewById(R.id.fabEditProfile);
        EditProfileFab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getActivity(), "FAB Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });



        verticalAdapter = new VerticalAdaptorProfileTab(verticalList_name_ngo,verticalList_location_ngo);
        LinearLayoutManager verticalLayoutmanager
                = new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false);

        vertical_recycler_view.setLayoutManager(verticalLayoutmanager);

        vertical_recycler_view.setAdapter(verticalAdapter);
        vertical_recycler_view.setHasFixedSize(true);
        vertical_recycler_view.setNestedScrollingEnabled(false);
        return view;
    }
}
