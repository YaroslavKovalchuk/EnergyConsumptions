package com.kovalchuk.EnergyConsumptions.dto;

import org.springframework.data.domain.Sort;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class SortRequest {
	
	@Setter
	@Getter
	private Sort sortProp;
	
	
	@Setter
	@Getter
	private Sort.Direction direction;

}
