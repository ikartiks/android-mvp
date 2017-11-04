package io.jpotts18.android_mvp.domain.models;

import com.google.gson.annotations.SerializedName;


public class Repo {
    public int id;
    public String name;
    public boolean fork;
    @SerializedName("stargazers_count")
    public int stars;
}
