package com.example.safaads.osfora;

import java.util.ArrayList;

public class ProfileManager {

    public IProfileManagerListener profileL;
    public Profile profileAttr;

    public void profileDetails(){
        profileAttr = new Profile();
        profileAttr.setCover(true);

        if(profileL != null){
            profileL.onSuccess(profileAttr);
        }

    }
}
