package com.eankomah.miniaturepayroll.service.payroll;

import com.eankomah.miniaturepayroll.entity.payroll.Allowance;
import com.eankomah.miniaturepayroll.entity.payroll.Bonus;
import com.eankomah.miniaturepayroll.repository.BonusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
@RequiredArgsConstructor
@Service
public class BonusService {

    private final BonusRepository bonusRepository;

    public List<Bonus> getAllBonuses() {
        return bonusRepository.findAll();
    }

    public List<Bonus> create(List<Bonus> bonusList) {
        AtomicLong idGenerator = new AtomicLong(1);
                List<Bonus> Allbonuses = new ArrayList<>();
                bonusList.stream()
                .map(bonus -> {
                    Bonus bonus1 = new Bonus();
                    bonus1.setId(idGenerator.incrementAndGet());
                    bonus1.setEmployeeId(bonus.getEmployeeId());
                    bonus1.setDescription(bonus.getDescription());
                    bonus1.setStartDate(bonus.getStartDate());
                    bonus1.setEndDate(bonus.getEndDate());
                    bonus1.setMonthlyBonus(bonus.getMonthlyBonus());
                    bonus1.setTotalBonus(bonus.getTotalBonus());

                  return Allbonuses.add(bonus1);

                })
                .collect(Collectors.toList());
                return bonusRepository.saveAll(Allbonuses);
    }


    public Bonus update(Bonus bonus, Long id) {
        Bonus bonus1 = bonusRepository.findById(id).orElseThrow();
        bonus1.setDescription(bonus.getDescription() != null? bonus.getDescription() : bonus1.getDescription());
        bonus1.setMonthlyBonus(bonus.getMonthlyBonus() != null? bonus.getMonthlyBonus() : bonus1.getMonthlyBonus());
        bonus1.setTotalBonus(bonus.getTotalBonus() != null? bonus.getTotalBonus() : bonus1.getTotalBonus());
        bonus1.setStartDate(bonus.getStartDate() != null? bonus.getStartDate() : bonus1.getStartDate());
        bonus1.setEndDate(bonus.getEndDate() != null? bonus.getEndDate() : bonus1.getEndDate());
        bonus1.setDescription(bonus.getDescription() != null? bonus.getDescription() : bonus1.getDescription());
      return bonusRepository.save(bonus1);
    }

    public void deleteAll(List<Long> id) {
        List<Bonus> deleteAll = new ArrayList<>();
        id.stream()
        .map(bonus ->{
                Bonus bonus1 = bonusRepository.findById(bonus.longValue()).orElseThrow();
                return deleteAll.add(bonus1);
                }

        );
        bonusRepository.deleteAll(deleteAll);
    }

    public void deleteById(Long id) {
        bonusRepository.deleteById(id);
    }
}
