package com.kovalchuk.EnergyConsumptions.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class MyPageRequest {
	
	@Setter
	@Getter
	private int numberOfPages;
	
	@Setter
	@Getter
	private int sizeOfPage;
	
	@Setter
	@Getter
	private SortRequest sortRequest;
	
	public MyPageRequest(int number, int size) {
		this.numberOfPages = number;
		this.sizeOfPage = size;
	}
	
	
	
}
