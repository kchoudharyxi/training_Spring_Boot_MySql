package com.training.domain.request;

import com.training.enums.Status;

/**
 * Created by kchoudhary on 03-Oct-16.
 */

public class ResponseStatus {
    private String message;
    private Status status;

    public ResponseStatus(String message, Status status) {
        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

