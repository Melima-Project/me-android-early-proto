package me.hda.melima.hdamelme.login;

import me.hda.melima.hdamelme.generator.ServiceGenerator;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Login {
    private static String authToken;
    public static String getAuthToken() {
        return authToken;
    }
    public void PerformUserLogin() {
        UserLogin userLogin = new UserLogin("", "");
        UserLoginService service = ServiceGenerator.createService(UserLoginService.class);
        Call<UserLogin> userLoginCall = service.userLoginAction(userLogin);
        userLoginCall.clone().enqueue(new Callback<UserLogin>() {
            @Override
            public void onResponse(Call<UserLogin> call, Response<UserLogin> response) {
                if (response.isSuccessful()) {
                    authToken = response.body().getId();
                    //System.out.println(authToken);
                } else {
                    //Log.d("Correct errors: \n" + response.errorBody();
                }
            }

            @Override
            public void onFailure(Call<UserLogin> call, Throwable t) {

            }
        });
    }
}
