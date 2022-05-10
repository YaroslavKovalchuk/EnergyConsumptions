package com.kovalchuk.EnergyConsumptions;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.kovalchuk.EnergyConsumptions.entity.auth.Authority;
import com.kovalchuk.EnergyConsumptions.entity.auth.User;
import com.kovalchuk.EnergyConsumptions.repository.UserDetailsRepository;

@SpringBootApplication
public class EnergyConsumptionsApplication {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserDetailsRepository userDetailsRepository;

	public static void main(String[] args) {
		SpringApplication.run(EnergyConsumptionsApplication.class, args);
	}
	
//	@PostConstruct
//	protected void init() {
//		
//		List<Authority> authorityListAdmin = new ArrayList<>();
//		authorityListAdmin.add(createAuthority("ROLE_ADMIN"));
//		authorityListAdmin.add(createAuthority("ROLE_USER"));
//		
//		List<Authority> authorityListUser = new ArrayList<>();
//		authorityListUser.add(createAuthority("ROLE_USER"));
//		
//		User user = new User();
//		user.setUserName("user");
//		user.setPassword(passwordEncoder.encode("1234"));
//		user.setEnabled(true);
//		user.setAuthorities(authorityListUser);
//		
//		User admin = new User();
//		admin.setUserName("admin");
//		admin.setPassword(passwordEncoder.encode("1234"));
//		admin.setEnabled(true);
//		admin.setAuthorities(authorityListAdmin);
//		
//		userDetailsRepository.save(user);
//		userDetailsRepository.save(admin);
//		
//		
//	}
	
	private Authority createAuthority(String authorityRole) {
		
		Authority authority = new Authority();
		
		authority.setAuthorityRole(authorityRole);
		
		return authority;
		

	}

}
