package com.eankomah.miniaturepayroll.service.payroll;

import com.eankomah.miniaturepayroll.entity.employee.Employee;
import com.eankomah.miniaturepayroll.entity.payroll.Payroll;
import com.eankomah.miniaturepayroll.repository.EmployeeRepository;
import com.eankomah.miniaturepayroll.repository.PayrollRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PayrollService {

    private final PayrollRepository payrollRepository;
    private final EmployeeRepository employeeRepository;

    public List<Payroll> getAllPayroll() {
        return payrollRepository.findAll();
    }


    public List<Payroll> generatePayroll() {
        ArrayList<Payroll> payrollArrayList = new ArrayList<>();

        List<Employee> employees = employeeRepository.findAll();

        List<Payroll> payrolls = payrollRepository.findAll();

        if (!payrolls.isEmpty())
            payrollRepository.deleteAll();

        for(Employee employee : employees){
            Payroll payroll1 = new Payroll();
            payroll1.setEmployee(employee);
            payroll1.setEmployeeSSF( 5 % employee.getBasicSalary());
            payroll1.setSumOfAllBonuses(200.0);
            sumOfBonuses(employee);

            payrollArrayList.add(payroll1);
        }
            return payrollRepository.saveAll(payrollArrayList);
    }

    public void sumOfBonuses(Employee employee){

        System.out.println("bonuses = " + employee.getBonus().stream().toList());
    }
}

