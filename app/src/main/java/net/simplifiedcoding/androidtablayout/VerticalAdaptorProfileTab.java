package net.simplifiedcoding.androidtablayout;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class VerticalAdaptorProfileTab extends RecyclerView.Adapter<VerticalAdaptorProfileTab.MyViewHolder> {

    private List<String> verticalList_name_ngo;
    private List<String> verticalList_location_ngo;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView icon_profile;
        public TextView name_ngo_profile;
        public ImageView icon_location;
        public TextView location_name;
        public MyViewHolder(View view)
        {
            super(view);
            icon_profile = (ImageView) view.findViewById(R.id.icon_ngo_profilepage);
            name_ngo_profile = (TextView) view.findViewById(R.id.name_ngo_profilepage);
            icon_location = (ImageView) view.findViewById(R.id.icon_place_profilepage);
            location_name = (TextView) view.findViewById(R.id.place_name_ngo_profilepage);
        }
    }

    public VerticalAdaptorProfileTab(List<String> verticalList_name_ngo,List<String>verticalList_location_ngo)
    {
        this.verticalList_name_ngo = verticalList_name_ngo;
        this.verticalList_location_ngo = verticalList_location_ngo;
    }

    @Override
    public VerticalAdaptorProfileTab.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.vertical_item_view_tab4, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final VerticalAdaptorProfileTab.MyViewHolder holder, final int position) {
        holder.name_ngo_profile.setText(verticalList_name_ngo.get(position));
        holder.location_name.setText(verticalList_location_ngo.get(position));


        holder.name_ngo_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),holder.name_ngo_profile.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    public int getItemCount() {
        return verticalList_name_ngo.size();
    }

}
