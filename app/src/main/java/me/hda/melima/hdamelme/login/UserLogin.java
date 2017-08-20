package me.hda.melima.hdamelme.login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserLogin {

    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("password")
    @Expose
    private String password;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("userId")
    @Expose
    private Integer userId;

    @SerializedName("ttl")
    @Expose
    private Integer ttl;

    @SerializedName("created")
    @Expose
    private String created;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getId() {
        return id;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getTtl() {
        return ttl;
    }

    public String getCreated() {
        return created;
    }

    public UserLogin(String email, String password) {
        this.email = email;
        this.password = password;
    }

}