package com.dto;

import java.io.Serializable;

/**
 * Created by zhouchunjie on 16/1/6.
 */
public class Planet implements Serializable {
    int id;
    String name;

    public Planet(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
