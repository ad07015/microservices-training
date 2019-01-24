package com.training.microservices.discount.bean;

import com.training.microservices.discount.entity.Discount;

import java.util.List;

public class DiscountList {

    private List<Discount> discountList;

    public List<Discount> getDiscountList() {
        return discountList;
    }

    public void setDiscountList(List<Discount> discountList) {
        this.discountList = discountList;
    }

    public DiscountList() {
    }
}
