package com.eankomah.miniaturepayroll.service.payroll;

import com.eankomah.miniaturepayroll.entity.payroll.Payroll;
import com.eankomah.miniaturepayroll.repository.PayrollRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PayrollService {

    private final PayrollRepository payrollRepository;

    public List<Payroll> getAllPayroll() {
        return payrollRepository.findAll();
    }
}
