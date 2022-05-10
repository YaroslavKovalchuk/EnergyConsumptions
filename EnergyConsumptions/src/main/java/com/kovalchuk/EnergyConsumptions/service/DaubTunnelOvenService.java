package com.kovalchuk.EnergyConsumptions.service;

import java.util.Date;

import org.springframework.data.domain.Page;

import com.kovalchuk.EnergyConsumptions.dto.MyPageRequest;
import com.kovalchuk.EnergyConsumptions.dto.ovens.daub.DaubTunnelOvenResponse;

public interface DaubTunnelOvenService {

	Page<DaubTunnelOvenResponse> getAll(MyPageRequest myPageRequest);
	
	Page<DaubTunnelOvenResponse> getAllBetweenTwoDate(String startDate, String endDate, MyPageRequest myPageRequest);
	
}
