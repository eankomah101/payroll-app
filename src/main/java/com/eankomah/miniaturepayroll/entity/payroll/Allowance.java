package com.eankomah.miniaturepayroll.entity.payroll;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Allowance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    @Column(nullable = false)
    private String employeeId;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Double totalAllowance;

    @Column(nullable = false)
    private Double monthlyAllowance;






}
