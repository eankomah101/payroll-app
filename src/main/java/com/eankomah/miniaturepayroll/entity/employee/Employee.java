package com.eankomah.miniaturepayroll.entity.employee;

import com.eankomah.miniaturepayroll.entity.payroll.Bonus;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.YearMonth;
@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    private String firstName;
    private String lastName;
    private String otherNames;
    private String email;
    private String gender;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM")
    private YearMonth hireDate;
    @Column(nullable = false)
    private double monthlySalary;
    private String phoneNumber;
    private String accountNumber;

    @OneToOne
    private Bonus bonus;


}
