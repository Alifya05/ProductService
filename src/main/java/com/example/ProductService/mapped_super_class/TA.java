package com.example.ProductService.mapped_super_class;


import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "msc_tas")
public class TA extends Users{
    private int numOfQuestions;
    private String college;
}
