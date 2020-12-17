package com.atguigu.springcloud.entities;

import java.io.Serializable;

/**
 * Created by ${yangshun} on 2020/12/11.
 */
public class Payment implements Serializable {
    private Long id;
    private String serial;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}
