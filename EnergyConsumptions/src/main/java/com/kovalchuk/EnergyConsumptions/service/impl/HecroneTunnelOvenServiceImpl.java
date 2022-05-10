package com.kovalchuk.EnergyConsumptions.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.kovalchuk.EnergyConsumptions.dto.MyPageRequest;
import com.kovalchuk.EnergyConsumptions.dto.ovens.hecrone.HecroneTunnelOvenResponse;
import com.kovalchuk.EnergyConsumptions.entity.ovens.hecrone.HecroneTunnelOven;
import com.kovalchuk.EnergyConsumptions.repository.ovens.HecroneTunnelOvenRepository;
import com.kovalchuk.EnergyConsumptions.service.HecroneTunnelOvenService;

@Service
public class HecroneTunnelOvenServiceImpl implements HecroneTunnelOvenService{
	
	@Autowired
	private HecroneTunnelOvenRepository hecroneTunnelOvenRepository;

	@Override
	public Page<HecroneTunnelOvenResponse> getAll(MyPageRequest myPageRequest) {
		
		Page<HecroneTunnelOven> hecroneTunnelOvenPage = hecroneTunnelOvenRepository.findAll(
				PageRequest.of(myPageRequest.getNumberOfPages(),
						myPageRequest.getSizeOfPage())
				);
		
		Page<HecroneTunnelOvenResponse> hecroneTunnelOvenResponsePage = hecroneTunnelOvenPage.map(
				HecroneTunnelOvenResponse::new
				);
		
		return hecroneTunnelOvenResponsePage;
		
	}

}
