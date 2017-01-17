package net.simplifiedcoding.androidtablayout;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class VeriticalAdapterPopularNgo extends RecyclerView.Adapter<VeriticalAdapterPopularNgo.MyViewHolder> {

    private List<String> name_ngo_popular_ngo;
    private List<String> detail_ngo_popular_ngo;
    private List<String> date_ngo_popular_ngo;
    private List<String> time_ngo_popular_ngo;
    private List<String> adress_ngo_popular_ngo;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView icon_ngo;
        public TextView name_ngo;
        public TextView detail_ngo;
        public ImageView icon_date;
        public TextView date_ngo;
        public TextView time_ngo;
        public ImageView icon_adress;
        public TextView adress_ngo;



        public MyViewHolder(View view)
        {
            super(view);
            icon_ngo = (ImageView) view.findViewById(R.id.icon_ngo_popular_ngo);
            name_ngo = (TextView) view.findViewById(R.id.name_ngo_popular_ngo);
            detail_ngo = (TextView) view.findViewById(R.id.detail_ngo_popular_ngo);
            icon_date = (ImageView) view.findViewById(R.id.icon_date_popular_ngo);
            date_ngo = (TextView) view.findViewById(R.id.date_ngo_popular_ngo);
            time_ngo = (TextView) view.findViewById(R.id.time_ngo_popular_ngo);
            icon_adress = (ImageView) view.findViewById(R.id.icon_adress_popular_ngo);
            adress_ngo = (TextView) view.findViewById(R.id.adress_ngo_popular_ngo);
        }
    }

    public VeriticalAdapterPopularNgo(List<String> name_ngo_popular_ngo,List<String> detail_ngo_popular_ngo, List<String> date_ngo_popular_ngo, List<String> time_ngo_popular_ngo ,List<String> adress_ngo_popular_ngo)
    {
        this.name_ngo_popular_ngo=name_ngo_popular_ngo;
        this.detail_ngo_popular_ngo=detail_ngo_popular_ngo;
        this.date_ngo_popular_ngo=date_ngo_popular_ngo;
        this.time_ngo_popular_ngo=time_ngo_popular_ngo;
        this.adress_ngo_popular_ngo=adress_ngo_popular_ngo;
    }

    @Override
    public VeriticalAdapterPopularNgo.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.vertical_item_view_tab2, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final VeriticalAdapterPopularNgo.MyViewHolder holder, final int position) {
        holder.name_ngo.setText(name_ngo_popular_ngo.get(position));
        holder.detail_ngo.setText(detail_ngo_popular_ngo.get(position));
        holder.date_ngo.setText(date_ngo_popular_ngo.get(position));
        holder.time_ngo.setText(time_ngo_popular_ngo.get(position));
        holder.adress_ngo.setText(adress_ngo_popular_ngo.get(position));

        holder.name_ngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),holder.name_ngo.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    public int getItemCount() {
        return name_ngo_popular_ngo.size();
    }

}
