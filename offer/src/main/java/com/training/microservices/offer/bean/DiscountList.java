package com.training.microservices.offer.bean;

import java.io.Serializable;
import java.util.List;

public class DiscountList implements Serializable {

    private List<Discount> discountList;

    public DiscountList() {
    }

    public DiscountList(List<Discount> discountList) {
        this.discountList = discountList;
    }

    public List<Discount> getDiscountList() {
        return discountList;
    }

    public void setDiscountList(List<Discount> discountList) {
        this.discountList = discountList;
    }
}
