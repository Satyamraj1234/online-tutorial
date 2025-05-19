package com.tutorial.online_tutorial.repository;

import com.tutorial.online_tutorial.entity.CouponRedemption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponRedemptionRepository extends JpaRepository<CouponRedemption,Long> {

}
