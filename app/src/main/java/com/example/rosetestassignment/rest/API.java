package com.example.rosetestassignment.rest;
import com.example.rosetestassignment.Model.ResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
public interface API {

    @GET("top-headlines")Call<ResponseModel> getLatestNews(@Query("sources") String source, @Query(" 4441a3743cfe4701854cb5c026a9ac7d") String apiKey);
}
