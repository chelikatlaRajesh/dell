package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class securityConfigurations  extends WebSecurityConfigurerAdapter{

	@Autowired
	private UserDetailsService userdeatailsservice;
	
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		System.out.println("inside security configuration");
		
		auth.userDetailsService(userdeatailsservice);
		
		System.out.println("after loading the userdeatils");
	}
	
	protected void configure(HttpSecurity http) throws Exception {
		
		http.httpBasic().and()
		.authorizeRequests()
		.antMatchers("/**").permitAll()
		.antMatchers("/getmanager").hasRole("manager")
		.antMatchers("/getadmin").hasAnyRole("admin","manager")
		.and().formLogin();
	}
	
	@Bean
	public PasswordEncoder getencoder() {
		return NoOpPasswordEncoder.getInstance();
		
	}
	
	
}
