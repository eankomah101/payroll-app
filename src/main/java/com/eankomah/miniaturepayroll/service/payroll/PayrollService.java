package com.eankomah.miniaturepayroll.service.payroll;

import com.eankomah.miniaturepayroll.entity.employee.Employee;
import com.eankomah.miniaturepayroll.entity.payroll.Payroll;
import com.eankomah.miniaturepayroll.repository.EmployeeRepository;
import com.eankomah.miniaturepayroll.repository.PayrollRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PayrollService {

    private final PayrollRepository payrollRepository;
    private final EmployeeRepository employeeRepository;

    public List<Payroll> getAllPayroll() {
        return payrollRepository.findAll();
    }


    public Payroll generatePayroll(Payroll payroll) {
        //Employee employee = new Employee();
//        Bonus bonus = new Bonus();
//        Payroll payroll1 = new Payroll();
//        payroll1.setEmployee();
//        payroll1.setBasicSalary(employee.getMonthlySalary());
//        payroll1.setSumOfAllBonuses(bonus.getTotalBonus());
//        payroll1.setEmployeeSSF( 5 % payroll.getBasicSalary());
//        return payrollRepository.save(payroll);
        List<Employee> employees = employeeRepository.findAll();

        for(Employee employee : employees){
            Payroll payroll1 = new Payroll();
            payroll1.setEmployee(employee);
            payroll1.setEmployeeSSF( 5 % employee.getBasicSalary());
            payroll1.setSumOfAllBonuses(payroll1.getSumOfAllBonuses());
        }
            return payrollRepository.save(payroll);
    }
}
