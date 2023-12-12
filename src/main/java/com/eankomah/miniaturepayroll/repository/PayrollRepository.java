package com.eankomah.miniaturepayroll.repository;

import com.eankomah.miniaturepayroll.entity.payroll.Payroll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayrollRepository extends JpaRepository<Payroll,Long> {


}
