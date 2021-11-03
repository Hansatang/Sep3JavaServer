package com.example.javaserver;

import com.google.gson.Gson;

public class Message
{
    public String Type;
    public String message;
    private static final Gson gson = new Gson();

    public Message(String message, String type)
    {
        this.message = message;
        Type = type;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static Message fromJson(String json) {
        return gson.fromJson(json, Message.class);
    }

    public String toJson() {
        return gson.toJson(this);
    }
}