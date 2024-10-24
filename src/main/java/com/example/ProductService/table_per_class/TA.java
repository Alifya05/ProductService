package com.example.ProductService.table_per_class;


import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "tpc_tas")
public class TA extends Users {
    private int numOfQuestions;
    private String college;
}
