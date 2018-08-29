package com.example.safaads.osfora;

public class Profile {
    Boolean isCover=false;
    String coverPhoto="";
    Boolean isPhoto=false;
    String profilePhoto="";
    Boolean isVerified=false;
    String profilename="";
    String profileID="";
    String profileDesc="";
    Boolean isLocation=false;
    String locationName="";
    String joinDate="";
    int following;
    int followed;

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public int getFollowed() {
        return followed;
    }

    public void setFollowed(int followed) {
        this.followed = followed;
    }

    public Boolean getCover() {
        return isCover;
    }

    public void setCover(Boolean cover) {
        isCover = cover;
    }

    public String getCoverPhoto() {
        return coverPhoto;
    }

    public void setCoverPhoto(String coverPhoto) {
        this.coverPhoto = coverPhoto;
    }

    public Boolean getPhoto() {
        return isPhoto;
    }

    public void setPhoto(Boolean photo) {
        isPhoto = photo;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public Boolean getVerified() {
        return isVerified;
    }

    public void setVerified(Boolean verifited) {
        isVerified = verifited;
    }

    public String getProfilename() {
        return profilename;
    }

    public void setProfilename(String profilename) {
        this.profilename = profilename;
    }

    public String getProfileID() {
        return profileID;
    }

    public void setProfileID(String profileID) {
        this.profileID = profileID;
    }

    public String getProfileDesc() {
        return profileDesc;
    }

    public void setProfileDesc(String profileDesc) {
        this.profileDesc = profileDesc;
    }

    public Boolean getLocation() {
        return isLocation;
    }

    public void setLocation(Boolean location) {
        isLocation = location;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
}
