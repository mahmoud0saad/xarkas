package com.mahmoudsaad.xarkas.data.network.pojo;

public class ForgetPasswordResponse {

    /**
     * data : {"code":"bwv3PAABmHI42X2zcoBNEQ7MRn826bKj"}
     * status : true
     * message : Your Password Reseted Successfully. Please Check your email for new Password.
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
         * code : bwv3PAABmHI42X2zcoBNEQ7MRn826bKj
         */

        private String code;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }
    }
}
