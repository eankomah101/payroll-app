package com.eankomah.miniaturepayroll.service.payroll;

import com.eankomah.miniaturepayroll.dto.CreatingBonus;
import com.eankomah.miniaturepayroll.entity.employee.Employee;
import com.eankomah.miniaturepayroll.entity.payroll.Bonus;
import com.eankomah.miniaturepayroll.mappers.Mapper;
import com.eankomah.miniaturepayroll.mappers.impl.BonusMapperImp;
import com.eankomah.miniaturepayroll.repository.BonusRepository;
import com.eankomah.miniaturepayroll.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class BonusService {

    private final BonusRepository bonusRepository;
    private final EmployeeRepository employeeRepository;

    private final Mapper<Bonus, CreatingBonus> bonusMapper;



    public List<Bonus> getAllBonuses() {
        return bonusRepository.findAll();
    }

//    public List<Bonus> create(List<Bonus> bonusList) {
//                List<Bonus> allbonuses = new ArrayList<>();
//                bonusList.forEach(bonus -> {
//                    Employee employee = employeeRepository.findById(Long.valueOf(bonus.getEmployeeId())).orElseThrow();
//                    Bonus bonus1 = new Bonus();
//                    bonus1.setDescription(bonus.getDescription());
//                    bonus1.setMonthlyBonus(bonus.getMonthlyBonus());
//                    bonus1.setTotalBonus(bonus.getTotalBonus());
//
//                   allbonuses.add(bonus1);
//                    employee.setBonus(bonus);
//                    employeeRepository.save(employee);
//
//                });
//                return bonusRepository.saveAll(allbonuses);
//    }

    public List<Bonus> create(List<CreatingBonus> creatingBonus){
        List<Bonus> bonusList = creatingBonus.stream().map(bonusMapper::mapToEntity).toList();
        System.out.println(bonusList + "The created bonus");
        return bonusRepository.saveAll(bonusList);

    }


    public Bonus update(Bonus bonus, Long id) {
        Bonus bonus1 = bonusRepository.findById(id).orElseThrow();
        bonus1.setDescription(bonus.getDescription() != null? bonus.getDescription() : bonus1.getDescription());
        bonus1.setMonthlyBonus(bonus.getMonthlyBonus() != null? bonus.getMonthlyBonus() : bonus1.getMonthlyBonus());
        bonus1.setTotalBonus(bonus.getTotalBonus() != null? bonus.getTotalBonus() : bonus1.getTotalBonus());
        bonus1.setDescription(bonus.getDescription() != null? bonus.getDescription() : bonus1.getDescription());
      return bonusRepository.save(bonus1);
    }

    public void deleteById(List<Long> id) {
        List<Bonus> deleteAll = new ArrayList<>();

        id.forEach(bonus -> {
            Bonus bonus1 = bonusRepository.findById(bonus).orElseThrow();
            deleteAll.add(bonus1);
        });

        bonusRepository.deleteAll(deleteAll);

    }


}
