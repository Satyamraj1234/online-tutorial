package com.tutorial.online_tutorial.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "messages")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private Boolean seen;
    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "sender_id",nullable = false)
    private User sender;
    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "receiver_id" , nullable = false)
    private  User receiver;
}
