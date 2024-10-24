package com.example.ProductService.single_table;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "user_type", discriminatorType = DiscriminatorType.STRING)
@Entity(name = "st_users")
public class Users {

    @Id
    private int id;
    private String name;
    private String email;
    private String password;

}

