package com.kovalchuk.EnergyConsumptions.entity.auth;

import javax.persistence.*;

import org.springframework.security.core.GrantedAuthority;

import lombok.*;

@NoArgsConstructor
@Entity
@Table(name="auth_authority")
public class Authority implements GrantedAuthority{
	
	@Getter(AccessLevel.PUBLIC)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	@Setter(AccessLevel.PUBLIC)
	@Column(name = "role")
	private String authorityRole;

	@Override
	public String getAuthority() {
		return authorityRole;
	}

}
