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

    @Column(nullable = false)
    private Double totalAllowance = 0.0;

    @Column(nullable = false)
    private Double monthlyAllowance = 0.0;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM")
    private YearMonth startDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM")
    private YearMonth endDate;


}
