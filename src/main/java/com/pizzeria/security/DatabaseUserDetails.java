package com.pizzeria.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.pizzeria.model.Role;
import com.pizzeria.model.User;

public class DatabaseUserDetails implements UserDetails {

	/*
	 * DOBBIAMO IMPLEMENTARE UN COSTRUTTORE E ITERARE SUI RUOLI E ATTRIBUIRE I GETTER E SETTER DELL'USER
	 */
	
	private final Long id;
	private final String username;
	private final String passwod;
	private final Set<GrantedAuthority> authorities;
	
	public DatabaseUserDetails(User user) {
		this.id = user.getId();
		this.username = user.getUsername();
		this.passwod = user.getPassword();
		this.authorities = new HashSet<>();
		for(Role ruolo : user.getRoles()) {
			this.authorities.add(new SimpleGrantedAuthority(ruolo.getName()));
		}
		
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.authorities;
	}

	@Override
	public String getPassword() {
		return this.passwod;
	}

	@Override
	public String getUsername() {
		return this.username;
	}

}
