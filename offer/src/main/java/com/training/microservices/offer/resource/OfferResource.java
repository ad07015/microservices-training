package com.training.microservices.offer.resource;

import com.training.microservices.offer.bean.Discount;
import com.training.microservices.offer.bean.DiscountList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class OfferResource {
    
    @GetMapping("/offers")
    public DiscountList getOffers() {
        RestTemplate restTemplate = new RestTemplate();
        String offersUrl = "http://localhost:8090/discounts/";
        return restTemplate.getForObject(offersUrl, DiscountList.class);
    }
}
