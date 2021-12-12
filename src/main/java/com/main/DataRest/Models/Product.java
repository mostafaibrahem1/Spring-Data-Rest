package com.main.DataRest.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable=false)
    private String name;


    @Column(nullable=false)
    private double price;


    private LocalDateTime expire;

    @ManyToOne
    @JoinColumn(name="store_id")
    private Store store;


}