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

    @Column(nullable = false)
    private String employeeId;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Double totalBonus;

    @Column(nullable = false)
    private Double monthlyBonus;

}
