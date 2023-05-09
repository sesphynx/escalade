package org.nioun.essentials.authorizationserver.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


public class AuthUserDetail extends User implements UserDetails {
	
	

	/**
	 * 
	 */
	public AuthUserDetail() {
		
	}

	/**
	 * @param user
	 */
	public AuthUserDetail(User user) {
		super(user);
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority>  grantedAuthority = new ArrayList();
		super.getRoles().forEach(role -> {
		grantedAuthority.add(new SimpleGrantedAuthority(role.getName()));
		role.getPermissions().forEach(permission ->{
	grantedAuthority.add(new SimpleGrantedAuthority(permission.getName()));
			});
				
		});	
	
				
		return grantedAuthority ;
	}

	@Override
	public String getPassword() {
		return super.getPassword();
	}

	@Override
	public boolean isAccountNonExpired() {

		return super.isAccountNonExpired();
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

}
