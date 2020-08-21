package com.mahmoudsaad.xarkas.data.network.pojo;

public class EventBookingPointResponse {


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


        private int order_id;
        private int event_id;
        private int user_id;
        private String qr_link;
        private String pdf_link;

        public int getOrder_id() {
            return order_id;
        }

        public void setOrder_id(int order_id) {
            this.order_id = order_id;
        }

        public int getEvent_id() {
            return event_id;
        }

        public void setEvent_id(int event_id) {
            this.event_id = event_id;
        }

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public String getQr_link() {
            return qr_link;
        }

        public void setQr_link(String qr_link) {
            this.qr_link = qr_link;
        }

        public String getPdf_link() {
            return pdf_link;
        }

        public void setPdf_link(String pdf_link) {
            this.pdf_link = pdf_link;
        }
    }
}
