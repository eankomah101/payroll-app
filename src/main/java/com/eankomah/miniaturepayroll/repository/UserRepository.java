package com.eankomah.miniaturepayroll.repository;

import com.eankomah.miniaturepayroll.entity.user.Role;
import com.eankomah.miniaturepayroll.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


    Optional<User> findByEmail(String email);
    User findByRole(Role role);

}
