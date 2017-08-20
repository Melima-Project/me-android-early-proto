package me.hda.melima.hdamelme.product;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface GetProductListService {
    @GET("/api/pd")
    Call<List<GetProductList>> GetProduct();
}
