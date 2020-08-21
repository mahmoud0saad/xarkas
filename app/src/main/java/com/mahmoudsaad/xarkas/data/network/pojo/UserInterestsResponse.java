package com.mahmoudsaad.xarkas.data.network.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserInterestsResponse {

    /**
     * data : [{"id":4,"image":"http://167.172.208.67/afaq-web/afaq-web/public/1568709131f6.jpg","name":"Electronic","number_of_arts":23}]
     * status : true
     * message :
     */

    @SerializedName("status")
    private boolean status;
    @SerializedName("message")
    private String message;
    @SerializedName("data")
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 4
         * image : http://167.172.208.67/afaq-web/afaq-web/public/1568709131f6.jpg
         * name : Electronic
         * number_of_arts : 23
         */

        @SerializedName("id")
        private int id;
        @SerializedName("image")
        private String image;
        @SerializedName("name")
        private String name;
        @SerializedName("number_of_arts")
        private int numberOfArts;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNumberOfArts() {
            return numberOfArts;
        }

        public void setNumberOfArts(int numberOfArts) {
            this.numberOfArts = numberOfArts;
        }
    }
}
