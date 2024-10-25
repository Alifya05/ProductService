package com.example.ProductService.cardinality.ManytoOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Learners {
    @Id
    Long id;
    String name;
      @ManyToOne
      Batches b;
}
