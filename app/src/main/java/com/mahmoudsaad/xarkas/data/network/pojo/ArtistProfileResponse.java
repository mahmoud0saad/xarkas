package com.mahmoudsaad.xarkas.data.network.pojo;

public class ArtistProfileResponse {

    /**
     * data : {"id":1,"fullname":"sfd.","email":"manohsaaf@gmail.com","provider_id":null,"ban":0,"image":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/users/1584624850photo","country_id":1,"city_id":1,"phone":"01212479994","type":"artist","address":"mahmoud.magdy1255@gmail.com","followers":3,"following":2,"reviews":0,"rating":"0.0","is_followed":false}
     * status : true
     * message :
     */

    private DataBean data;
    private boolean status;
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
         * id : 1
         * fullname : sfd.
         * email : manohsaaf@gmail.com
         * provider_id : null
         * ban : 0
         * image : http://167.172.208.67/afaq-web/afaq-web/public/assets/images/users/1584624850photo
         * country_id : 1
         * city_id : 1
         * phone : 01212479994
         * type : artist
         * address : mahmoud.magdy1255@gmail.com
         * followers : 3
         * following : 2
         * reviews : 0
         * rating : 0.0
         * is_followed : false
         */

        private int id;
        private String fullname;
        private String email;
        private Object provider_id;
        private int ban;
        private String image;
        private int country_id;
        private int city_id;
        private String phone;
        private String type;
        private String address;
        private int followers;
        private int following;
        private int reviews;
        private String rating;
        private boolean is_followed;

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

        public Object getProvider_id() {
            return provider_id;
        }

        public void setProvider_id(Object provider_id) {
            this.provider_id = provider_id;
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

        public int getCountry_id() {
            return country_id;
        }

        public void setCountry_id(int country_id) {
            this.country_id = country_id;
        }

        public int getCity_id() {
            return city_id;
        }

        public void setCity_id(int city_id) {
            this.city_id = city_id;
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

        public int getFollowers() {
            return followers;
        }

        public void setFollowers(int followers) {
            this.followers = followers;
        }

        public int getFollowing() {
            return following;
        }

        public void setFollowing(int following) {
            this.following = following;
        }

        public int getReviews() {
            return reviews;
        }

        public void setReviews(int reviews) {
            this.reviews = reviews;
        }

        public String getRating() {
            return rating;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public boolean isIs_followed() {
            return is_followed;
        }

        public void setIs_followed(boolean is_followed) {
            this.is_followed = is_followed;
        }
    }
}
