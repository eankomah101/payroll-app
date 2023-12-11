package com.eankomah.miniaturepayroll.controller;

import com.eankomah.miniaturepayroll.entity.payroll.Allowance;
import com.eankomah.miniaturepayroll.service.payroll.AllowanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@RequiredArgsConstructor
public class AllowanceController {
    private final AllowanceService allowanceService;

    @GetMapping("/")
    public List<Allowance> getAllAllowance(){
        return allowanceService.getAllAllowance();
    }

    @PostMapping("/create")
    public List<Allowance>createAllowance(@RequestBody List<Allowance> allowances){
        return allowanceService.create(allowances);
    }
    @PostMapping("/update/{id}")
    public Allowance updateAllowance(@PathVariable Long id ,@RequestBody Allowance allowance){
        return allowanceService.update(id, allowance);
    }

}
