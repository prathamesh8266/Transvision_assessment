package com.example.TRANSVISION_BACKEND.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "admin_table")
public class Admin {
    @Id
    private String id;
    private String name;
    private String password;

}
