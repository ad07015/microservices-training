package com.training.microservices.offer.bean;

public class LoyaltyBean {
    private long id;
    private long points;
    private String uuid;

    public LoyaltyBean() {
    }

    public LoyaltyBean(long id, long points, String uuid) {
        this.id = id;
        this.points = points;
        this.uuid = uuid;
    }
}
