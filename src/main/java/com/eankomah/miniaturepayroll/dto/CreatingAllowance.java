package com.eankomah.miniaturepayroll.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.YearMonth;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatingAllowance {

    private Long employeeId;
    private String description;


    private Double totalAllowance;


    private Double monthlyAllowance ;



}
