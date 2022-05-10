package com.kovalchuk.EnergyConsumptions.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kovalchuk.EnergyConsumptions.dto.MyPageRequest;
import com.kovalchuk.EnergyConsumptions.dto.ovens.daub.DaubTunnelOvenResponse;
import com.kovalchuk.EnergyConsumptions.dto.ovens.hecrone.HecroneTunnelOvenResponse;
import com.kovalchuk.EnergyConsumptions.service.DaubTunnelOvenService;
import com.kovalchuk.EnergyConsumptions.service.HecroneTunnelOvenService;

@RestController
@RequestMapping("/ovens")
@CrossOrigin
public class TunnelOvenController {
	
	@Autowired
	private DaubTunnelOvenService daubTunnelOvenService;
	
	@Autowired
	private HecroneTunnelOvenService  hecroneTunnelOvenService;
	
	@PostMapping("/daub/page")
	public Page<DaubTunnelOvenResponse> getAllDaubOvenData(@RequestBody MyPageRequest myPageRequest){
		return daubTunnelOvenService.getAll(myPageRequest);
	}

	@PostMapping("/daub/page/filter")
	public Page<DaubTunnelOvenResponse> getAllDaubOvenDataBetweenTwoDate(@RequestBody MyPageRequest myPageRequest, 
			@RequestParam(name = "startDate", required = false)String startDate,
			@RequestParam(name = "endDate", required = false)String endDate){
		
		System.out.println("s" + startDate);
		System.out.println("e" + endDate);
		
		return daubTunnelOvenService.getAllBetweenTwoDate(startDate, endDate, myPageRequest);
	}
	
	@PostMapping("/hecrone/page")
	public Page<HecroneTunnelOvenResponse> getAllHecroneOvenData(@RequestBody MyPageRequest myPageRequest){
		return hecroneTunnelOvenService.getAll(myPageRequest);
	}
	

}
