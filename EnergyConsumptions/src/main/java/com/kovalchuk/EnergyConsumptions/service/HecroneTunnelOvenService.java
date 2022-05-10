package com.kovalchuk.EnergyConsumptions.service;

import org.springframework.data.domain.Page;

import com.kovalchuk.EnergyConsumptions.dto.MyPageRequest;
import com.kovalchuk.EnergyConsumptions.dto.ovens.hecrone.HecroneTunnelOvenResponse;

public interface HecroneTunnelOvenService {
	
	Page<HecroneTunnelOvenResponse> getAll(MyPageRequest myPageRequest);

}
