package com.tutorial.online_tutorial.entity;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigInteger;
import java.time.Instant;
import java.time.ZonedDateTime;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @CreationTimestamp
    @Column(name="created_at" , updatable = false)
    private ZonedDateTime created_at;
    @UpdateTimestamp
    @Column(name="updated_at" )
    private ZonedDateTime updated_at;
}
