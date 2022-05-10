package com.kovalchuk.EnergyConsumptions.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.kovalchuk.EnergyConsumptions.dto.MyPageRequest;
import com.kovalchuk.EnergyConsumptions.dto.ovens.daub.DaubTunnelOvenResponse;
import com.kovalchuk.EnergyConsumptions.entity.ovens.daub.DaubTunnelOven;
import com.kovalchuk.EnergyConsumptions.repository.ovens.DaubTunnelOvenRepository;
import com.kovalchuk.EnergyConsumptions.service.DaubTunnelOvenService;

@Service
public class DaubTunnelOvenServiceImpl implements DaubTunnelOvenService{
	
	@Autowired
	private DaubTunnelOvenRepository daubTunnelOvenRepository;

	@Override
	public Page<DaubTunnelOvenResponse> getAll(MyPageRequest myPageRequest) {
		
		Page<DaubTunnelOven> daubTunnelOvenPage = daubTunnelOvenRepository.findAll(
				PageRequest.of(myPageRequest.getNumberOfPages(), 
								myPageRequest.getSizeOfPage())
				);
		
		Page<DaubTunnelOvenResponse> daubTunnelOvenResponsePage = daubTunnelOvenPage.map(DaubTunnelOvenResponse::new);
		
		return daubTunnelOvenResponsePage;
	}

	@Override
	public Page<DaubTunnelOvenResponse> getAllBetweenTwoDate(String startDate, String endDate,
			MyPageRequest myPageRequest) {
		
		Date fromDate = new Date();
		Date toDate = new Date();
		
		try {
			fromDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(startDate);
			toDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(endDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Page<DaubTunnelOven> daubTunnelOvenPage = daubTunnelOvenRepository.findAllByDateTimeBetween(fromDate, toDate, 
				PageRequest.of(myPageRequest.getNumberOfPages(), 
								myPageRequest.getSizeOfPage())
				);
		
		Page<DaubTunnelOvenResponse> daubTunnelOvenResponsePage = daubTunnelOvenPage.map(DaubTunnelOvenResponse::new);
		
		return daubTunnelOvenResponsePage;
		
	}

}
