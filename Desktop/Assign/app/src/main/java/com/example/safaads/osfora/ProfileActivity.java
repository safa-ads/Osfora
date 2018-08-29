package com.example.safaads.osfora;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;


import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileActivity  extends AppCompatActivity implements IProfileManagerListener  {

    private ProfileManager profileM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {

            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                    WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
        setContentView(R.layout.account_layout);

        profileM = new ProfileManager();
        profileM.profileL = this;
        profileM.profileDetails();
    }


    @Override
    public void onSuccess(Profile results) {

        //Set cover photo and placeholder if no cover photo
        ImageView coverPhoto =  findViewById(R.id.cover_photo);
        Picasso.get()
                .load(results.getCoverPhoto())
                .placeholder(R.drawable.ic_apple)
                .error(R.drawable.ic_error)
                .into(coverPhoto);

        //Set profile photo and placeholder if no profile photo
        CircleImageView profilePhoto =  findViewById(R.id.profile_image);
        Picasso.get()
                .load(results.getProfilePhoto())
                .placeholder(R.drawable.ic_apple)
                .error(R.drawable.ic_error)
                .into(profilePhoto);

        //Set verification and none if not verified
        ImageView verify = findViewById(R.id.verify_image);
        if(results.getVerified()){
            verify.setVisibility(View.VISIBLE);
        }else{
            verify.setVisibility(View.GONE);
        }

        //Set Name of account, id and description
        TextView profileName = findViewById(R.id.profile_name);
        profileName.setText(results.getProfilename());
        TextView profileID = findViewById(R.id.profile_id);
        profileID.setText(results.getProfileID());
        TextView profileDesc = findViewById(R.id.profile_desc);
        profileDesc.setText(results.getProfileDesc());

        //Set Location and none if no location
        ImageView location = findViewById(R.id.image_location);
        TextView locationName = findViewById(R.id.text_location);
        if(results.getLocation()){
            location.setVisibility(View.VISIBLE);
            locationName.setVisibility(View.VISIBLE);
            locationName.setText(results.getLocationName());
        }else{
            location.setVisibility(View.GONE);
            locationName.setVisibility(View.GONE);
        }

        Log.i("hello", "onSuccess: " + results);
    }

    @Override
    public void onError() {

    }
}
