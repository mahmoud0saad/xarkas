package com.mahmoudsaad.xarkas.data.network.pojo;

public class OrderDetailsResponse {


    /**
     * data : {"art_id":2,"user_id":1,"method":"Cash On Delivery","user_name":"","city":"","street_name":"","phone_number":"","building_number":0,"flat_number":"","totalQty":1,"updated_at":{"date":"2020-03-17 09:15:09.000000","timezone_type":3,"timezone":"UTC"},"created_at":{"date":"2020-03-17 09:15:09.000000","timezone_type":3,"timezone":"UTC"},"order_number":0,"total_price":0,"status":""}
     * status : true
     * message :
     */

    private MyOrdersResponse.DataBean data;
    private boolean status;
    private String message;

    public MyOrdersResponse.DataBean getData() {
        return data;
    }

    public void setData(MyOrdersResponse.DataBean data) {
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
