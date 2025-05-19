package com.tutorial.online_tutorial.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="courses")
public class Course extends BaseEntity{

    @Column(nullable = false)
    private String title;
    private String subtitle;
    @Lob
    private String description;
    private String language;
    private String level;

    private BigDecimal price;
    @Column(name = "discount_price")
    private BigDecimal discount;
    @Column(name = "thumbnail_url")
    private String thumbNail;
    @Column(name = "preview_video_url")
    private String previeVideoUrl;
    private Boolean published;
    @OneToMany(mappedBy = "course",cascade = CascadeType.ALL)
    private Set<OrderItem> orderItems=new HashSet<>();
    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private Set<CartItem> cartItems = new HashSet<>();
    @ManyToMany(mappedBy = "courses")
    private Set<WishList> wishlists = new HashSet<>();
    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private Set<Enrollment> enrollments = new HashSet<>();

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private Set<Review> reviews = new HashSet<>();
    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private Set<Section> sections = new HashSet<>();
    @ManyToMany
    @JoinTable(
            name = "course_tags",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private Set<Tag> tags = new HashSet<>();
    @ManyToMany
    @JoinTable(
            name = "course_coupons",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "coupon_id")
    )
    private Set<Coupon> coupons = new HashSet<>();

}
