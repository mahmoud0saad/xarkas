package com.mahmoudsaad.xarkas.data.network.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CategoriesResponse {
    public CategoriesResponse() {
    }

    /**
     * data : [{"id":4,"image":"http://167.172.208.67/afaq-web/afaq-web/public/1568709131f6.jpg","name":"Electronic","number_of_arts":9},{"id":5,"image":"http://167.172.208.67/afaq-web/afaq-web/public/1568709123f1.jpg","name":"Fashion & Beauty","number_of_arts":0},{"id":6,"image":"http://167.172.208.67/afaq-web/afaq-web/public/1568709110f2.jpg","name":"Camera & Photo","number_of_arts":0},{"id":7,"image":"http://167.172.208.67/afaq-web/afaq-web/public/1568709597f4.jpg","name":"Smart Phone & Table","number_of_arts":0},{"id":8,"image":"http://167.172.208.67/afaq-web/afaq-web/public/1568709577f8.jpg","name":"Sport & Outdoor","number_of_arts":0},{"id":9,"image":"http://167.172.208.67/afaq-web/afaq-web/public/1568709077f7.jpg","name":"Jewelry & Watches","number_of_arts":0},{"id":10,"image":"http://167.172.208.67/afaq-web/afaq-web/public/1568709067f3.jpg","name":"Health & Beauty","number_of_arts":0},{"id":11,"image":"http://167.172.208.67/afaq-web/afaq-web/public/1568709050f8.jpg","name":"Books & Office","number_of_arts":0},{"id":12,"image":"http://167.172.208.67/afaq-web/afaq-web/public/1568709042f9.jpg","name":"Toys & Hobbies","number_of_arts":0},{"id":13,"image":"http://167.172.208.67/afaq-web/afaq-web/public/1568709037f10.jpg","name":"Books","number_of_arts":0},{"id":15,"image":"http://167.172.208.67/afaq-web/afaq-web/public/1568709031f11.jpg","name":"Automobiles & Motorcycles","number_of_arts":0},{"id":16,"image":"http://167.172.208.67/afaq-web/afaq-web/public/1568709027f12.jpg","name":"Home decoration & Appliance","number_of_arts":0},{"id":17,"image":"http://167.172.208.67/afaq-web/afaq-web/public/","name":"Portable & Personal Electronics","number_of_arts":0},{"id":18,"image":"http://167.172.208.67/afaq-web/afaq-web/public/","name":"Outdoor, Recreation & Fitness","number_of_arts":0},{"id":19,"image":"http://167.172.208.67/afaq-web/afaq-web/public/","name":"Surveillance Safety & Security","number_of_arts":0}]
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
         * number_of_arts : 9
         */

        private boolean isInterest = false;

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

        public boolean isInterest() {
            return isInterest;
        }

        public void setInterest(boolean interest) {
            isInterest = interest;
        }
    }
}
