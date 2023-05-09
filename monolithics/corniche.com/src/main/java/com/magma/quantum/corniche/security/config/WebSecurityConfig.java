package com.magma.quantum.corniche.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig  extends WebSecurityConfigurerAdapter{
	
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	public void configure (HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/showReg","/","index.html","/registerUser","/login","/showLogin","/login/*").permitAll()
		.antMatchers("/admin/showFlight").hasAuthority("ADMIN").anyRequest().authenticated().and().csrf().disable();
	}

}
