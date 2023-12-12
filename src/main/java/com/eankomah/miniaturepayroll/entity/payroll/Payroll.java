package com.eankomah.miniaturepayroll.entity.payroll;

import com.eankomah.miniaturepayroll.entity.employee.Employee;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payroll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long payrollId;
    Bonus bonus = new Bonus();
    private List<Employee> employees;
    private List<Allowance> allowances;
    private List<Bonus> bonuses;
    private Double sumOfAllBonuses = bonus.getTotalBonus();
    private Double basicSalary = 5000.00;
    private Double employeeSSF = 5 % basicSalary;



}
