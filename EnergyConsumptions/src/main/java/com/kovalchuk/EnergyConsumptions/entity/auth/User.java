package com.kovalchuk.EnergyConsumptions.entity.auth;

import java.util.Collection;
import java.util.List;

import javax.persistence.*;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.*;

@NoArgsConstructor
@Entity
@Table(name = "auth_user_details")
public class User implements UserDetails {
	
	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Setter
	@Column(name = "user_name", unique=true)
	private String userName;
	
	@Setter
	private String password;
	
	@Setter
	private boolean enabled;
	
	
	@Setter
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "auth_user_authority", joinColumns = @JoinColumn(referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(referencedColumnName = "id"))
	private List<Authority> authorities;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getUsername() {
		return this.userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		return this.enabled;
	}

	@Override
	public boolean isAccountNonLocked() {
		return this.enabled;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return this.enabled;	
	}

	@Override
	public boolean isEnabled() {
		return this.enabled;
	}

}
