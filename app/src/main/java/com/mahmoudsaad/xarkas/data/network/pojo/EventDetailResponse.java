package com.mahmoudsaad.xarkas.data.network.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EventDetailResponse {


    /**
     * data : {"id":117,"name":"Artsy x Capsule Auctions: Contemporary Living","details":"Artsy x Capsule Auctions present&nbsp;Contemporary Living, featuring hand-selected works by&nbsp;Ugo Rondinone,&nbsp;Andy Warhol,&nbsp;Sterling Ruby,&nbsp;Francis Alÿs, and more, curated by Artsy.","date_from":"2020-05-05","date_to":"2020-06-06","location":"","city_id":1,"country_id":0,"category_id":19,"user_id":0,"longitude":"21","latitude":"21.5","location_image":"","ticket_price":37,"total_tickets":22,"available_tickets":22,"sell_point_number":22,"is_featured":0,"thumbnail":"http://167.172.208.67/afaq-web/afaq-web/public/assets/images/events/1588692424download (7).jpg","images":["http://167.172.208.67/afaq-web/afaq-web/public/assets/images/galleries/1588692424download (1).jpg","http://167.172.208.67/afaq-web/afaq-web/public/assets/images/galleries/1588692424download.jpg","http://167.172.208.67/afaq-web/afaq-web/public/assets/images/galleries/1588692424large.jpg"],"is_saved":false,"is_booked":false,"ticket":null}
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
         * id : 117
         * name : Artsy x Capsule Auctions: Contemporary Living
         * details : Artsy x Capsule Auctions present&nbsp;Contemporary Living, featuring hand-selected works by&nbsp;Ugo Rondinone,&nbsp;Andy Warhol,&nbsp;Sterling Ruby,&nbsp;Francis Alÿs, and more, curated by Artsy.
         * date_from : 2020-05-05
         * date_to : 2020-06-06
         * location :
         * city_id : 1
         * country_id : 0
         * category_id : 19
         * user_id : 0
         * longitude : 21
         * latitude : 21.5
         * location_image :
         * ticket_price : 37
         * total_tickets : 22
         * available_tickets : 22
         * sell_point_number : 22
         * is_featured : 0
         * thumbnail : http://167.172.208.67/afaq-web/afaq-web/public/assets/images/events/1588692424download (7).jpg
         * images : ["http://167.172.208.67/afaq-web/afaq-web/public/assets/images/galleries/1588692424download (1).jpg","http://167.172.208.67/afaq-web/afaq-web/public/assets/images/galleries/1588692424download.jpg","http://167.172.208.67/afaq-web/afaq-web/public/assets/images/galleries/1588692424large.jpg"]
         * is_saved : false
         * is_booked : false
         * ticket : null
         */

        @SerializedName("id")
        private int id;
        @SerializedName("name")
        private String name;
        @SerializedName("details")
        private String details;
        @SerializedName("date_from")
        private String dateFrom;
        @SerializedName("date_to")
        private String dateTo;
        @SerializedName("location")
        private String location;
        @SerializedName("city_id")
        private int cityId;
        @SerializedName("country_id")
        private int countryId;
        @SerializedName("category_id")
        private int categoryId;
        @SerializedName("user_id")
        private int userId;
        @SerializedName("longitude")
        private String longitude;
        @SerializedName("latitude")
        private String latitude;
        @SerializedName("location_image")
        private String locationImage;
        @SerializedName("ticket_price")
        private int ticketPrice;
        @SerializedName("total_tickets")
        private int totalTickets;
        @SerializedName("available_tickets")
        private int availableTickets;
        @SerializedName("sell_point_number")
        private int sellPointNumber;
        @SerializedName("is_featured")
        private int isFeatured;
        @SerializedName("thumbnail")
        private String thumbnail;
        @SerializedName("is_saved")
        private boolean isSaved;
        @SerializedName("is_booked")
        private boolean isBooked;
        @SerializedName("ticket")
        private String  ticket;
        @SerializedName("images")
        private List<String> images;

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

        public String getDetails() {
            return details;
        }

        public void setDetails(String details) {
            this.details = details;
        }

        public String getDateFrom() {
            return dateFrom;
        }

        public void setDateFrom(String dateFrom) {
            this.dateFrom = dateFrom;
        }

        public String getDateTo() {
            return dateTo;
        }

        public void setDateTo(String dateTo) {
            this.dateTo = dateTo;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public int getCityId() {
            return cityId;
        }

        public void setCityId(int cityId) {
            this.cityId = cityId;
        }

        public int getCountryId() {
            return countryId;
        }

        public void setCountryId(int countryId) {
            this.countryId = countryId;
        }

        public int getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(int categoryId) {
            this.categoryId = categoryId;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getLocationImage() {
            return locationImage;
        }

        public void setLocationImage(String locationImage) {
            this.locationImage = locationImage;
        }

        public int getTicketPrice() {
            return ticketPrice;
        }

        public void setTicketPrice(int ticketPrice) {
            this.ticketPrice = ticketPrice;
        }

        public int getTotalTickets() {
            return totalTickets;
        }

        public void setTotalTickets(int totalTickets) {
            this.totalTickets = totalTickets;
        }

        public int getAvailableTickets() {
            return availableTickets;
        }

        public void setAvailableTickets(int availableTickets) {
            this.availableTickets = availableTickets;
        }

        public int getSellPointNumber() {
            return sellPointNumber;
        }

        public void setSellPointNumber(int sellPointNumber) {
            this.sellPointNumber = sellPointNumber;
        }

        public int getIsFeatured() {
            return isFeatured;
        }

        public void setIsFeatured(int isFeatured) {
            this.isFeatured = isFeatured;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public boolean isIsSaved() {
            return isSaved;
        }

        public void setIsSaved(boolean isSaved) {
            this.isSaved = isSaved;
        }

        public boolean isIsBooked() {
            return isBooked;
        }

        public void setIsBooked(boolean isBooked) {
            this.isBooked = isBooked;
        }

        public String  getTicket() {
            return ticket;
        }

        public void setTicket(String  ticket) {
            this.ticket = ticket;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }
}
