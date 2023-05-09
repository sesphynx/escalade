package org.quantum.nine.magma.resto.security.config;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true, proxyTargetClass = true)
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
				"/toutProducteurs","/supprimerProducteur","/ciblerProducteur","/ajouterProducteur",
				"/toutAddresses","/supprimerAddresse","/ciblerAddresse","/ajouterAddresse","/sauvegarderAddresse",
				"/toutProduits","/supprimerProduit","/ciblerProduit","/ajouterProduit","/sauvegarderProduit",
				"/toutCategorys","/supprimerCategory","/ciblerCategory","/ajouterCategory","/sauvegarderCategory",
				"/toutProducteurs","/supprimerProducteur","/ciblerProducteur","/ajouterProducteur","/sauvegarderProducteur",
				"/toutClients","/supprimerClient","/ciblerClient","/ajouterClient","/sauvegarderClient",
				"/toutCommandes","/supprimerCommande","/ciblerCommande","/ajouterCommande","/sauvegarderCommande",
				"/toutCommandeComposantes","/supprimerCommandeComposante","/ciblerCommandeComposante","/ajouterCommandeComposante","/sauvegarderCommandeComposante",
				"/toutPayments","/supprimerPayment","/ciblerPayment","/ajouterPayment","/sauvegarderPayment",
				"/toutRoles","/supprimerRole","/ciblerRole","/ajouterRole" ,
				"/toutUsers","/supprimerUser","/ciblerUser","/ajouterUser","/sauvegarderUser"
				)
		
		.permitAll().antMatchers("/toutCommunications","/supprimerCommunication","/ciblerCommunication","/ajouterCommunication","/sauvegarderCommunication").hasAnyAuthority("RESPONSABLE").anyRequest().authenticated()
		.and().csrf().disable();
		  
		
	}
	
}
