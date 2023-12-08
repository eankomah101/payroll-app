package com.eankomah.miniaturepayroll;

import com.eankomah.miniaturepayroll.entity.Role;
import com.eankomah.miniaturepayroll.entity.User;
import com.eankomah.miniaturepayroll.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@RequiredArgsConstructor
public class MiniaturePayrollApplication {

	private final UserRepository userRepository;


	public static void main(String[] args) {
		SpringApplication.run(MiniaturePayrollApplication.class, args);
	}

	@PostConstruct
	public void init() {
		User adminAccount = userRepository.findByRole(Role.ADMIN);
		if (null == adminAccount) {
			User user = new User();
			user.setEmail("admin@gmail.com");
			user.setFirstname("admin");
			user.setLastname("admin");
			user.setRole(Role.ADMIN);
			user.setPassword(new BCryptPasswordEncoder().encode("admin"));
			userRepository.save(user);
		}
	}
}
