package com.eankomah.miniaturepayroll.entity.payroll;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Bonus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String employeeId;


    private String description;


    private Double totalBonus;


    private Double monthlyBonus;

}
