package com.mahmoudsaad.xarkas.data.network.pojo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class OrderRequest implements Serializable {
    @SerializedName("user_id")
    int userId;

    @SerializedName("art_id")
    int artId;

    @SerializedName("item_price")
    int itemPrice;

    @SerializedName("total_price")
    double totalPrice;

    @SerializedName("user_name")
    String userName;

    @SerializedName("street_name")
    String streetName;

    @SerializedName("city")
    String city;

    @SerializedName("building_number")
    String buildingNumber;

    @SerializedName("flat_number")
    String flatNumber;

    @SerializedName("floor_number")
    String floorNumber;

    @SerializedName("phone_number")
    String phoneNumber;

    @SerializedName("method")
    String paymentMethod;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getArtId() {
        return artId;
    }

    public void setArtId(int artId) {
        this.artId = artId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "userId=" + userId +
                ", artId=" + artId +
                ", itemPrice=" + itemPrice +
                ", totalPrice=" + totalPrice +
                ", userName='" + userName + '\'' +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", buildingNumber='" + buildingNumber + '\'' +
                ", flatNumber='" + flatNumber + '\'' +
                ", floorNumber='" + floorNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
