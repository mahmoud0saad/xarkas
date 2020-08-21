package com.mahmoudsaad.xarkas.data.network.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FeaturedArtistsResponse {

    /**
     * data : [{"id":10,"name":"Third Event","thumbnail":"https://ensia.com/wp-content/uploads/2018/01/Voices_Arts_main-760x378.jpg","likes_count":0,"is_featured":1,"price":1200},{"id":7,"name":"Third Event","thumbnail":"https://ensia.com/wp-content/uploads/2018/01/Voices_Arts_main-760x378.jpg","likes_count":0,"is_featured":1,"price":1200},{"id":11,"name":"Third Event","thumbnail":"https://ensia.com/wp-content/uploads/2018/01/Voices_Arts_main-760x378.jpg","likes_count":0,"is_featured":1,"price":1200},{"id":8,"name":"Third Event","thumbnail":"https://ensia.com/wp-content/uploads/2018/01/Voices_Arts_main-760x378.jpg","likes_count":0,"is_featured":1,"price":1200},{"id":9,"name":"Third Event","thumbnail":"https://ensia.com/wp-content/uploads/2018/01/Voices_Arts_main-760x378.jpg","likes_count":0,"is_featured":1,"price":1200}]
     * status : false
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
         * id : 10
         * name : Third Event
         * thumbnail : https://ensia.com/wp-content/uploads/2018/01/Voices_Arts_main-760x378.jpg
         * likes_count : 0
         * is_featured : 1
         * price : 1200
         */

        @SerializedName("id")
        private int id;
        @SerializedName("name")
        private String name;
        @SerializedName("thumbnail")
        private String thumbnail;
        @SerializedName("likes_count")
        private int likesCount;
        @SerializedName("is_featured")
        private int isFeatured;
        @SerializedName("price")
        private int price;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public int getLikesCount() {
            return likesCount;
        }

        public void setLikesCount(int likesCount) {
            this.likesCount = likesCount;
        }

        public int getIsFeatured() {
            return isFeatured;
        }

        public void setIsFeatured(int isFeatured) {
            this.isFeatured = isFeatured;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }
}
