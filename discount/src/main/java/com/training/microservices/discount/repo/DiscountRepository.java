package com.training.microservices.discount.repo;

import com.training.microservices.discount.entity.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiscountRepository extends JpaRepository<Discount, Long> {

    @Query("select d from Discount d where points <= ?1")
    List<Discount> findDiscountsUnderXPoints(Long maxpoints);
}
