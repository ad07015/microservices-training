package com.training.microservices.offer.entity;

public class Offer {

    private Long id;
    private String play;
    private Long discount;
    private Long pointsCost;
    private Long pointsOwned;

    public Offer() {
    }

    public Long getId() {
        return id;
    }

    public String getPlay() {
        return play;
    }

    public Long getDiscount() {
        return discount;
    }

    public Long getPointsCost() {
        return pointsCost;
    }

    public Long getPointsOwned() {
        return pointsOwned;
    }
}
