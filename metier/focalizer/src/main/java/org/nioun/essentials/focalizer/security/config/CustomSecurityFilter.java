package org.nioun.essentials.focalizer.security.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.filter.GenericFilterBean;

public class CustomSecurityFilter extends GenericFilterBean {
	    @Override
	    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
	        HttpServletRequest request = (HttpServletRequest) servletRequest;
	        System.out.println("Enter custom filter");
	        System.out.println("method:"+request.getMethod() + "\nurl:"+request.getRequestURI()+"\nip address:"+request.getRemoteAddr());
	        filterChain.doFilter(servletRequest, servletResponse);
	    }

	
	}


