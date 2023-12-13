package com.eankomah.miniaturepayroll.entity.payroll;
import com.eankomah.miniaturepayroll.entity.employee.Employee;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payroll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long payrollId;
    private Double basicSalary;
    private Double employeeSSF;

    @OneToOne
    private Employee employee;

    private Double sumOfAllBonuses;






}
