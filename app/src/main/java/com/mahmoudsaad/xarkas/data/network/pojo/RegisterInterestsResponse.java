package com.mahmoudsaad.xarkas.data.network.pojo;

import com.google.gson.annotations.SerializedName;

public class RegisterInterestsResponse {

    /**
     * data : null
     * status : true
     * message :
     */

    @SerializedName("data")
    private Object data;
    @SerializedName("status")
    private boolean status;
    @SerializedName("message")
    private String message;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
