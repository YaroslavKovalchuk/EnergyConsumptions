package com.kovalchuk.EnergyConsumptions.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kovalchuk.EnergyConsumptions.entity.auth.User;

@Repository
public interface UserDetailsRepository extends JpaRepository<User, Long>{
	
	User findByUserName(String userName);

}
