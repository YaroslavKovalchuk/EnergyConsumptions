package com.kovalchuk.EnergyConsumptions.repository.ovens;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kovalchuk.EnergyConsumptions.entity.ovens.hecrone.HecroneTunnelOven;

@Repository
public interface HecroneTunnelOvenRepository extends JpaRepository<HecroneTunnelOven, Long> {
	
	Page<HecroneTunnelOven> findAll(Pageable pageable);

}
