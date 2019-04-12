package com.leifeng.base.net;

public class ServerException extends Throwable{
    private String code;

    private String message;

    public ServerException(String code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }
}
