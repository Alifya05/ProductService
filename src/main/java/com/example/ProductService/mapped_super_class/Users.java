package com.example.ProductService.mapped_super_class;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@MappedSuperclass
public class Users {

    @Id
    private int id;
    private String name;
    private String email;
    private String password;

}

