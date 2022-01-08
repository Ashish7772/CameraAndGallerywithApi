package com.example.cameraandgallery;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {

    @FormUrlEncoded
    @POST("VnUploadFile")
    Call<ImageClass> uploadImage(@Field("json") String json , @Field("file") String file);
}
