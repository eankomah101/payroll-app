package com.eankomah.miniaturepayroll.service.employee;

import com.eankomah.miniaturepayroll.entity.Employee;

public interface EmployeeService {
    Employee createEmployees(Employee employee);

    Employee updateEmployee(Long employeeId,Employee employee);
    public void deactivateEmployee(Long employeeId);
}
