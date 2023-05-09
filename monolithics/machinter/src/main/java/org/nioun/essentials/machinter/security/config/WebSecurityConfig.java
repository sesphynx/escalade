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
				
				"/absence/afficherAllAbsences",
				
				"/campagne/afficherAllCampagnes","/campagne/effacerCampagne","/campagne/editerCampagne","/campagne/creerCampagne",
				
				"/user/afficherAllSuperviseurs","/user/effacerSuperviseur","/user/editerSuperviseur","/user/creerUser","/user/enregistrerUser",
				
				"/afficherAllConseillers","/effacerConseiller","/editerConseiller","/creerConseiller","/enregistrerConseiller",
				
				"/operateur/afficherAllOperateurs","/operateur/effacerOperateur","/operateur/editerOperateur","/operateur/creerOperateur","/operateur/enregistrerOperateur",
				
				"/afficherAllManagers","/effacerManager","/editerManager","/creerManager","/enregistrerManager",
				
				
				"/offre/afficherAllOffres","/offre/effacerOffre","/offre/editerOffre","/offre/creerOffre","/offre/enregistrerOffre",
				
				"/prospect/afficherAllProspects","/prospect/effacerProspect","/prospect/editerProspect","/prospect/creerProspect","/prospect/enregistrerProspect",
				
				"/afficherAllProspectuss","/effacerProspectus","/editerProspectus","/prospectus/creerProspectus","/prospectus/enregistrerProspectus"
				)
		.permitAll()
		.antMatchers("/effacerAbsence","/editerAbsence","/creerAbsence")
		.hasAnyAuthority("SUPERVISEUR").
		anyRequest().authenticated()
	        .and()
	        .csrf().disable();
		  
		
	}
	

		
	
}
