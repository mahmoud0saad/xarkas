package com.mahmoudsaad.xarkas.data.network.pojo;

/**
 * Created By Mohamed El Banna On 4/7/2020
 **/
public class QuestionsResponse {

    private String Question;

    public QuestionsResponse() {
    }

    public QuestionsResponse(String question) {
        Question = question;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }
}
