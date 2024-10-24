package com.example.ProductService.joined_table;


import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity(name = "jt_tas")
@PrimaryKeyJoinColumn(name = "user_id")
public class TA extends Users {
    private int numOfQuestions;
    private String college;
}
