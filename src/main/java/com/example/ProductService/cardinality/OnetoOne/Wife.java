package com.example.ProductService.cardinality.OnetoOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Wife {
    @Id
    Long id;
    String name;
    @OneToOne
    Husband h;

}
