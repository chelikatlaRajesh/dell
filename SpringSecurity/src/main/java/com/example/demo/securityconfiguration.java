package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AndRequestMatcher;

@EnableWebSecurity
public class securityconfiguration extends WebSecurityConfigurerAdapter {
	

	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth
		.inMemoryAuthentication()
		.withUser("rajesh")
		.password("123")
		.roles("manager")
		.and()
		.withUser("suresh")
		.password("786")
		.roles("admin");
		
		
	}
	
	
	protected void configure(HttpSecurity http) throws Exception {
		
		http.httpBasic()
		.and()
		.authorizeRequests()
		.antMatchers("/getmanager").hasRole("manager")
		.antMatchers("/getadmin").hasAnyRole("admin")
		.and().formLogin();
	}
	
	@Bean
	public PasswordEncoder getencoder() {
		return  NoOpPasswordEncoder.getInstance();
	}


}
