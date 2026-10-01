package com.example.ems.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
//we use employee dto class to transfer the data between client and server
//when we build rest services we use employeeDTO as response for rest api's
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
