package com.mahmoudsaad.xarkas.data.network.pojo;

import java.util.List;

public class SearchResponse {

    /**
     * data : {"arts":[],"artists":[{"id":1,"fullname":"mahmoud magdy","email":"mahmoud.magdy1255@gmail.com","provider_id":null,"ban":0,"image":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/users","country_id":1,"city_id":1,"phone":"01212479994","type":"artist","address":"mahmoud.magdy1255@gmail.com"},{"id":2,"fullname":"Mohamed El Banna","email":"mel.banna40@gmail.com","provider_id":"firebase","ban":0,"image":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/users/https://lh3.googleusercontent.com/a-/AOh14GiwzQ_R422jnMhSEYF8nTcwEm7_4_ENHZYrSe_ltw=s96-c","country_id":null,"city_id":null,"phone":null,"type":"user","address":null},{"id":3,"fullname":"مني البدر","email":"qa.2006@hotmail.com","provider_id":null,"ban":0,"image":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/users","country_id":null,"city_id":null,"phone":"+97470502050","type":"user","address":null},{"id":4,"fullname":"Maged","email":"maged.ashour2210@gmail.com","provider_id":null,"ban":0,"image":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/users","country_id":null,"city_id":null,"phone":"+201128274509","type":"user","address":null}],"categories":[{"id":7,"image":"http://167.172.208.67/afaq-web/afaq-web/public/1568709597f4.jpg","name":"Smart Phone & Table","number_of_arts":0}]}
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
        private List<PickArtistsResponse.DataBean> arts;
        private List<ExploreredArtistsResponse.DataBean> artists;
        private List<CategoriesResponse.DataBean> categories;

        public List<PickArtistsResponse.DataBean> getArts() {
            return arts;
        }

        public void setArts(List<PickArtistsResponse.DataBean> arts) {
            this.arts = arts;
        }

        public List<ExploreredArtistsResponse.DataBean> getArtists() {
            return artists;
        }

        public void setArtists(List<ExploreredArtistsResponse.DataBean> artists) {
            this.artists = artists;
        }

        public List<CategoriesResponse.DataBean> getCategories() {
            return categories;
        }

        public void setCategories(List<CategoriesResponse.DataBean> categories) {
            this.categories = categories;
        }

        public static class ArtistsBean {
            /**
             * id : 1
             * fullname : mahmoud magdy
             * email : mahmoud.magdy1255@gmail.com
             * provider_id : null
             * ban : 0
             * image : http://167.172.208.67/afaq-web/afaq-web/public/assets/images/users
             * country_id : 1
             * city_id : 1
             * phone : 01212479994
             * type : artist
             * address : mahmoud.magdy1255@gmail.com
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
        }

        public static class CategoriesBean {
            /**
             * id : 7
             * image : http://167.172.208.67/afaq-web/afaq-web/public/1568709597f4.jpg
             * name : Smart Phone & Table
             * number_of_arts : 0
             */

            private int id;
            private String image;
            private String name;
            private int number_of_arts;

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

            public int getNumber_of_arts() {
                return number_of_arts;
            }

            public void setNumber_of_arts(int number_of_arts) {
                this.number_of_arts = number_of_arts;
            }
        }
    }
}
