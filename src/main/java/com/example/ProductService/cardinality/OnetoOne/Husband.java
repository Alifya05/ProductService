package com.example.ProductService.cardinality.OnetoOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Husband {
    @Id
    Long id;
    String name;
    @OneToOne(mappedBy = "h")
    Wife w;
    
}
