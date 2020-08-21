package com.mahmoudsaad.xarkas.data.network.pojo.chatbot;

import java.util.List;

/**
 * Created By Mohamed El Banna On 4/5/2020
 **/
public class MessageResponse {
    private String userName;
    private String message;
    private String imageProfile;
    private int sentType;
    private List<String> botOptions;

    public MessageResponse() {
    }

    public MessageResponse(String userName, String message) {
        this.userName = userName;
        this.message = message;
    }

    public String getImageProfile() {
        return imageProfile;
    }

    public void setImageProfile(String imageProfile) {
        this.imageProfile = imageProfile;
    }

    public int getSentType() {
        return sentType;
    }

    public void setSentType(int sentType) {
        this.sentType = sentType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getBotOptions() {
        return botOptions;
    }

    public void setBotOptions(List<String> botOptions) {
        this.botOptions = botOptions;
    }
}
