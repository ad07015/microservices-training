package com.training.microservices.offer.resource;

import com.training.microservices.offer.bean.Discount;
import com.training.microservices.offer.bean.DiscountList;
import com.training.microservices.offer.bean.LoyaltyPoints;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.websocket.server.PathParam;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class OfferResource {

    public static final String DISCOUNTS_URL = "http://localhost:8090/discounts";
    public static final String LOYALTY_POINTS_URL = "http://localhost:8080/points";
    public static final int MAX_DISCOUNT_COUNT = 10;

    @GetMapping("/offers")
    public DiscountList getOffers(@PathParam("uuid") Optional<String> uuid) {
        DiscountList discountList = new RestTemplate().getForObject(DISCOUNTS_URL, DiscountList.class);
        if (uuid.isPresent()) {
            LoyaltyPoints loyaltyPoints = getLoyaltyPoints(uuid.get());
            List<Discount> affordableDiscounts = discountList.getDiscountList().stream()
                    .filter(disc -> disc.getPoints() <= loyaltyPoints.getPoints())
                    .limit(MAX_DISCOUNT_COUNT)
                    .collect(Collectors.toList());
            return new DiscountList(affordableDiscounts);
        } else {
            LinkedList<Discount> genericDiscounts = new LinkedList<>();
            genericDiscounts.add(new Discount(20001L, 5L, 0L, "5% off any play"));
            genericDiscounts.add(new Discount(20002L, 10L, 0L, "10% off any play when buying two tickets"));
            return new DiscountList(genericDiscounts);
        }

    }

    private LoyaltyPoints getLoyaltyPoints(String uuid) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(LOYALTY_POINTS_URL)
                .queryParam("uuid", uuid);
        return new RestTemplate().getForObject(uriBuilder.toUriString(), LoyaltyPoints.class);
    }
}
