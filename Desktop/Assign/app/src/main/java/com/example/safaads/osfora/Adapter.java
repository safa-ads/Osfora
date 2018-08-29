package com.example.safaads.osfora;



import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

        import java.util.ArrayList;

/**
 * Created by user on 8/28/2018.
 */

class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<Model> imageModelArrayList;
    private ArrayList<Model> arraylist;

    public Adapter(Context context, ArrayList<Model> imageModelArrayList){

        inflater = LayoutInflater.from(context);
        this.imageModelArrayList = imageModelArrayList;
        this.arraylist = new ArrayList<Model>();
        this.arraylist.addAll(MainActivity.movieNamesArrayList);
    }

    @Override
    public Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.tweeter_info, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tweeter_name.setText("Safa Muhammed");
        holder.tweeter_username.setText("safa_muhammed");
        holder.tweeter_followers.setText("1000");
    }


    @Override
    public int getItemCount() {
        return imageModelArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tweeter_name;
        TextView tweeter_username;
        TextView tweeter_followers;
        ImageView tweeter_image;
        ImageView verified_image;


        public MyViewHolder(View itemView) {
            super(itemView);
            tweeter_name = (TextView) itemView.findViewById(R.id.tweeter_name);
            tweeter_username = (TextView) itemView.findViewById(R.id.tweeter_username);
            tweeter_followers = (TextView) itemView.findViewById(R.id.tweeter_follower);
            tweeter_image = (ImageView) itemView.findViewById(R.id.tweeter_image);
            verified_image = (ImageView) itemView.findViewById(R.id.verified_image);
        }

    }
}




