package me.hda.melima.hdamelme.login;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserLoginService {
    @POST("/api/users/login")
    Call<UserLogin> userLoginAction(@Body UserLogin userLogin);
}