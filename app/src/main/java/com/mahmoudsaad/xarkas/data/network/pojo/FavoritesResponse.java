package com.mahmoudsaad.xarkas.data.network.pojo;

import java.util.List;

public class FavoritesResponse {

    /**
     * data : [{"id":274,"name":null,"thumbnail":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/products/default.png","likes_count":0,"is_featured":0,"is_favorite":false,"price":1289},{"id":82,"name":null,"thumbnail":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/products/default.png","likes_count":0,"is_featured":0,"is_favorite":false,"price":1523},{"id":158,"name":null,"thumbnail":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/products/default.png","likes_count":0,"is_featured":0,"is_favorite":false,"price":1444},{"id":254,"name":null,"thumbnail":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/products/default.png","likes_count":0,"is_featured":0,"is_favorite":false,"price":1261},{"id":114,"name":null,"thumbnail":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/products/default.png","likes_count":0,"is_featured":0,"is_favorite":false,"price":1335}]
     * status : true
     * message :
     */

    private boolean status;
    private String message;
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
         * id : 274
         * name : null
         * thumbnail : http://167.172.208.67/afaq-web/afaq-web/public/assets/images/products/default.png
         * likes_count : 0
         * is_featured : 0
         * is_favorite : false
         * price : 1289
         */

        private int id;
        private Object name;
        private String thumbnail;
        private int likes_count;
        private int is_featured;
        private boolean is_favorite;
        private int price;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Object getName() {
            return name;
        }

        public void setName(Object name) {
            this.name = name;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public int getLikes_count() {
            return likes_count;
        }

        public void setLikes_count(int likes_count) {
            this.likes_count = likes_count;
        }

        public int getIs_featured() {
            return is_featured;
        }

        public void setIs_featured(int is_featured) {
            this.is_featured = is_featured;
        }

        public boolean isIs_favorite() {
            return is_favorite;
        }

        public void setIs_favorite(boolean is_favorite) {
            this.is_favorite = is_favorite;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }
}
