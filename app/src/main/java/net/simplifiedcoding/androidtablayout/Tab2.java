
package net.simplifiedcoding.androidtablayout;

        import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Belal on 2/3/2016.
 */

public class Tab2 extends Fragment {

    private RecyclerView recycle_view;
    private ArrayList<String> name_ngo_popular_ngo;
    private ArrayList<String> detail_ngo_popular_ngo;
    private ArrayList<String> adress_ngo_popular_ngo;
    private ArrayList<String> date_ngo_popular_ngo;
    private ArrayList<String> time_ngo_popular_ngo;
    private VeriticalAdapterPopularNgo verticalAdapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab2, container, false);

        recycle_view = (RecyclerView)view.findViewById(R.id.recyle_view);


        name_ngo_popular_ngo=new ArrayList<>();
        name_ngo_popular_ngo.add("Hosted by NGO Name");
        name_ngo_popular_ngo.add("Hosted by NGO Name");
        name_ngo_popular_ngo.add("Hosted by NGO Name");
        name_ngo_popular_ngo.add("Hosted by NGO Name");

        detail_ngo_popular_ngo=new ArrayList<>();
        detail_ngo_popular_ngo.add("Detail name of the Event");
        detail_ngo_popular_ngo.add("Detail name of the Event");
        detail_ngo_popular_ngo.add("Detail name of the Event");
        detail_ngo_popular_ngo.add("Detail name of the Event");

        adress_ngo_popular_ngo=new ArrayList<>();
        adress_ngo_popular_ngo.add("Synerzip, Warje");
        adress_ngo_popular_ngo.add("VIIT Pune");
        adress_ngo_popular_ngo.add("Synerzip, Warje");
        adress_ngo_popular_ngo.add("VIIT,Pune");

        date_ngo_popular_ngo=new ArrayList<>();
        date_ngo_popular_ngo.add("Saturday, January 4");
        date_ngo_popular_ngo.add("Friday, February 10");
        date_ngo_popular_ngo.add("Friday, February 10");
        date_ngo_popular_ngo.add("Friday, February 10");

        time_ngo_popular_ngo=new ArrayList<>();
        time_ngo_popular_ngo.add("10:00 AM - 1:00 PM");
        time_ngo_popular_ngo.add("10:00 AM - 1:00 PM");
        time_ngo_popular_ngo.add("10:00 AM - 1:00 PM");
        time_ngo_popular_ngo.add("10:00 AM - 1:00 PM");






        verticalAdapter = new VeriticalAdapterPopularNgo(name_ngo_popular_ngo , detail_ngo_popular_ngo , date_ngo_popular_ngo , time_ngo_popular_ngo , adress_ngo_popular_ngo);
        LinearLayoutManager verticalLayoutmanager
                = new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false);

        recycle_view.setLayoutManager(verticalLayoutmanager);

        recycle_view.setAdapter(verticalAdapter);
        return view;
    }
}
