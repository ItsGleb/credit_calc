package ru.vtb.online.develop.pojo;

import com.google.gson.annotations.SerializedName;

public class CalculatorResponse {
    @SerializedName("action")
    private String action;
    @SerializedName("createdAt")
    private String createdAt;
    @SerializedName("requestId")
    private String requestId;
    @SerializedName("response")
    private Response response;
    @SerializedName("type")
    private String type;

    public CalculatorResponse(String action, String createdAt, String requestId, Response response, String type) {
        this.action = action;
        this.createdAt = createdAt;
        this.requestId = requestId;
        this.response = response;
        this.type = type;
    }

    // Геттеры и сеттеры
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
