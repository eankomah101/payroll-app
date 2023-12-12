package com.eankomah.miniaturepayroll.controller;

import com.eankomah.miniaturepayroll.entity.employee.Employee;
import com.eankomah.miniaturepayroll.service.employee.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;


    @PostMapping("/create")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        return ResponseEntity.ok(employeeService.createEmployees(employee));

    }

    @PutMapping("/update/{id}")
    public Employee updateEmployees(@PathVariable("id") Long employeeId ,@RequestBody Employee employee){

        return employeeService.updateEmployee(employeeId, employee);

    }

    @DeleteMapping("/deactivate/{id}")
    public String deleteEmployee(@PathVariable("id") Long employeeId){
        employeeService.deactivateEmployee(employeeId);
        return "Employee deactivated successfully.";
    }

}
