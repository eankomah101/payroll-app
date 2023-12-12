package com.eankomah.miniaturepayroll.service.payroll;

import com.eankomah.miniaturepayroll.entity.payroll.Allowance;
import com.eankomah.miniaturepayroll.repository.AllowanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AllowanceService {
    private final AllowanceRepository allowanceRepository;

    public List<Allowance> getAllAllowance() {
        return allowanceRepository.findAll();

    }

//    public List<Allowance> create(List<Allowance> allowances) {
//        AtomicLong idGenerator = new AtomicLong(1);
//        List<Allowance> createAllowances =  new ArrayList<>();
//        allowances.stream()
//                .map(allowance -> {
//                    Allowance allowance1 = new Allowance();
//                    allowance1.setId(idGenerator.incrementAndGet());
//                    allowance1.setEmployeeId(allowance.getEmployeeId());
//                    allowance1.setDescription(allowance.getDescription());
//                    allowance1.setMonthlyAllowance(allowance.getMonthlyAllowance());
//                    allowance1.setTotalAllowance(allowance.getTotalAllowance());
//                    return createAllowances.add(allowance1);
//                })
//                .collect(Collectors.toList());
//                return allowanceRepository.saveAll(createAllowances);
//
//    }


    public List<Allowance> create(List<Allowance> allowances) {
        List<Allowance> createAllowances =  new ArrayList<>();
        allowances.forEach(allowance ->{
            Allowance allowance1 = new Allowance();
                    allowance1.setDescription(allowance.getDescription());
                    allowance1.setMonthlyAllowance(allowance.getMonthlyAllowance());
                    allowance1.setTotalAllowance(allowance.getTotalAllowance());
                    allowance1.setStartDate(allowance.getStartDate());
                    allowance1.setMonthlyAllowance(allowance.getMonthlyAllowance());
                    allowance1.setTotalAllowance(allowance.getTotalAllowance());
                    allowance1.setEndDate(allowance.getEndDate());

                    createAllowances.add(allowance1);

        });
        return allowanceRepository.saveAll(createAllowances);
    }

    public Allowance update(Long id, Allowance allowance) {
        Allowance allowance1 = allowanceRepository.findById(id).orElseThrow();
        allowance1.setDescription(allowance.getDescription() != null ? allowance.getDescription() : allowance1.getDescription());
        allowance1.setMonthlyAllowance(allowance.getMonthlyAllowance() != null ? allowance.getMonthlyAllowance() : allowance1.getMonthlyAllowance());
        allowance1.setTotalAllowance(allowance.getTotalAllowance() != null ? allowance.getTotalAllowance() : allowance1.getTotalAllowance());
        allowance1.setStartDate(allowance.getStartDate() != null ? allowance.getStartDate() : allowance1.getStartDate());
        allowance1.setEndDate(allowance.getEndDate() != null ? allowance.getEndDate() : allowance1.getEndDate());
        return allowanceRepository.save(allowance1);
    }



}
