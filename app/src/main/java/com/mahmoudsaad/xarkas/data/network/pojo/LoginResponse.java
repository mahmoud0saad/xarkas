package com.mahmoudsaad.xarkas.data.network.pojo;

public class LoginResponse {


    /**
     * success : true
     * role : Student
     * result : {"ID":269,"UID":"028da31481f839d35b82291abf1271f7","FName":"saadsfa","LName":"dsfsf","FullName":"saadsfa dsfsf","Permissions":null,"Role":"Student","Pic":"/main/assets/images/avatars/userpic.jpg","Email":"manosaadf@gmail.com","Phone":"01094492635","DOB":null,"Address":null,"City":null,"State":null,"Zip_Code":null,"Email_Verified":"false","Phone_Verified":"false","Verification_Code":"4bb1794bcdca36daa51790e8a48c5cd4","Status":"Active","Creation_Datetime":"2020-08-21T13:05:32.000Z"}
     */

    private boolean success;
    private String role;
    private String error;
    private ResultBean result;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * ID : 269
         * UID : 028da31481f839d35b82291abf1271f7
         * FName : saadsfa
         * LName : dsfsf
         * FullName : saadsfa dsfsf
         * Permissions : null
         * Role : Student
         * Pic : /main/assets/images/avatars/userpic.jpg
         * Email : manosaadf@gmail.com
         * Phone : 01094492635
         * DOB : null
         * Address : null
         * City : null
         * State : null
         * Zip_Code : null
         * Email_Verified : false
         * Phone_Verified : false
         * Verification_Code : 4bb1794bcdca36daa51790e8a48c5cd4
         * Status : Active
         * Creation_Datetime : 2020-08-21T13:05:32.000Z
         */

        private int ID;
        private String UID;
        private String FName;
        private String LName;
        private String FullName;
        private Object Permissions;
        private String Role;
        private String Pic;
        private String Email;
        private String Phone;
        private Object DOB;
        private Object Address;
        private Object City;
        private Object State;
        private Object Zip_Code;
        private String Email_Verified;
        private String Phone_Verified;
        private String Verification_Code;
        private String Status;
        private String Creation_Datetime;

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public String getUID() {
            return UID;
        }

        public void setUID(String UID) {
            this.UID = UID;
        }

        public String getFName() {
            return FName;
        }

        public void setFName(String FName) {
            this.FName = FName;
        }

        public String getLName() {
            return LName;
        }

        public void setLName(String LName) {
            this.LName = LName;
        }

        public String getFullName() {
            return FullName;
        }

        public void setFullName(String FullName) {
            this.FullName = FullName;
        }

        public Object getPermissions() {
            return Permissions;
        }

        public void setPermissions(Object Permissions) {
            this.Permissions = Permissions;
        }

        public String getRole() {
            return Role;
        }

        public void setRole(String Role) {
            this.Role = Role;
        }

        public String getPic() {
            return Pic;
        }

        public void setPic(String Pic) {
            this.Pic = Pic;
        }

        public String getEmail() {
            return Email;
        }

        public void setEmail(String Email) {
            this.Email = Email;
        }

        public String getPhone() {
            return Phone;
        }

        public void setPhone(String Phone) {
            this.Phone = Phone;
        }

        public Object getDOB() {
            return DOB;
        }

        public void setDOB(Object DOB) {
            this.DOB = DOB;
        }

        public Object getAddress() {
            return Address;
        }

        public void setAddress(Object Address) {
            this.Address = Address;
        }

        public Object getCity() {
            return City;
        }

        public void setCity(Object City) {
            this.City = City;
        }

        public Object getState() {
            return State;
        }

        public void setState(Object State) {
            this.State = State;
        }

        public Object getZip_Code() {
            return Zip_Code;
        }

        public void setZip_Code(Object Zip_Code) {
            this.Zip_Code = Zip_Code;
        }

        public String getEmail_Verified() {
            return Email_Verified;
        }

        public void setEmail_Verified(String Email_Verified) {
            this.Email_Verified = Email_Verified;
        }

        public String getPhone_Verified() {
            return Phone_Verified;
        }

        public void setPhone_Verified(String Phone_Verified) {
            this.Phone_Verified = Phone_Verified;
        }

        public String getVerification_Code() {
            return Verification_Code;
        }

        public void setVerification_Code(String Verification_Code) {
            this.Verification_Code = Verification_Code;
        }

        public String getStatus() {
            return Status;
        }

        public void setStatus(String Status) {
            this.Status = Status;
        }

        public String getCreation_Datetime() {
            return Creation_Datetime;
        }

        public void setCreation_Datetime(String Creation_Datetime) {
            this.Creation_Datetime = Creation_Datetime;
        }
    }
}
