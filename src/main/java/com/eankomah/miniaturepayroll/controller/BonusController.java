package com.eankomah.miniaturepayroll.controller;

import com.eankomah.miniaturepayroll.entity.payroll.Bonus;
import com.eankomah.miniaturepayroll.service.payroll.BonusService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bonus")
@RequiredArgsConstructor
public class BonusController {
    private final BonusService bonusService;
    @GetMapping("/")
    public List<Bonus> getAllBonuses(){
        return  bonusService.getAllBonuses();
    }

    @PostMapping("/createBonus")
    public List<Bonus> createBonus(@RequestBody List<Bonus> bonusList){
        return bonusService.create(bonusList);
    }

    @PutMapping("/update/{id}")
    public Bonus updateBonus(@PathVariable Long id, @RequestBody Bonus bonus){
        return bonusService.update(bonus,id);
    }

    @DeleteMapping("/delete")
    public String deleteAll(@RequestBody List<Long> id){
        bonusService.deleteAllById(id);
        return "Bonus Deleted Successfully";
            }



}
