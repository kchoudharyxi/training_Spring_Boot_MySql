package com.training.enums;

/**
 * Created by kchoudhary on 03-Oct-16.
 */
public enum Status {
    SUCCESS("success"),
    FAILURE("failure");

    private String message;

    Status(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
