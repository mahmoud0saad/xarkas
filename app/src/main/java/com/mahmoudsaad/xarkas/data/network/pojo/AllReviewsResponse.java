package com.mahmoudsaad.xarkas.data.network.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created By Mohamed El Banna On 4/27/2020
 **/
public class AllReviewsResponse {


    /**
     * data : [{"id":6,"user_name":"sxdfcgv hbjnkm, sadf.","user_image":"http://167.172.208.67/afaq-web/afaq-web/public/users/1584374067Capture.PNG","product_id":10,"review":"that is very very good","rating":5,"review_date":"2020-04-26 11:40:25"},{"id":5,"user_name":"sxdfcgv hbjnkm, sadf.","user_image":"http://167.172.208.67/afaq-web/afaq-web/public/users/1584374067Capture.PNG","product_id":10,"review":"that is very very good","rating":5,"review_date":"2020-04-26 11:28:51"},{"id":2,"user_name":"sxdfcgv hbjnkm, sadf.","user_image":"http://167.172.208.67/afaq-web/afaq-web/public/users/1584374067Capture.PNG","product_id":10,"review":"that is very very good","rating":5,"review_date":"2020-04-26 11:16:52"}]
     * status : true
     * message :
     */

    @SerializedName("status")
    private boolean status;
    @SerializedName("message")
    private String message;
    @SerializedName("data")
    private List<ArtworkDetailResponse.DataBean.RatingsBean> data;

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

    public List<ArtworkDetailResponse.DataBean.RatingsBean> getData() {
        return data;
    }

    public void setData(List<ArtworkDetailResponse.DataBean.RatingsBean> data) {
        this.data = data;
    }
}
