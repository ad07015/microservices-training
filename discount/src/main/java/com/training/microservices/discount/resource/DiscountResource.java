package com.training.microservices.discount.resource;

import com.training.microservices.discount.entity.Discount;
import com.training.microservices.discount.repo.DiscountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiscountResource {

    @Autowired
    private DiscountRepository discountRepository;

    @GetMapping("/discounts")
    public List<Discount> retrieveAllDiscounts() {
        return discountRepository.findAll();
    }
}
