package com.example.ProductService.table_per_class;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity(name = "tpc_users")
public class Users {

    @Id
    private int id;
    private String name;
    private String email;
    private String password;

}

