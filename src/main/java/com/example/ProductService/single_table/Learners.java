package com.example.ProductService.single_table;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "st_learners")
@DiscriminatorValue("Learner")
public class Learners extends Users {
    private String college;
    private String company;
}
