package com.example.ProductService.joined_table;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Inheritance(strategy = InheritanceType.JOINED)
@Entity(name = "jt_users")
public class Users {
    @Id
    private int id;
    private String name;
    private String email;
    private String password;

}

