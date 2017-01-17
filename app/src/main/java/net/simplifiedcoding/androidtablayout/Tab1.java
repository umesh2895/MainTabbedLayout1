package net.simplifiedcoding.androidtablayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

//Our class extending fragment
public class Tab1 extends Fragment {

    private RecyclerView horizontal_recycler_view;
    private ArrayList<String> horizontalList;
    private HorizontalAdapter horizontalAdapter;
    //Overriden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Returning the layout file after inflating
        //Change R.layout.tab1 in you classes
        View view=inflater.inflate(R.layout.tab1, container, false);
        //return inflater.inflate(R.layout.tab1, container, false);
        horizontal_recycler_view= (RecyclerView)view.findViewById(R.id.horizontal_recycler_view);

        horizontalList=new ArrayList<>();
        horizontalList.add("Green Peace India Katraj");
        horizontalList.add("Child Rights and You (Cry)");
        horizontalList.add("NGO 3");
        horizontalList.add("NGO 4");
        horizontalList.add("NGO 5");
        horizontalList.add("NGO 6");
        horizontalList.add("NGO 7");
        horizontalList.add("NGO 8");

        horizontalAdapter=new HorizontalAdapter(horizontalList);
        LinearLayoutManager verticalLayoutmanager
                = new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false);
        LinearLayoutManager horizontalLayoutManagaer
                = new LinearLayoutManager(view.getContext(), LinearLayoutManager.HORIZONTAL, false);
        horizontal_recycler_view.setLayoutManager(horizontalLayoutManagaer);

        horizontal_recycler_view.setAdapter(horizontalAdapter);


        // called when See all button clicked
        Button button = (Button)view.findViewById(R.id.seeAllButtonId);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View view) {
                Toast.makeText(getActivity(), "See all button clicked...", Toast.LENGTH_SHORT).show();
            }
        });



        return view;

    }
}
