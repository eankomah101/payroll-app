package com.eankomah.miniaturepayroll;

import com.eankomah.miniaturepayroll.entity.user.Role;
import com.eankomah.miniaturepayroll.entity.user.User;
import com.eankomah.miniaturepayroll.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@RequiredArgsConstructor
public class MiniaturePayrollApplication implements CommandLineRunner {

	private final UserRepository userRepository;
	@Value("${evs2.admin-password}")
	private String adminPassword;

	@Value("${evs3.account-password}")
	private String accountPassword;

	public static void main(String[] args) {
		SpringApplication.run(MiniaturePayrollApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		User adminAccount = userRepository.findByRole(Role.ADMIN);
		User accountant = userRepository.findByRole(Role.ACCOUNTANT);
		if (null == adminAccount) {
			User user = new User();
			user.setEmail("admin@gmail.com");
			user.setRole(Role.ADMIN);
			user.setPassword(new BCryptPasswordEncoder().encode(adminPassword));
			userRepository.save(user);
		}
		if (null == accountant) {
			User user = new User();
			user.setEmail("accounts@gmail.com");
			user.setRole(Role.ACCOUNTANT);
			user.setPassword(new BCryptPasswordEncoder().encode(accountPassword));
			userRepository.save(user);
		}
	}
}
