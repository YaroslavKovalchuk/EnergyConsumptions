package com.kovalchuk.EnergyConsumptions.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.kovalchuk.EnergyConsumptions.service.impl.CustomUserServiceImpl;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private CustomUserServiceImpl userService;
	
	@Autowired
	private JWTTokenHelper jwtTokenHelper;
	
	@Autowired
	private AuthenticationEntryPoint authEntryPoint;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(userService).passwordEncoder(encoder());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().exceptionHandling()
			.authenticationEntryPoint(authEntryPoint).and()
			.authorizeRequests((request) -> request.antMatchers("/auth/login").permitAll()
			.antMatchers("/ovens/daub/*").hasRole("USER")
			.antMatchers("/ovens/hecrone/*").hasRole("USER")
			.antMatchers("/auth/userinfo").hasRole("ADMIN"))
			.addFilterBefore(new JWTAuthenticationFilter(userService, jwtTokenHelper), 
					UsernamePasswordAuthenticationFilter.class);
		
		http.csrf().disable().cors().and().headers().frameOptions().disable();
			
		http.formLogin();
	}
	
	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception{
		return super.authenticationManagerBean();
	}
	
	@Bean
	public PasswordEncoder encoder() {
		 return NoOpPasswordEncoder.getInstance();
//		 return new BCryptPasswordEncoder();
	}

}

