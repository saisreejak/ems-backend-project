package com.example.ems.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor // to create a default constructor with no parameters
@AllArgsConstructor // to create a parameterized constructor
@Entity //this specify a class as a jpa entity
@Table(name="employees") //to specify the table details
public class Employee {

    @Id //primarykey
    @GeneratedValue(strategy= GenerationType.IDENTITY ) //this will automatically increment the primary key
    private Long id;

    @Column(name="first_name") //maps a database column with a class field
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="email_id", nullable = false, unique = true)
    private String email;
}
