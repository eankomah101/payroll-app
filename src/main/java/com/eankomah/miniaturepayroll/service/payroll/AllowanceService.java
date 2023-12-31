package com.eankomah.miniaturepayroll.service.payroll;

import com.eankomah.miniaturepayroll.dto.CreatingAllowance;
import com.eankomah.miniaturepayroll.entity.payroll.Allowance;
import com.eankomah.miniaturepayroll.mappers.AllowanceMapper;
import com.eankomah.miniaturepayroll.repository.AllowanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AllowanceService {
    private final AllowanceRepository allowanceRepository;
    private final AllowanceMapper<Allowance, CreatingAllowance> allowanceMapper;

    public List<Allowance> getAllAllowance() {
        return allowanceRepository.findAll();

    }

//    public List<Allowance> create(List<Allowance> allowances) {
//        List<Allowance> createAllowances =  new ArrayList<>();
//        allowances.forEach(allowance -> {
//            Allowance allowance1 = new Allowance();
//                    allowance1.setDescription(allowance.getDescription());
//                    allowance1.setMonthlyAllowance(allowance.getMonthlyAllowance());
//                    allowance1.setTotalAllowance(allowance.getTotalAllowance());
//                    allowance1.setMonthlyAllowance(allowance.getMonthlyAllowance());
//                    allowance1.setTotalAllowance(allowance.getTotalAllowance());
//                    createAllowances.add(allowance1);
//
//        });
//        return allowanceRepository.saveAll(createAllowances);
//    }


    public List<Allowance> create(List<CreatingAllowance>allowances) {
        List<Allowance> allowanceList = allowances.stream().map(allowanceMapper:: mapsToEntity)
                .toList();
                return allowanceRepository.saveAll(allowanceList);
    }
    public Allowance update(Long id, Allowance allowance) {
        Allowance allowance1 = allowanceRepository.findById(id).orElseThrow();
        allowance1.setDescription(allowance.getDescription() != null ? allowance.getDescription() : allowance1.getDescription());
        allowance1.setMonthlyAllowance(allowance.getMonthlyAllowance() != null ? allowance.getMonthlyAllowance() : allowance1.getMonthlyAllowance());
        allowance1.setTotalAllowance(allowance.getTotalAllowance() != null ? allowance.getTotalAllowance() : allowance1.getTotalAllowance());
        return allowanceRepository.save(allowance1);
    }


    public void deleteAllById(List<Long> id) {
        List<Allowance> deleteAll = new ArrayList<>();

        id.forEach(allowance -> {
            Allowance allowance1 = allowanceRepository.findById(allowance).orElseThrow();
            deleteAll.add(allowance1);
        });

        allowanceRepository.deleteAll(deleteAll);
    }

}
