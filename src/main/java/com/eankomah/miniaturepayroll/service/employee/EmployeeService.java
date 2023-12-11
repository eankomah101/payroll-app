package com.eankomah.miniaturepayroll.service.employee;

import com.eankomah.miniaturepayroll.entity.employee.Employee;
import com.eankomah.miniaturepayroll.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;


    public Employee createEmployees(Employee employee) {
        return employeeRepository.save(employee);
    }



    public Employee updateEmployee(Long employeeId, Employee employee) {
        Employee employeeDb = employeeRepository.findById(employeeId).get();
        updateFieldIfNotEmpty(employee::getFirstName, employeeDb::setFirstName);
        updateFieldIfNotEmpty(employee::getLastName, employeeDb::setLastName);
        updateFieldIfNotEmpty(employee::getOtherNames, employeeDb::setOtherNames);
        updateFieldIfNotEmpty(employee::getEmail, employeeDb::setEmail);
        updateFieldIfNotEmpty(employee::getGender, employeeDb::setGender);
        updateFieldIfNotEmpty(employee::getAccountNumber, employeeDb::setAccountNumber);
        updateFieldIfNotEmpty(employee::getPhoneNumber, employeeDb::setPhoneNumber);
        return employeeRepository.save(employeeDb);
    }

    private void updateFieldIfNotEmpty(Supplier<String> getter, Consumer<String> setter) {
        String value = getter.get();
        if (Objects.nonNull(value) && !"".equalsIgnoreCase(value)) {
            setter.accept(value);
        }
    }



    public void  deactivateEmployee(Long employeeId){
            employeeRepository.deleteById(employeeId);
    }

}
