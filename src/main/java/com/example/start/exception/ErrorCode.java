package com.example.start.exception;

public enum ErrorCode {

    USER_EXISTED(1001, "User existed"),
    UNCATEGORIZED(9999, "Uncategorized error"),
    USERNAME_INVALID(1003, "Username must be at least 5 characters"),
    INVALID_PASSWORD(1004, "Password must be at least 8 characters"),
    INVALID_KEY(1001, "Invalid message key"),
    USER_NOT_EXISTED(1005, "User not existed"),
    UNAUTHENTICATED(1006, "Unauthenticated"),
    ;

    private int code;
    private String msg;

    ErrorCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
