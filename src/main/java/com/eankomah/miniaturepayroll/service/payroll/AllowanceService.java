package com.eankomah.miniaturepayroll.service.payroll;

import com.eankomah.miniaturepayroll.entity.payroll.Allowance;
import com.eankomah.miniaturepayroll.repository.AllowanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AllowanceService {
    private final AllowanceRepository allowanceRepository;

    public List<Allowance> getAllAllowance() {
        return allowanceRepository.findAll();

    }

    public List<Allowance> create(List<Allowance> allowances) {
        AtomicLong idGenerator = new AtomicLong(1);
        List<Allowance> createAllowances =  new ArrayList<>();
        allowances.stream()
                .map(allowance -> {
                    Allowance allowance1 = new Allowance();
                    allowance1.setId(idGenerator.incrementAndGet());
                    allowance1.setEmployeeId(allowance.getEmployeeId());
                    allowance1.setDescription(allowance.getDescription());
                    allowance1.setMonthlyAllowance(allowance.getMonthlyAllowance());
                    allowance1.setTotalAllowance(allowance.getTotalAllowance());
                    return createAllowances.add(allowance1);
                })
                .collect(Collectors.toList());
                return allowanceRepository.saveAll(createAllowances);

    }
}
