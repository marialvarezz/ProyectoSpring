package com.eoi.ProyectoSpring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    private String name;
    private String secondName;
    private LocalDate birthDate;
    private LocalDateTime registrationDateTime;

    public Customer(String name, String secondName, LocalDate birthDate, LocalDateTime registrationDateTime) {
        this.name = name;
        this.secondName = secondName;
        this.birthDate = birthDate;
        this.registrationDateTime = registrationDateTime;
    }
}
