package com.training.microservices.loyalty.repo;

import com.training.microservices.loyalty.entity.LoyaltyPoints;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoyaltyPointsRepository extends JpaRepository<LoyaltyPoints, Long> {

    @Query("select lp from LoyaltyPoints lp where uuid = ?1")
    Optional<LoyaltyPoints> findPointsByUserUUID(String uuid);
}
