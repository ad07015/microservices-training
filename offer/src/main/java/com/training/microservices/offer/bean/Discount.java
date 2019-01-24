package com.training.microservices.offer.bean;

import java.io.Serializable;

public class Discount implements Serializable {

    private Long id;
    private Long discount;
    private Long points;
    private String play;

    public Discount() {
    }

    public Discount(Long id, Long discount, Long points, String play) {
        this.id = id;
        this.discount = discount;
        this.points = points;
        this.play = play;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDiscount() {
        return discount;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    public Long getPoints() {
        return points;
    }

    public void setPoints(Long points) {
        this.points = points;
    }

    public String getPlay() {
        return play;
    }

    public void setPlay(String play) {
        this.play = play;
    }
}
