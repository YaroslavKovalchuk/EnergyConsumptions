package com.kovalchuk.EnergyConsumptions.dto.auth;

import lombok.Getter;
import lombok.Setter;

public class UserInfoResponse {
	
	@Setter
	@Getter
	private String userName;
	
	@Setter
	@Getter
	private Object roles;

}
