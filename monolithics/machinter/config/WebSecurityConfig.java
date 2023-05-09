package org.nioun.essentials.machinter.security.config;


import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;



@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	
	
	@Override
	@Bean(name = BeanIds.AUTHENTICATION_MANAGER)
	public AuthenticationManager authenticationManagerBean() throws Exception {
	    return super.authenticationManagerBean();
	}
	
	
	

	@Bean
	BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.headers().cacheControl().disable();
		http.authorizeRequests()
		.requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
		.antMatchers(
				"/static/**",
				
				"/index.html","/",
				
				"/afficherAllAbsences",
				
				"/afficherAllCampagnes","/effacerCampagne","/editerCampagne","/creerCampagne",
				
				"/afficherAllSuperviseurs","/effacerSuperviseur","/editerSuperviseur","/creerUser","enregistrerUser",
				
				"/afficherAllConseillers","/effacerConseiller","/editerConseiller","/creerConseiller","/enregistrerConseiller",
				
				"/afficherAllOperateurs","/effacerOperateur","/editerOperateur","/creerOperateur","/enregistrerOperateur",
				
				"/afficherAllManagers","/effacerManager","/editerManager","/creerManager","/enregistrerManager",
				
				
				"/afficherAllOffres","/effacerOffre","/editerOffre","/creerOffre","/enregistrerOffre",
				
				"/afficherAllProspects","/effacerProspect","/editerProspect","/creerProspect",
				
				"/afficherAllProspectuss","/effacerProspectus","/editerProspectus","/creerProspectus"
				
				
				)
		
		
		.permitAll()
		.antMatchers("/effacerAbsence","/editerAbsence","/creerAbsence")
		.hasAnyAuthority("SUPERVISEUR").
		anyRequest().authenticated()
		.and()
	    .formLogin()
	        .loginPage("/login/login")
	        .defaultSuccessUrl("/home")
	        .failureUrl("/login?error")
	        .permitAll()
	        .and()
	    .logout()
	    	.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
	    	.permitAll()
	        .and()
	        .csrf().disable();
		  
		
	}
	 @Override
	    public void configure(WebSecurity web) throws Exception {
	        web.ignoring().antMatchers("/v2/api-docs",
	        							"/v3/api-docs",
	        							"/configuration/ui",
	        							"/swagger-resources/",
	                                   "/swagger-resources/**",
	                                   "/swagger-resources/configuration/ui",
	                                   "swagger-resources/configuration/security",
	                                   "/configuration/security",
	                                   "/swagger-ui.html",
	                                   "/swagger-ui/**",
	                                   
	                                   "/webjars/**");
	    }

		
	
}
