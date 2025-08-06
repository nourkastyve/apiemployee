// Entity representing a User in the DataBase
package com.openclassrooms.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity // To indicate that the class Employee is a table in the DataBase
@Table(name = "employees") //To indicate that the class Employee name in the database is employees
@NoArgsConstructor // Equis by JPA to hydrate the Object from the dataBase
@AllArgsConstructor // Generates a constructor that takes all fields as parameters.
@Builder // Pattern Builder for instance creation
public class Employee {
    @Id //to indicat that the primary key of the DataBase
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Informs that the attribute will be manager by the database
    private Long id; //
    @Column(name = "first_name") // Informs that the name in the DataBase
    private String firstname;
    @Column(name = "last_name") // Informs that the name in the DataBase
    private String lastName;

    private String mail;
    private  String password;
}
