package com.example.safaads.osfora;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import static com.example.safaads.osfora.R.style.MyActionBar;

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
        ImageView coverPhoto = findViewById(R.id.cover_photo);
        Picasso.get()
                .load("http://i.imgur.com/DvpvklR.png")
                .placeholder(R.drawable.ic_apple)
                .error(R.drawable.ic_error)
                .into(coverPhoto);
//        Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(coverPhoto);
        Log.i("hello", "onSuccess: " + results);
    }

    @Override
    public void onError() {

    }
}
