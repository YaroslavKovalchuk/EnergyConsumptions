package com.kovalchuk.EnergyConsumptions.entity.ovens.hecrone;


import javax.persistence.*;

import com.kovalchuk.EnergyConsumptions.entity.ovens.PowerAndGasConsumption;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name="hecrone_power_and_gas_consumption")
public class PowerAndGasConsumptionOfHecrone extends PowerAndGasConsumption{

}
