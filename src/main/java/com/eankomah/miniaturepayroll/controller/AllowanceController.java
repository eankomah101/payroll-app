package com.eankomah.miniaturepayroll.controller;

import com.eankomah.miniaturepayroll.dto.CreatingAllowance;
import com.eankomah.miniaturepayroll.entity.payroll.Allowance;
import com.eankomah.miniaturepayroll.service.payroll.AllowanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/allowance")
@RequiredArgsConstructor
public class AllowanceController {
    private final AllowanceService allowanceService;

    @GetMapping("/")
    public List<Allowance> getAllAllowance(){
        return allowanceService.getAllAllowance();
    }

    @PostMapping("/create")
    public List<Allowance>createAllowance(@RequestBody List<CreatingAllowance> allowanceList){
        return allowanceService.create(allowanceList);
    }
    @PostMapping("/update/{id}")
    public Allowance updateAllowance(@PathVariable Long id ,@RequestBody Allowance allowance){
        return allowanceService.update(id, allowance);
    }
    @DeleteMapping("/delete")
    public String deleteAllByIds(@RequestBody List<Long> id){
        allowanceService.deleteAllById(id);
        return "Allowance deleted Successfully";

    }

}
