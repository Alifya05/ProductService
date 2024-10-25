package com.example.ProductService.cardinality.ManytoOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

@Entity
public class Batches {
    @Id
    Long id;
    String name;
    @OneToMany(mappedBy = "b")
    List<Learners> l;
}
