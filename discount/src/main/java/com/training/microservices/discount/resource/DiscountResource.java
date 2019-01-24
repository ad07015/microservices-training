package com.training.microservices.discount.resource;

import com.training.microservices.discount.bean.DiscountList;
import com.training.microservices.discount.entity.Discount;
import com.training.microservices.discount.repo.DiscountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class DiscountResource {

    public static final int MAX_DISCOUNT_COUNT = 10;
    @Autowired
    private DiscountRepository discountRepository;

    @GetMapping("/discounts")
    public DiscountList retrieveAllDiscounts(@RequestParam("under") Optional<Long> under) {
        List<Discount> result = new LinkedList<>();
        if (under.isPresent()) {
            result = discountRepository.findDiscountsUnderXPoints(under.get());
        } else {
            result = discountRepository.findAll();
        }
        List<Discount> discounts = result.stream().limit(MAX_DISCOUNT_COUNT).collect(Collectors.toList());
        DiscountList discountList = new DiscountList();
        discountList.setDiscountList(discounts);
        return discountList;
    }
}
