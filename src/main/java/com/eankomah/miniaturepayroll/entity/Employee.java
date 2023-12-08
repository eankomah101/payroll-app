package com.eankomah.miniaturepayroll.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;

import java.util.Date;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String otherNames;
    private String email;
    private String gender;
    private Date hireDate;
    @Column(nullable = false)
    private double monthlySalary;
    private String phoneNumber;
    private String accountNumber;




}
