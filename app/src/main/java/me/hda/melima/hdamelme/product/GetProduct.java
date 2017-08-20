package me.hda.melima.hdamelme.product;

import me.hda.melima.hdamelme.generator.ServiceGenerator;
import me.hda.melima.hdamelme.login.Login;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

public class GetProduct {
    String authToken = Login.getAuthToken();


    public void PerformGetProduct() {
        GetProductListService getProductListService = ServiceGenerator.createService(GetProductListService.class, authToken);
        Call<List<GetProductList>> getProductCall = getProductListService.GetProduct();
        getProductCall.clone().enqueue(new Callback<List<GetProductList>>() {
            @Override
            public void onResponse(Call<List<GetProductList>> call, Response<List<GetProductList>> response) {
                if (response.isSuccessful()) {
                    System.out.println(response.body());
                } else {
                    System.out.println(response.errorBody());
                    System.out.println(authToken);
                    //Log.d("Correct errors: \n" + response.errorBody();
                }
            }

            @Override
            public void onFailure(Call<List<GetProductList>> call, Throwable t) {

            }
        });

    }
}
