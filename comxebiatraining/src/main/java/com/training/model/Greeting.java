package com.training.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by kchoudhary on 26-Aug-16.
 */
@Getter
@Setter
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
}

