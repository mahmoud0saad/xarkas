package com.mahmoudsaad.xarkas.data.network.pojo;

public class RestPasswordResponse {

    /**
     * data : null
     * status : false
     * message :
     */

    private Object data;
    private boolean status;
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
