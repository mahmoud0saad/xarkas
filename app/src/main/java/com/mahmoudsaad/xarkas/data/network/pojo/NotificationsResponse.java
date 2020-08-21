package com.mahmoudsaad.xarkas.data.network.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NotificationsResponse {


    /**
     * data : [{"id":1,"order_id":5,"user_id":4,"vendor_id":null,"product_id":null,"conversation_id":null,"is_read":1,"created_at":null,"updated_at":"2020-04-29 12:09:43","title":"uhuhuuhuh","body":"hghghgfgfgf","click_action":"/","icon":"hhhgghghjjgjhg"}]
     * status : true
     * message : notifications
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
         * id : 1
         * order_id : 5
         * user_id : 4
         * vendor_id : null
         * product_id : null
         * conversation_id : null
         * is_read : 1
         * created_at : null
         * updated_at : 2020-04-29 12:09:43
         * title : uhuhuuhuh
         * body : hghghgfgfgf
         * click_action : /
         * icon : hhhgghghjjgjhg
         */

        @SerializedName("id")
        private int id;
        @SerializedName("order_id")
        private int orderId;
        @SerializedName("user_id")
        private int userId;
        @SerializedName("vendor_id")
        private Object vendorId;
        @SerializedName("product_id")
        private Object productId;
        @SerializedName("conversation_id")
        private Object conversationId;
        @SerializedName("is_read")
        private int isRead;
        @SerializedName("created_at")
        private Object createdAt;
        @SerializedName("updated_at")
        private String updatedAt;
        @SerializedName("title")
        private String title;
        @SerializedName("body")
        private String body;
        @SerializedName("click_action")
        private String clickAction;
        @SerializedName("icon")
        private String icon;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getOrderId() {
            return orderId;
        }

        public void setOrderId(int orderId) {
            this.orderId = orderId;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public Object getVendorId() {
            return vendorId;
        }

        public void setVendorId(Object vendorId) {
            this.vendorId = vendorId;
        }

        public Object getProductId() {
            return productId;
        }

        public void setProductId(Object productId) {
            this.productId = productId;
        }

        public Object getConversationId() {
            return conversationId;
        }

        public void setConversationId(Object conversationId) {
            this.conversationId = conversationId;
        }

        public int getIsRead() {
            return isRead;
        }

        public void setIsRead(int isRead) {
            this.isRead = isRead;
        }

        public Object getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(Object createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public String getClickAction() {
            return clickAction;
        }

        public void setClickAction(String clickAction) {
            this.clickAction = clickAction;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }
}
