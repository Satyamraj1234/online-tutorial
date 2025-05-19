package com.tutorial.online_tutorial.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "coupons")
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String code;
    @Column(name = "percent_off",nullable = false)
    private Integer percentOff;
    @Column(name = "max_uses")
    private Integer maxUses;
    @Column(name = "expires_at")
    private LocalDateTime expiresAt;
    @OneToMany(mappedBy = "coupon",cascade = CascadeType.ALL)
    private List<CouponRedemption> couponRedemptions =new ArrayList<>();
    @ManyToMany(mappedBy = "coupons")
    private Set<Course> courses = new HashSet<>();

}
