package com.example.cameraandgallery;

import com.google.gson.annotations.SerializedName;

public class ImageClass {

    @SerializedName("json")
    private String Json;

    @SerializedName("file")
    private String File;

    @SerializedName("response")
    private  String Response;

    public String getResponse(){
        return Response;
    }
}
