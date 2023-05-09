package org.quantum.nine.noun.security.config;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true, proxyTargetClass = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Value("${server.port:8443}") private int serverPort;
	
	@Autowired 
	UserDetailsService userDetailsServiceImpl ;
	
	
	 @Bean
	  public org.springframework.boot.web.servlet.server.ServletWebServerFactory servletContainer() {
		TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory() {
	        @Override
	        protected void postProcessContext(Context context) {
	          SecurityConstraint securityConstraint = new SecurityConstraint();
	          securityConstraint.setUserConstraint("CONFIDENTIAL");
	          SecurityCollection collection = new SecurityCollection();
	          collection.addPattern("/*");
	          securityConstraint.addCollection(collection);
	          context.addConstraint(securityConstraint);
	        }
	      };
	    
	    tomcat.addAdditionalTomcatConnectors(initiateHttpConnector());
	    return tomcat;
	  }
	  
	  private Connector initiateHttpConnector() {
	    Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
	    connector.setScheme("http");
	    connector.setPort(8080);
	    connector.setSecure(false);
	    connector.setRedirectPort(serverPort);
	    
	    return connector;
	  }
	
	
	
	
	@Bean
	BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	

	
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/","/index.html","/saveActiviste","/showcreate","/showmarket")
		.permitAll().antMatchers("showCoreCorantic").hasAnyAuthority("ADMIN").anyRequest().authenticated()
		.and().csrf().disable();
		
	}
	
	 @Autowired
	   public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	      auth
	      .userDetailsService(userDetailsServiceImpl)
    	.passwordEncoder(bCryptPasswordEncoder());
	   }
	
}
