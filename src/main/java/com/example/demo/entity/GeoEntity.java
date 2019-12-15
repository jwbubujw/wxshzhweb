package com.example.demo.entity;

import javax.persistence.Entity;

@Entity
public class GeoEntity {
    private String id;
    private String smx;
    private String smy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSmx() {
        return smx;
    }

    public void setSmx(String smx) {
        this.smx = smx;
    }

    public String getSmy() {
        return smy;
    }

    public void setSmy(String smy) {
        this.smy = smy;
    }
}
