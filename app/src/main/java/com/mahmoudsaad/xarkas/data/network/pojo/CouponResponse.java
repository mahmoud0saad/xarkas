package com.mahmoudsaad.xarkas.data.network.pojo;

import com.google.gson.annotations.SerializedName;

public class CouponResponse {


    /**
     * data : {"Coupon":{"code":"eqwe","discount":12.22,"end_date":"2026-08-20","status":1,"type":1}}
     * status : true
     * message : Success
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
         * Coupon : {"code":"eqwe","discount":12.22,"end_date":"2026-08-20","status":1,"type":1}
         */

        @SerializedName("Coupon")
        private CouponBean Coupon;

        public CouponBean getCoupon() {
            return Coupon;
        }

        public void setCoupon(CouponBean Coupon) {
            this.Coupon = Coupon;
        }

        public static class CouponBean {
            /**
             * code : eqwe
             * discount : 12.22
             * end_date : 2026-08-20
             * status : 1
             * type : 1
             */

            @SerializedName("code")
            private String code;
            @SerializedName("discount")
            private double discount;
            @SerializedName("end_date")
            private String endDate;
            @SerializedName("status")
            private int status;
            @SerializedName("type")
            private int type;

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public double getDiscount() {
                return discount;
            }

            public void setDiscount(double discount) {
                this.discount = discount;
            }

            public String getEndDate() {
                return endDate;
            }

            public void setEndDate(String endDate) {
                this.endDate = endDate;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }
        }
    }
}
