package com.training.microservices.offer.bean;

import java.io.Serializable;

public class LoyaltyPoints implements Serializable {

    private long id;
    private long points;
    private String uuid;

    public LoyaltyPoints() {
    }

    public LoyaltyPoints(long id, long points, String uuid) {
        this.id = id;
        this.points = points;
        this.uuid = uuid;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPoints() {
        return points;
    }

    public void setPoints(long points) {
        this.points = points;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
