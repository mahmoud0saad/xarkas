package com.mahmoudsaad.xarkas.data.network.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * Created By Mohamed El Banna On 4/26/2020
 **/
public class ReviewResponse {

    /**
     * data : {"user_id":4,"product_id":"10","review":"very good","rating":"5","review_date":{"date":"2020-04-26 11:42:39.236537","timezone_type":3,"timezone":"UTC"},"id":7}
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
         * user_id : 4
         * product_id : 10
         * review : very good
         * rating : 5
         * review_date : {"date":"2020-04-26 11:42:39.236537","timezone_type":3,"timezone":"UTC"}
         * id : 7
         */

        @SerializedName("user_id")
        private int userId;
        @SerializedName("product_id")
        private String productId;
        @SerializedName("review")
        private String review;
        @SerializedName("rating")
        private String rating;
        @SerializedName("review_date")
        private ReviewDateBean reviewDate;
        @SerializedName("id")
        private int id;

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public String getReview() {
            return review;
        }

        public void setReview(String review) {
            this.review = review;
        }

        public String getRating() {
            return rating;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public ReviewDateBean getReviewDate() {
            return reviewDate;
        }

        public void setReviewDate(ReviewDateBean reviewDate) {
            this.reviewDate = reviewDate;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public static class ReviewDateBean {
            /**
             * date : 2020-04-26 11:42:39.236537
             * timezone_type : 3
             * timezone : UTC
             */

            @SerializedName("date")
            private String date;
            @SerializedName("timezone_type")
            private int timezoneType;
            @SerializedName("timezone")
            private String timezone;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public int getTimezoneType() {
                return timezoneType;
            }

            public void setTimezoneType(int timezoneType) {
                this.timezoneType = timezoneType;
            }

            public String getTimezone() {
                return timezone;
            }

            public void setTimezone(String timezone) {
                this.timezone = timezone;
            }
        }
    }
}
