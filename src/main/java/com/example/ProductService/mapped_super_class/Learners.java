package com.example.ProductService.mapped_super_class;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "msc_learners")
public class Learners extends Users{
    private String college;
    private String company;
}
