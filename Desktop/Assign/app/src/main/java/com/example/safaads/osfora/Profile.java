package com.example.safaads.osfora;

import android.os.Parcel;
import android.os.Parcelable;

public class Profile implements Parcelable {
    private Boolean isCover;
    private String coverPhoto;
    private Boolean isPhoto;
    private String profilePhoto;
    private Boolean isVerified;
    private String profilename;
    private String profileID;
    private String profileDesc;
    private Boolean isLocation;
    private String locationName;
    private String joinDate;
    private int following;
    private int followed;

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

    public Profile() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.isCover);
        dest.writeString(this.coverPhoto);
        dest.writeValue(this.isPhoto);
        dest.writeString(this.profilePhoto);
        dest.writeValue(this.isVerified);
        dest.writeString(this.profilename);
        dest.writeString(this.profileID);
        dest.writeString(this.profileDesc);
        dest.writeValue(this.isLocation);
        dest.writeString(this.locationName);
        dest.writeString(this.joinDate);
        dest.writeInt(this.following);
        dest.writeInt(this.followed);

    }

    protected Profile(Parcel in) {
        this.isCover = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.coverPhoto = in.readString();
        this.isPhoto = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.profilePhoto = in.readString();
        this.isVerified = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.profilename = in.readString();
        this.profileID = in.readString();
        this.profileDesc = in.readString();
        this.isLocation = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.locationName = in.readString();
        this.joinDate = in.readString();
        this.following = in.readInt();
        this.followed = in.readInt();

    }

    public static final Creator<Profile> CREATOR = new Creator<Profile>() {
        @Override
        public Profile createFromParcel(Parcel source) {
            return new Profile(source);
        }

        @Override
        public Profile[] newArray(int size) {
            return new Profile[size];
        }
    };
}
