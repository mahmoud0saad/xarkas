package com.mahmoudsaad.xarkas.data.network.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * Created By Mohamed El Banna On 5/3/2020
 **/
public class ReportResponse {

    /**
     * data : {"note":"bad one","user_id":4,"updated_at":"2020-05-03 14:56:50","created_at":"2020-05-03 14:56:50","id":1}
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
         * note : bad one
         * user_id : 4
         * updated_at : 2020-05-03 14:56:50
         * created_at : 2020-05-03 14:56:50
         * id : 1
         */

        @SerializedName("note")
        private String note;
        @SerializedName("user_id")
        private int userId;
        @SerializedName("updated_at")
        private String updatedAt;
        @SerializedName("created_at")
        private String createdAt;
        @SerializedName("id")
        private int id;

        public String getNote() {
            return note;
        }

        public void setNote(String note) {
            this.note = note;
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
