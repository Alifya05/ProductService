package com.example.ProductService.single_table;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "st_mentors")
@DiscriminatorValue("Mentor")
public class Mentors extends Users {
    private double avg_rating;
    private String currentCompany;
}
