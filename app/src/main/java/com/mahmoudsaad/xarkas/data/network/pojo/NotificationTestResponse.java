package com.mahmoudsaad.xarkas.data.network.pojo;

import com.google.gson.annotations.SerializedName;

public class NotificationTestResponse {

    /**
     * data : d0-ZGiHHQc-pcHY3sS6kMD:APA91bG40fgKZSg_uM1mXvq1F8XcgcWO0px_G5s0M4Pp2aRRNXk4NXtdle0v8RTliuerIXKldp-y3fLNNMRI4Sp6StLntRqQwAhPmVB3vWXFNNREotufxcaHebTj564MC3IlvOpC_yr6
     * status : true
     * message :
     */

    @SerializedName("data")
    private String data;
    @SerializedName("status")
    private boolean status;
    @SerializedName("message")
    private String message;

    public String getData() {
        return data;
    }

    public void setData(String data) {
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
