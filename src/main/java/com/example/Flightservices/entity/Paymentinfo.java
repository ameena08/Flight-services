package com.example.Flightservices.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="payment_info")
public class Paymentinfo {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name= "uuid2",strategy = "org.hibernate.id.UUIDGenerator")

    private String paymentId;
    private String accountNo;
    private String cardType;
    private double amount;
    private Long passengerId;
}
