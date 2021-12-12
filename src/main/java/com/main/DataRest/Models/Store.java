package com.main.DataRest.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Store {
    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;


    @Column
    private String mobile;

    @Column
    private Boolean active;


    @OneToOne
    @JoinColumn(name = "address_id")
    @RestResource(path = "StoreAddress", rel="address")
    private Address address;

    @OneToMany(mappedBy = "store")
    private List<Product> products;

}