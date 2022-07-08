package com.example.product.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private Long paymentId;

    private int amount;

    private String status;

    @CreationTimestamp
    private Timestamp created;

    @UpdateTimestamp
    private Timestamp updated;

}
