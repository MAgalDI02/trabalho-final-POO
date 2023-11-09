package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "products")

public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long product_id;
    private String name;
    private float price;
    private int quantity;

}
