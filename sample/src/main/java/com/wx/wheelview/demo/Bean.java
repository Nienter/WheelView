package com.wx.wheelview.demo;

import java.io.Serializable;

/**
 * @description
 * @auhor niupengkai
 * @time 2018.03.30 10:31
 */

public class Bean implements Serializable {
    private String id;

    public Bean(String id, String name, String time) {
        this.id = id;
        this.name = name;
        this.time = time;
    }

    private String name;
    private String time;
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
