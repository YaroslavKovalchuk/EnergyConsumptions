package com.kovalchuk.EnergyConsumptions.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.kovalchuk.EnergyConsumptions.entity.auth.User;
import com.kovalchuk.EnergyConsumptions.repository.UserDetailsRepository;

@Service
public class CustomUserServiceImpl implements UserDetailsService {
	
	@Autowired
	UserDetailsRepository userDetailsRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userDetailsRepository.findByUserName(username);
		
		if(user == null) {
			throw new UsernameNotFoundException("User: " + username +" not found");
		}
		
		return user;
	}

}
