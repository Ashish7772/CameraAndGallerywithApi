package com.example.cameraandgallery;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiInterface {

    @Multipart
    @POST("VnUploadFile")
            Call<ImageClass> uploadImage(
            @Part MultipartBody.Part file,
            @Part("name") RequestBody requestBody
    );
}
