package com.example.petadoptioncenter;

import android.os.Parcel;
import android.os.Parcelable;

public class Hero implements Parcelable {
    private String name;
    private Integer photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhoto() {
        return photo;
    }

    public void setPhoto(Integer photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeInt(this.photo);
    }

    Hero() {
    }

    private Hero(Parcel in) {
        this.name = in.readString();
        this.photo = in.readInt();
    }
    public static final Parcelable.Creator<Hero> CREATOR =
            new Parcelable.Creator<Hero>() {
                @Override
                public Hero createFromParcel(Parcel source) {
                    return new Hero(source);
                }
                @Override
                public Hero[] newArray(int size) {
                    return new Hero[size];
                }
            };
}
