package com.training.microservices.loyalty.resource;

import com.training.microservices.loyalty.exception.NoUserWithUUIDException;
import com.training.microservices.loyalty.repo.LoyaltyPointsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class LoyaltyPointsResource {

    @Autowired
    private LoyaltyPointsRepository loyaltyPointsRepository;

    @GetMapping("/points")
    public Long getPointsByUserUUID(@RequestParam("uuid") String uuid) throws NoUserWithUUIDException {
        Optional<Long> points = loyaltyPointsRepository.findPointsByUserUUID(uuid);

        if (!points.isPresent()) {
            throw new NoUserWithUUIDException("No user found with UUID: " + uuid);
        }

        return points.get();
    }
}
