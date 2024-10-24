package com.example.ProductService.single_table;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "st_tas")
@DiscriminatorValue("TA")
public class TA extends Users {
    private int numOfQuestions;
    private String college;
}
