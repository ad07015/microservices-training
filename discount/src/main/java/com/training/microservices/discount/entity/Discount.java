package com.training.microservices.discount.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Discount {

    @Id
    @GeneratedValue
    private Long id;
    private Long discount;
    private Long points;
    private String play;

    public Discount() {
    }

    public Long getId() {
        return id;
    }

    public Long getDiscount() {
        return discount;
    }

    public Long getPoints() {
        return points;
    }

    public String getPlay() {
        return play;
    }
}
