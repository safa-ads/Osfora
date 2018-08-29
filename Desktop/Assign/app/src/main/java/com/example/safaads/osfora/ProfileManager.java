package com.example.safaads.osfora;

import java.util.ArrayList;

public class ProfileManager {

    public IProfileManagerListener profileL;
    public Profile profileAttr;

    public void profileDetails(){
        profileAttr = new Profile();
        profileAttr.setCover(true);
        profileAttr.setCoverPhoto("http://i.imgur.com/DvpvklR.png");
        profileAttr.setLocation(true);
        profileAttr.setLocationName("Brazil");
        profileAttr.setProfilePhoto("http://i.imgur.com/DvpvklR.png");

        if(profileL != null){
            profileL.onSuccess(profileAttr);
        }

    }
}
