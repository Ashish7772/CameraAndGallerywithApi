package com.example.cameraandgallery;

import com.google.gson.annotations.SerializedName;

public class ImageClass {



    @SerializedName("message")
    private String message;

    @SerializedName("success")
    private  String success;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }
}
