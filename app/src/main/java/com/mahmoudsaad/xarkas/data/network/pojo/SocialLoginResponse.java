package com.mahmoudsaad.xarkas.data.network.pojo;

import com.google.gson.annotations.SerializedName;

public class SocialLoginResponse {

    /**
     * data : {"user":{"id":20,"fullname":"fullname","email":"email@email.com","provider_id":"118418618914168498","ban":0,"image":"image","country_id":"1","city_id":"1","phone":"01212479994","type":"user","address":""},"api_token":"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwOlwvXC8xNjcuMTcyLjIwOC42N1wvYWZhcS13ZWJcL2FmYXEtd2ViXC9wdWJsaWNcL1wvYXBpXC9zb2NpYWwtYXV0aCIsImlhdCI6MTU4MjA0Mzc0NywiZXhwIjoxNTgyMDQ3MzQ3LCJuYmYiOjE1ODIwNDM3NDcsImp0aSI6IjJJdm1tSmJ3bVlmSWJOMjkiLCJzdWIiOjIwLCJwcnYiOiIyM2JkNWM4OTQ5ZjYwMGFkYjM5ZTcwMWM0MDA4NzJkYjdhNTk3NmY3In0.f6zB9MPy8a1gYwEsqOoVdLclqepWTEJZovZ75HxLG_E"}
     * status : true
     * message : Logged in successfully
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
         * user : {"id":20,"fullname":"fullname","email":"email@email.com","provider_id":"118418618914168498","ban":0,"image":"image","country_id":"1","city_id":"1","phone":"01212479994","type":"user","address":""}
         * api_token : eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwOlwvXC8xNjcuMTcyLjIwOC42N1wvYWZhcS13ZWJcL2FmYXEtd2ViXC9wdWJsaWNcL1wvYXBpXC9zb2NpYWwtYXV0aCIsImlhdCI6MTU4MjA0Mzc0NywiZXhwIjoxNTgyMDQ3MzQ3LCJuYmYiOjE1ODIwNDM3NDcsImp0aSI6IjJJdm1tSmJ3bVlmSWJOMjkiLCJzdWIiOjIwLCJwcnYiOiIyM2JkNWM4OTQ5ZjYwMGFkYjM5ZTcwMWM0MDA4NzJkYjdhNTk3NmY3In0.f6zB9MPy8a1gYwEsqOoVdLclqepWTEJZovZ75HxLG_E
         */

        @SerializedName("user")
        private UserBean user;
        @SerializedName("api_token")
        private String apiToken;

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public String getApiToken() {
            return apiToken;
        }

        public void setApiToken(String apiToken) {
            this.apiToken = apiToken;
        }

        public static class UserBean {
            /**
             * id : 20
             * fullname : fullname
             * email : email@email.com
             * provider_id : 118418618914168498
             * ban : 0
             * image : image
             * country_id : 1
             * city_id : 1
             * phone : 01212479994
             * type : user
             * address :
             */

            @SerializedName("id")
            private int id;
            @SerializedName("fullname")
            private String fullname;
            @SerializedName("email")
            private String email;
            @SerializedName("provider_id")
            private String providerId;
            @SerializedName("ban")
            private int ban;
            @SerializedName("image")
            private String image;
            @SerializedName("country_id")
            private String countryId;
            @SerializedName("city_id")
            private String cityId;
            @SerializedName("phone")
            private String phone;
            @SerializedName("type")
            private String type;
            @SerializedName("address")
            private String address;

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

            public String getProviderId() {
                return providerId;
            }

            public void setProviderId(String providerId) {
                this.providerId = providerId;
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

            public String getCountryId() {
                return countryId;
            }

            public void setCountryId(String countryId) {
                this.countryId = countryId;
            }

            public String getCityId() {
                return cityId;
            }

            public void setCityId(String cityId) {
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
        }
    }
}
