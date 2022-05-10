package com.kovalchuk.EnergyConsumptions.repository.ovens;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kovalchuk.EnergyConsumptions.entity.ovens.daub.DaubTunnelOven;

@Repository
public interface DaubTunnelOvenRepository extends JpaRepository<DaubTunnelOven, Long>{
	
	Page<DaubTunnelOven> findAll(Pageable pageable);
	
	Page<DaubTunnelOven> findAllByDateTimeBetween(Date dateTimeStrart, Date dateTimeEnd, Pageable pageable);

}
