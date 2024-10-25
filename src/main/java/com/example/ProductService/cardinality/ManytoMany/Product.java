package com.example.ProductService.cardinality.ManytoMany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Product {
    @Id
    Long id;
    String name;
    @ManyToMany(mappedBy = "p")
    List<Tag> t;

}
