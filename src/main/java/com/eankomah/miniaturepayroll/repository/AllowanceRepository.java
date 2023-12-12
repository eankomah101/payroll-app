package com.eankomah.miniaturepayroll.repository;

import com.eankomah.miniaturepayroll.entity.payroll.Allowance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllowanceRepository extends JpaRepository<Allowance,Long> {

}
