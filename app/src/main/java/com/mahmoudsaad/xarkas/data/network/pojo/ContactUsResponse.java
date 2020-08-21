package com.mahmoudsaad.xarkas.data.network.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * Created By Mohamed El Banna On 4/30/2020
 **/
public class ContactUsResponse {

    /**
     * data : {"subject":"subject","message":"message","user_id":4,"updated_at":"2020-04-30 11:49:04","created_at":"2020-04-30 11:49:04","id":1}
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
         * subject : subject
         * message : message
         * user_id : 4
         * updated_at : 2020-04-30 11:49:04
         * created_at : 2020-04-30 11:49:04
         * id : 1
         */

        @SerializedName("subject")
        private String subject;
        @SerializedName("message")
        private String message;
        @SerializedName("user_id")
        private int userId;
        @SerializedName("updated_at")
        private String updatedAt;
        @SerializedName("created_at")
        private String createdAt;
        @SerializedName("id")
        private int id;

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}
