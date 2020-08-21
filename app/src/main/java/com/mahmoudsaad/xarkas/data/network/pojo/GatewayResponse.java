package com.mahmoudsaad.xarkas.data.network.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GatewayResponse {


    /**
     * data : [{"id":46,"subtitle":"card","title":"Credit Card","details":"<font size=\"3\">card<br><\/font>","status":1,"icon":"f"},{"id":47,"subtitle":"cod","title":"Cash on Delivery","details":"cod<br>","status":1,"icon":"ds"},{"id":49,"subtitle":"AlAhly","title":"AlAhly Bank","details":"AlAhly Bank&nbsp;AlAhly Bank&nbsp;AlAhly Bank&nbsp;AlAhly Bank&nbsp;AlAhly Bank<br>","status":1,"icon":"http://localhost/afaq-web-master/afaq-web2/public/assets/images/payments/158799406790145480_149035673015593_3238552619907547136_n.jpg"}]
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
         * id : 46
         * subtitle : card
         * title : Credit Card
         * details : <font size="3">card<br></font>
         * status : 1
         * icon : f
         */

        @SerializedName("id")
        private int id;
        @SerializedName("subtitle")
        private String subtitle;
        @SerializedName("title")
        private String title;
        @SerializedName("details")
        private String details;
        @SerializedName("status")
        private int status;
        @SerializedName("icon")
        private String icon;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDetails() {
            return details;
        }

        public void setDetails(String details) {
            this.details = details;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }
}
