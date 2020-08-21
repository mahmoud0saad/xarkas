package com.mahmoudsaad.xarkas.data.network.pojo;

public class SaveUnSaveEventResponse {

    /**
     * data :
     * status : true
     * message : unsaved
     */

    private String data;
    private boolean status;
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
