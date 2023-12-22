package com.eankomah.miniaturepayroll.controller;

import com.eankomah.miniaturepayroll.entity.payroll.Payroll;
import com.eankomah.miniaturepayroll.service.payroll.PayrollService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/payroll")
@RequiredArgsConstructor
public class PayrollController {

    private final PayrollService payrollService;
    @GetMapping("/")
    public List<Payroll> getAllPayroll() {
        return payrollService.getAllPayroll();
    }

    @PostMapping("/generate")
    public List<Payroll> generatePayroll(){
        return payrollService.generatePayroll();

    }
}
