package com.tutorial.online_tutorial.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false , unique = true)
    private String userName;
    @Column(nullable = false , length =180 , unique = true)
    private String email;
    @Column(nullable = false, length = 255)
    private String password;
//profile
    @Column( nullable = false, length =120)
    private String first_name;
    @Column( nullable = false, length =120)
    private String last_name;
    private String avatarUrl;

    @ManyToMany
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles = new HashSet<>();
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Notification> notifications =new ArrayList<>();
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<CouponRedemption> couponRedemptions =new HashSet<>();
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private Set<Order> orders=new HashSet<>();
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Cart cart;
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private WishList wishlist;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Enrollment> enrollments = new HashSet<>();
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Review> reviews = new HashSet<>();
    @OneToMany(mappedBy = "sender")
    private List<Message> sentMessages;
    @OneToMany(mappedBy = "receiver")
    private List<Message> receivedMessages;



}
