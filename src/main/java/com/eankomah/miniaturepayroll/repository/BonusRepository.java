package com.eankomah.miniaturepayroll.repository;

import com.eankomah.miniaturepayroll.CreatingBonus;
import com.eankomah.miniaturepayroll.entity.payroll.Bonus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BonusRepository extends JpaRepository<Bonus,Long> {

}
