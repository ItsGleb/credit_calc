package ru.vtb.online.develop.pojo;

import com.google.gson.annotations.SerializedName;


public class Response {

    @SerializedName("body")
    private Body body;

    public Response(Body body) {
        this.body = body;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}
