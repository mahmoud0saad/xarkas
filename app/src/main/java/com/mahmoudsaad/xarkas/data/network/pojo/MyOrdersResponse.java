package com.mahmoudsaad.xarkas.data.network.pojo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class MyOrdersResponse implements Serializable {


    /**
     * data : [{"id":102,"user_id":3,"method":"AlAhly Bank","user_name":"elbanna","city":"sojd","street_name":"mnofia","phone_number":"+201091943234","building_number":0,"flat_number":"","totalQty":1,"created_at":"05 May, 2020","order_number":102,"total_price":61.5,"status":"pending","art":{"id":332,"name":"asd","description":"asd","specifications":"asd","thumbnail":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/thumbnails/15886880161mE6mERf.jpg","likes_count":0,"is_featured":0,"is_favorite":false,"sku":"123","price":123,"rate":0,"amount":0,"sale":0,"user":{"id":1,"fullname":"Mohamed El Banna","email":"mel.banna40@gmail.com","ban":0,"image":"https://lh3.googleusercontent.com/a-/AOh14GiwzQ_R422jnMhSEYF8nTcwEm7_4_ENHZYrSe_ltw=s96-c","country_id":null,"city_id":null,"phone":null,"type":"user","address":"shbeen el koom","is_followed":false,"followers":1},"lang":"en"}}]
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
         * id : 102
         * user_id : 3
         * method : AlAhly Bank
         * user_name : elbanna
         * city : sojd
         * street_name : mnofia
         * phone_number : +201091943234
         * building_number : 0
         * flat_number :
         * totalQty : 1
         * created_at : 05 May, 2020
         * order_number : 102
         * total_price : 61.5
         * status : pending
         * art : {"id":332,"name":"asd","description":"asd","specifications":"asd","thumbnail":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/thumbnails/15886880161mE6mERf.jpg","likes_count":0,"is_featured":0,"is_favorite":false,"sku":"123","price":123,"rate":0,"amount":0,"sale":0,"user":{"id":1,"fullname":"Mohamed El Banna","email":"mel.banna40@gmail.com","ban":0,"image":"https://lh3.googleusercontent.com/a-/AOh14GiwzQ_R422jnMhSEYF8nTcwEm7_4_ENHZYrSe_ltw=s96-c","country_id":null,"city_id":null,"phone":null,"type":"user","address":"shbeen el koom","is_followed":false,"followers":1},"lang":"en"}
         */

        @SerializedName("id")
        private int id;
        @SerializedName("user_id")
        private int userId;
        @SerializedName("method")
        private String method;
        @SerializedName("user_name")
        private String userName;
        @SerializedName("city")
        private String city;
        @SerializedName("street_name")
        private String streetName;
        @SerializedName("phone_number")
        private String phoneNumber;
        @SerializedName("building_number")
        private int buildingNumber;
        @SerializedName("flat_number")
        private String flatNumber;
        @SerializedName("totalQty")
        private int totalQty;
        @SerializedName("created_at")
        private String createdAt;
        @SerializedName("order_number")
        private int orderNumber;
        @SerializedName("total_price")
        private double totalPrice;
        @SerializedName("status")
        private String status;
        @SerializedName("art")
        private ArtBean art;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getMethod() {
            return method;
        }

        public void setMethod(String method) {
            this.method = method;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreetName() {
            return streetName;
        }

        public void setStreetName(String streetName) {
            this.streetName = streetName;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public int getBuildingNumber() {
            return buildingNumber;
        }

        public void setBuildingNumber(int buildingNumber) {
            this.buildingNumber = buildingNumber;
        }

        public String getFlatNumber() {
            return flatNumber;
        }

        public void setFlatNumber(String flatNumber) {
            this.flatNumber = flatNumber;
        }

        public int getTotalQty() {
            return totalQty;
        }

        public void setTotalQty(int totalQty) {
            this.totalQty = totalQty;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public int getOrderNumber() {
            return orderNumber;
        }

        public void setOrderNumber(int orderNumber) {
            this.orderNumber = orderNumber;
        }

        public double getTotalPrice() {
            return totalPrice;
        }

        public void setTotalPrice(double totalPrice) {
            this.totalPrice = totalPrice;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public ArtBean getArt() {
            return art;
        }

        public void setArt(ArtBean art) {
            this.art = art;
        }

        public static class ArtBean {
            /**
             * id : 332
             * name : asd
             * description : asd
             * specifications : asd
             * thumbnail : http://167.172.208.67/afaq-web/afaq-web/public/assets/images/thumbnails/15886880161mE6mERf.jpg
             * likes_count : 0
             * is_featured : 0
             * is_favorite : false
             * sku : 123
             * price : 123
             * rate : 0
             * amount : 0
             * sale : 0
             * user : {"id":1,"fullname":"Mohamed El Banna","email":"mel.banna40@gmail.com","ban":0,"image":"https://lh3.googleusercontent.com/a-/AOh14GiwzQ_R422jnMhSEYF8nTcwEm7_4_ENHZYrSe_ltw=s96-c","country_id":null,"city_id":null,"phone":null,"type":"user","address":"shbeen el koom","is_followed":false,"followers":1}
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
            @SerializedName("amount")
            private int amount;
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

            public int getAmount() {
                return amount;
            }

            public void setAmount(int amount) {
                this.amount = amount;
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
                 * fullname : Mohamed El Banna
                 * email : mel.banna40@gmail.com
                 * ban : 0
                 * image : https://lh3.googleusercontent.com/a-/AOh14GiwzQ_R422jnMhSEYF8nTcwEm7_4_ENHZYrSe_ltw=s96-c
                 * country_id : null
                 * city_id : null
                 * phone : null
                 * type : user
                 * address : shbeen el koom
                 * is_followed : false
                 * followers : 1
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
                private Object phone;
                @SerializedName("type")
                private String type;
                @SerializedName("address")
                private String address;
                @SerializedName("is_followed")
                private boolean isFollowed;
                @SerializedName("followers")
                private int followers;

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

                public Object getPhone() {
                    return phone;
                }

                public void setPhone(Object phone) {
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

                public int getFollowers() {
                    return followers;
                }

                public void setFollowers(int followers) {
                    this.followers = followers;
                }
            }
        }
    }
}
