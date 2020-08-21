package com.mahmoudsaad.xarkas.data.network.pojo;

import com.google.gson.annotations.SerializedName;

public class UpdateProfileResponse {

    /**
     * data : {"id":332,"fullname":"mahmoud saad","email":"manosaaf@gmail.com","ban":0,"image":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/users/1588168235photo","country_id":null,"city_id":null,"phone":null,"type":"artist","address":"jff","is_followed":false}
     * status : true
     * message : Updated Successfully
     */

    @SerializedName("data")
    private DataBean data;
    @SerializedName("status")
    private boolean status;
    @SerializedName("message")
    private String message;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
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

    public static class DataBean {
        /**
         * id : 332
         * fullname : mahmoud saad
         * email : manosaaf@gmail.com
         * ban : 0
         * image : http://167.172.208.67/afaq-web/afaq-web/public/assets/images/users/1588168235photo
         * country_id : null
         * city_id : null
         * phone : null
         * type : artist
         * address : jff
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
        private Object countryId;
        @SerializedName("city_id")
        private Object cityId;
        @SerializedName("phone")
        private String  phone;
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

        public Object getCountryId() {
            return countryId;
        }

        public void setCountryId(Object countryId) {
            this.countryId = countryId;
        }

        public Object getCityId() {
            return cityId;
        }

        public void setCityId(Object cityId) {
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
