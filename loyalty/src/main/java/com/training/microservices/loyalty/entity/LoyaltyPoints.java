package com.training.microservices.loyalty.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LOYALTYPOINTS")
public class LoyaltyPoints {

    @Id
    @GeneratedValue
    private long id;
    private long points;
    private String uuid;

    public LoyaltyPoints() {
    }

    public long getId() {
        return id;
    }

    public long getPoints() {
        return points;
    }

    public String getUuid() {
        return uuid;
    }
}
