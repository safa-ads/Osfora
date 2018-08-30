package com.example.safaads.osfora;

public class ProfileManager{

    public IProfileManagerListener profileL;
    public Profile profileAttr;


    public void profileDetails(String profileID){ // search with profileID in API
        profileAttr = new Profile();
        //cover photo settings
        profileAttr.setCover(true);
        profileAttr.setCoverPhoto("http://i.imgur.com/DvpvklR.png");
        //location settings
        profileAttr.setLocation(true);
        profileAttr.setLocationName("Brazil");
        //profile photo settings
        profileAttr.setPhoto(true);
        profileAttr.setProfilePhoto("http://i.imgur.com/DvpvklR.png");
        //profile info
        profileAttr.setProfilename("Narihan Ellaithy");
        profileAttr.setProfileID(profileID);
        profileAttr.setProfileDesc("Machine learning!!");
        profileAttr.setJoinDate("Joined on July 2013");
        profileAttr.setFollowing(59);
        profileAttr.setFollowed(10000000);
        profileAttr.setVerified(true);


        if(profileL != null){
            profileL.onSuccess(profileAttr);
        }

    }
}

