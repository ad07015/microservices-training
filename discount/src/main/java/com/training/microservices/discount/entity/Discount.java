package com.training.microservices.discount.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Discount {

    @Id
    @GeneratedValue
    private Long id;
    private String description;
    private int discount;
    private Long points;

    public Discount() {
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getDiscount() {
        return discount;
    }

    public Long getPoints() {
        return points;
    }
}
