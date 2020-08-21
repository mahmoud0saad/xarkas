package com.mahmoudsaad.xarkas.data.network.pojo;

import java.util.List;

public class SavedEventResponse {

    /**
     * data : [{"id":2,"name":null,"details":null,"date_from":"2020-07-03","date_to":"2020-07-15","location":"silicon vally","ticket_price":1000,"is_featured":0,"thumbnail":"","is_saved":false}]
     * status : true
     * message :
     */

    private boolean status;
    private String message;
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
         * id : 2
         * name : null
         * details : null
         * date_from : 2020-07-03
         * date_to : 2020-07-15
         * location : silicon vally
         * ticket_price : 1000
         * is_featured : 0
         * thumbnail :
         * is_saved : false
         */

        private int id;
        private Object name;
        private Object details;
        private String date_from;
        private String date_to;
        private String location;
        private int ticket_price;
        private int is_featured;
        private String thumbnail;
        private boolean is_saved;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Object getName() {
            return name;
        }

        public void setName(Object name) {
            this.name = name;
        }

        public Object getDetails() {
            return details;
        }

        public void setDetails(Object details) {
            this.details = details;
        }

        public String getDate_from() {
            return date_from;
        }

        public void setDate_from(String date_from) {
            this.date_from = date_from;
        }

        public String getDate_to() {
            return date_to;
        }

        public void setDate_to(String date_to) {
            this.date_to = date_to;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public int getTicket_price() {
            return ticket_price;
        }

        public void setTicket_price(int ticket_price) {
            this.ticket_price = ticket_price;
        }

        public int getIs_featured() {
            return is_featured;
        }

        public void setIs_featured(int is_featured) {
            this.is_featured = is_featured;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public boolean isIs_saved() {
            return is_saved;
        }

        public void setIs_saved(boolean is_saved) {
            this.is_saved = is_saved;
        }
    }
}
