package com.mahmoudsaad.xarkas.data.network.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ArtworkDetailResponse {


    /**
     * data : {"id":329,"name":"hhhhhhhhhhhhhhh","description":"oooooooooooooooooo","specifications":"oooooooooooooooooooo","thumbnail":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/thumbnails/1588583717alfjscGj.jpg","likes_count":0,"is_featured":0,"price":444,"sale":0,"amount":0,"youtube_link":"Yotube","is_favorite":false,"images":["http://167.172.208.67/afaq-web/afaq-web/public/assets/images/galleries/1588588687e2GSXzM9.jpg","http://167.172.208.67/afaq-web/afaq-web/public/assets/images/galleries/1588588687RSuYtgrc.jpg","http://167.172.208.67/afaq-web/afaq-web/public/assets/images/galleries/15885886876LNV6jI9.jpg"],"sku":"12305453168","rate":"3.5","ratings":[{"id":21,"user_name":"mahmoud saad","user_image":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/users/1588677608photo","product_id":329,"review":"that's good","rating":5,"review_date":"2020-05-04 10:23:50"},{"id":20,"user_name":"mahmoud saad","user_image":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/users/1588677608photo","product_id":329,"review":"wow","rating":4,"review_date":"2020-05-04 10:08:34"},{"id":22,"user_name":"mahmoud saad","user_image":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/users/1588677608photo","product_id":329,"review":"yyy","rating":3,"review_date":"2020-05-04 10:25:11"}],"user":{"id":6,"fullname":"mahmoud saad","email":"mohamed.fattah95@gmail.com","ban":0,"image":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/users/1584375680photo","country_id":null,"city_id":null,"phone":"01094992956","type":"artist","address":null,"is_followed":false,"followers":4}}
     * status : true
     * message :
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
         * id : 329
         * name : hhhhhhhhhhhhhhh
         * description : oooooooooooooooooo
         * specifications : oooooooooooooooooooo
         * thumbnail : http://167.172.208.67/afaq-web/afaq-web/public/assets/images/thumbnails/1588583717alfjscGj.jpg
         * likes_count : 0
         * is_featured : 0
         * price : 444
         * sale : 0
         * amount : 0
         * youtube_link : Yotube
         * is_favorite : false
         * images : ["http://167.172.208.67/afaq-web/afaq-web/public/assets/images/galleries/1588588687e2GSXzM9.jpg","http://167.172.208.67/afaq-web/afaq-web/public/assets/images/galleries/1588588687RSuYtgrc.jpg","http://167.172.208.67/afaq-web/afaq-web/public/assets/images/galleries/15885886876LNV6jI9.jpg"]
         * sku : 12305453168
         * rate : 3.5
         * ratings : [{"id":21,"user_name":"mahmoud saad","user_image":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/users/1588677608photo","product_id":329,"review":"that's good","rating":5,"review_date":"2020-05-04 10:23:50"},{"id":20,"user_name":"mahmoud saad","user_image":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/users/1588677608photo","product_id":329,"review":"wow","rating":4,"review_date":"2020-05-04 10:08:34"},{"id":22,"user_name":"mahmoud saad","user_image":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/users/1588677608photo","product_id":329,"review":"yyy","rating":3,"review_date":"2020-05-04 10:25:11"}]
         * user : {"id":6,"fullname":"mahmoud saad","email":"mohamed.fattah95@gmail.com","ban":0,"image":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/users/1584375680photo","country_id":null,"city_id":null,"phone":"01094992956","type":"artist","address":null,"is_followed":false,"followers":4}
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
        @SerializedName("price")
        private int price;
        @SerializedName("sale")
        private int sale;
        @SerializedName("amount")
        private int amount;
        @SerializedName("youtube_link")
        private String youtubeLink;
        @SerializedName("is_favorite")
        private boolean isFavorite;
        @SerializedName("sku")
        private String sku;
        @SerializedName("rate")
        private String rate;
        @SerializedName("user")
        private UserBean user;
        @SerializedName("images")
        private List<String> images;
        @SerializedName("ratings")
        private List<RatingsBean> ratings;

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

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getSale() {
            return sale;
        }

        public void setSale(int sale) {
            this.sale = sale;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public String getYoutubeLink() {
            return youtubeLink;
        }

        public void setYoutubeLink(String youtubeLink) {
            this.youtubeLink = youtubeLink;
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

        public String getRate() {
            return rate;
        }

        public void setRate(String rate) {
            this.rate = rate;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }

        public List<RatingsBean> getRatings() {
            return ratings;
        }

        public void setRatings(List<RatingsBean> ratings) {
            this.ratings = ratings;
        }

        public static class UserBean {
            /**
             * id : 6
             * fullname : mahmoud saad
             * email : mohamed.fattah95@gmail.com
             * ban : 0
             * image : http://167.172.208.67/afaq-web/afaq-web/public/assets/images/users/1584375680photo
             * country_id : null
             * city_id : null
             * phone : 01094992956
             * type : artist
             * address : null
             * is_followed : false
             * followers : 4
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
            private String phone;
            @SerializedName("type")
            private String type;
            @SerializedName("address")
            private Object address;
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

            public Object getAddress() {
                return address;
            }

            public void setAddress(Object address) {
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

        public static class RatingsBean {
            /**
             * id : 21
             * user_name : mahmoud saad
             * user_image : http://167.172.208.67/afaq-web/afaq-web/public/assets/images/users/1588677608photo
             * product_id : 329
             * review : that's good
             * rating : 5
             * review_date : 2020-05-04 10:23:50
             */

            @SerializedName("id")
            private int id;
            @SerializedName("user_name")
            private String userName;
            @SerializedName("user_image")
            private String userImage;
            @SerializedName("product_id")
            private int productId;
            @SerializedName("review")
            private String review;
            @SerializedName("rating")
            private int rating;
            @SerializedName("review_date")
            private String reviewDate;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getUserName() {
                return userName;
            }

            public void setUserName(String userName) {
                this.userName = userName;
            }

            public String getUserImage() {
                return userImage;
            }

            public void setUserImage(String userImage) {
                this.userImage = userImage;
            }

            public int getProductId() {
                return productId;
            }

            public void setProductId(int productId) {
                this.productId = productId;
            }

            public String getReview() {
                return review;
            }

            public void setReview(String review) {
                this.review = review;
            }

            public int getRating() {
                return rating;
            }

            public void setRating(int rating) {
                this.rating = rating;
            }

            public String getReviewDate() {
                return reviewDate;
            }

            public void setReviewDate(String reviewDate) {
                this.reviewDate = reviewDate;
            }
        }
    }
}
