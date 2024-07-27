package com.pizzeria.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

	/*
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests()
		 .requestMatchers("/user").hasAuthority("USER")
		 .requestMatchers("/admin").hasAuthority("ADMIN")
		 .requestMatchers("/").permitAll()
		 .and().formLogin()
		 .and().logout();
		 return http.build();
	}
	 */

	@Bean
	SecurityFilterChain filterDashboard(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests()
		.requestMatchers("/pizze","/pizze/nuova_pizza", "/pizze/edit_pizze", "/pizze/lista_pizze").hasAuthority("ADMIN")
		.requestMatchers("/offerte", "/offerte/**").hasAuthority("ADMIN")
		.requestMatchers("/ingredients", "/ingredients/**").hasAuthority("ADMIN")
		.requestMatchers("/**").permitAll()
		.and().formLogin()
		.and().logout()
		.and().exceptionHandling()
		;
		return http.build();
	}
	
	@Bean
	 DatabaseUserDetailsService userDetailsService() {
	 return new DatabaseUserDetailsService();
	 }
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}
	
	@Bean
	DaoAuthenticationProvider autentiAuthenticationProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		
		authProvider.setUserDetailsService(userDetailsService());
		authProvider.setPasswordEncoder(passwordEncoder());
		
		return authProvider;
	}
	
}
