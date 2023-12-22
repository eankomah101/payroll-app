package com.eankomah.miniaturepayroll.dto;

import com.eankomah.miniaturepayroll.entity.employee.Employee;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.YearMonth;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatingBonus {

    private String description;

    private Double monthlyBonus;

    private Double totalBonus;

    private List<Employee> employees;
}
