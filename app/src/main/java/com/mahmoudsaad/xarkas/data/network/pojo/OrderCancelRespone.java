package com.mahmoudsaad.xarkas.data.network.pojo;

public class OrderCancelRespone {


    /**
     * data : {"id":70,"user_id":4,"art_id":4,"method":"cod","shipping":"","pickup_location":"","totalQty":1,"pay_amount":0,"payment_status":"","status":"canceld","order_note":"","order_number":0,"created_at":"2020-03-24 11:32:52","updated_at":"2020-03-25 09:33:41","phone_number":"3232","street_name":"jksldfa","user_name":"man","city":"32","building_number":32,"floor":"32","flat_number":"32","total_price":32}
     * status : true
     * message : Success
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
         * id : 70
         * user_id : 4
         * art_id : 4
         * method : cod
         * shipping :
         * pickup_location :
         * totalQty : 1
         * pay_amount : 0
         * payment_status :
         * status : canceld
         * order_note :
         * order_number : 0
         * created_at : 2020-03-24 11:32:52
         * updated_at : 2020-03-25 09:33:41
         * phone_number : 3232
         * street_name : jksldfa
         * user_name : man
         * city : 32
         * building_number : 32
         * floor : 32
         * flat_number : 32
         * total_price : 32
         */

        private int id;
        private int user_id;
        private int art_id;
        private String method;
        private String shipping;
        private String pickup_location;
        private int totalQty;
        private int pay_amount;
        private String payment_status;
        private String status;
        private String order_note;
        private int order_number;
        private String created_at;
        private String updated_at;
        private String phone_number;
        private String street_name;
        private String user_name;
        private String city;
        private int building_number;
        private String floor;
        private String flat_number;
        private int total_price;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public int getArt_id() {
            return art_id;
        }

        public void setArt_id(int art_id) {
            this.art_id = art_id;
        }

        public String getMethod() {
            return method;
        }

        public void setMethod(String method) {
            this.method = method;
        }

        public String getShipping() {
            return shipping;
        }

        public void setShipping(String shipping) {
            this.shipping = shipping;
        }

        public String getPickup_location() {
            return pickup_location;
        }

        public void setPickup_location(String pickup_location) {
            this.pickup_location = pickup_location;
        }

        public int getTotalQty() {
            return totalQty;
        }

        public void setTotalQty(int totalQty) {
            this.totalQty = totalQty;
        }

        public int getPay_amount() {
            return pay_amount;
        }

        public void setPay_amount(int pay_amount) {
            this.pay_amount = pay_amount;
        }

        public String getPayment_status() {
            return payment_status;
        }

        public void setPayment_status(String payment_status) {
            this.payment_status = payment_status;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getOrder_note() {
            return order_note;
        }

        public void setOrder_note(String order_note) {
            this.order_note = order_note;
        }

        public int getOrder_number() {
            return order_number;
        }

        public void setOrder_number(int order_number) {
            this.order_number = order_number;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public String getPhone_number() {
            return phone_number;
        }

        public void setPhone_number(String phone_number) {
            this.phone_number = phone_number;
        }

        public String getStreet_name() {
            return street_name;
        }

        public void setStreet_name(String street_name) {
            this.street_name = street_name;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public int getBuilding_number() {
            return building_number;
        }

        public void setBuilding_number(int building_number) {
            this.building_number = building_number;
        }

        public String getFloor() {
            return floor;
        }

        public void setFloor(String floor) {
            this.floor = floor;
        }

        public String getFlat_number() {
            return flat_number;
        }

        public void setFlat_number(String flat_number) {
            this.flat_number = flat_number;
        }

        public int getTotal_price() {
            return total_price;
        }

        public void setTotal_price(int total_price) {
            this.total_price = total_price;
        }
    }
}
