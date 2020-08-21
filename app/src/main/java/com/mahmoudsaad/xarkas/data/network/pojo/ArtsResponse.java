package com.mahmoudsaad.xarkas.data.network.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ArtsResponse {

    /**
     * data : [{"id":15,"name":"et","description":"ZRWB6bShuooViN8Vr58KGnKhafnFpwBR4pVF9vaVc8gpV7KNot","specifications":"vAVMUAFJhDGUO68Z5NXr6uF6u378BabRdDkxsWPxl7u3Hr41Vk","thumbnail":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/thumbnails/default.png","likes_count":0,"is_featured":0,"is_favorite":false,"sku":"","price":1140,"rate":100,"sale":0,"user":{"id":1,"fullname":"sfd","email":"sdfsd@gmail.com","ban":0,"image":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/users/1584624850photo","country_id":1,"city_id":1,"phone":"01094492635","type":"artist","address":"mahmoud.magdy1255@gmail.com","is_followed":false},"lang":"en"},{"id":34,"name":"architecto","description":"Jau3h8Qtk5Q2y4kgzKg9lSr2RkD2JCFQRCt3GsgsBKKN35vPwf","specifications":"pg1aiCukT5Sa1nWKNKKXG1IjoHdWUlBlNEVmWpl7HOQgdSJDUV","thumbnail":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/thumbnails/default.png","likes_count":0,"is_featured":1,"is_favorite":false,"sku":"","price":1392,"rate":0,"sale":0,"user":{"id":1,"fullname":"sfd","email":"sdfsd@gmail.com","ban":0,"image":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/users/1584624850photo","country_id":1,"city_id":1,"phone":"01094492635","type":"artist","address":"mahmoud.magdy1255@gmail.com","is_followed":false},"lang":"en"},{"id":203,"name":"porro","description":"onSN99JqCbBy12wmZNWJ86G02vqD8PERimip8BTsbZXcJxEle4","specifications":"xuiTexeEycjVIYWRsjJ9g29GvoPjg24IeB1aehvAVU9xq4i4gX","thumbnail":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/thumbnails/default.png","likes_count":0,"is_featured":0,"is_favorite":false,"sku":"","price":1768,"rate":0,"sale":0,"user":{"id":1,"fullname":"sfd","email":"sdfsd@gmail.com","ban":0,"image":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/users/1584624850photo","country_id":1,"city_id":1,"phone":"01094492635","type":"artist","address":"mahmoud.magdy1255@gmail.com","is_followed":false},"lang":"en"}]
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
         * id : 15
         * name : et
         * description : ZRWB6bShuooViN8Vr58KGnKhafnFpwBR4pVF9vaVc8gpV7KNot
         * specifications : vAVMUAFJhDGUO68Z5NXr6uF6u378BabRdDkxsWPxl7u3Hr41Vk
         * thumbnail : http://167.172.208.67/afaq-web/afaq-web/public/assets/images/thumbnails/default.png
         * likes_count : 0
         * is_featured : 0
         * is_favorite : false
         * sku :
         * price : 1140
         * rate : 100
         * sale : 0
         * user : {"id":1,"fullname":"sfd","email":"sdfsd@gmail.com","ban":0,"image":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/users/1584624850photo","country_id":1,"city_id":1,"phone":"01094492635","type":"artist","address":"mahmoud.magdy1255@gmail.com","is_followed":false}
         * lang : en
         */

        @SerializedName("id")
        private int id;
        @SerializedName("name")
        private String name;
        @SerializedName("description")
        private String description;
        @SerializedName("specifications")
        private String specifications;
        @SerializedName("thumbnail")
        private String thumbnail;
        @SerializedName("likes_count")
        private int likesCount;
        @SerializedName("is_featured")
        private int isFeatured;
        @SerializedName("is_favorite")
        private boolean isFavorite;
        @SerializedName("sku")
        private String sku;
        @SerializedName("price")
        private int price;
        @SerializedName("rate")
        private int rate;
        @SerializedName("sale")
        private int sale;
        @SerializedName("user")
        private UserBean user;
        @SerializedName("lang")
        private String lang;

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

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getSpecifications() {
            return specifications;
        }

        public void setSpecifications(String specifications) {
            this.specifications = specifications;
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

        public boolean isIsFavorite() {
            return isFavorite;
        }

        public void setIsFavorite(boolean isFavorite) {
            this.isFavorite = isFavorite;
        }

        public String getSku() {
            return sku;
        }

        public void setSku(String sku) {
            this.sku = sku;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getRate() {
            return rate;
        }

        public void setRate(int rate) {
            this.rate = rate;
        }

        public int getSale() {
            return sale;
        }

        public void setSale(int sale) {
            this.sale = sale;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public String getLang() {
            return lang;
        }

        public void setLang(String lang) {
            this.lang = lang;
        }

        public static class UserBean {
            /**
             * id : 1
             * fullname : sfd
             * email : sdfsd@gmail.com
             * ban : 0
             * image : http://167.172.208.67/afaq-web/afaq-web/public/assets/images/users/1584624850photo
             * country_id : 1
             * city_id : 1
             * phone : 01094492635
             * type : artist
             * address : mahmoud.magdy1255@gmail.com
             * is_followed : false
             */

            @SerializedName("id")
            private int id;
            @SerializedName("fullname")
            private String fullname;
            @SerializedName("email")
            private String email;
            @SerializedName("ban")
            private int ban;
            @SerializedName("image")
            private String image;
            @SerializedName("country_id")
            private int countryId;
            @SerializedName("city_id")
            private int cityId;
            @SerializedName("phone")
            private String phone;
            @SerializedName("type")
            private String type;
            @SerializedName("address")
            private String address;
            @SerializedName("is_followed")
            private boolean isFollowed;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getFullname() {
                return fullname;
            }

            public void setFullname(String fullname) {
                this.fullname = fullname;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public int getBan() {
                return ban;
            }

            public void setBan(int ban) {
                this.ban = ban;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public int getCountryId() {
                return countryId;
            }

            public void setCountryId(int countryId) {
                this.countryId = countryId;
            }

            public int getCityId() {
                return cityId;
            }

            public void setCityId(int cityId) {
                this.cityId = cityId;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public boolean isIsFollowed() {
                return isFollowed;
            }

            public void setIsFollowed(boolean isFollowed) {
                this.isFollowed = isFollowed;
            }
        }
    }
}
