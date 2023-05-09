package org.nioun.essentials.security.config;

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
				"/index.html","/","/localhost:8080/nioun/h2-console",
				
				"/activiste/sauvegarderActiviste","/activiste/creerActiviste","activiste/toutActivistes","activiste/ciblerActiviste",
				
				"/addresse/creerAddresse","/addresse/toutAddresses","/addresse/sauvegarderAddresse","/addresse/ciblerAddresse",
				
				"/category/creerCategory","/category/toutCategorys" , "/category/sauvegarderCategory","/category/ciblerCategory",
				
				"/client/creerClient","/client/toutClients" , "/client/sauvegarderClient","/client/ciblerClient",
				
				"/commande/creerCommande","/commande/toutCommandes" , "/commande/sauvegarderCommande","/commande/ciblerCommande",
				
				"/commandeComposante/creerCommandeComposante","/commandeComposante/toutCommandeComposantes" , "/commandeComposante/sauvegarderCommandeComposante","/commandeComposante/ciblerCommandeComposante",
				
				"/payment/creerPayment","/payment/toutPayments","/payment/sauvegarderPayment","/payment/ciblerPayment",
				
				"/producteur/creerProducteur","/producteur/toutProducteurs","/producteur/sauvegarderProducteur","/producteur/ciblerProducteur",
				
				"/produit/creerProduit","/produit/toutProduits","/produit/sauvegarderProduit","/produit/ciblerProduit",
				
				"/role/creerRole","/role/toutRoles","/role/sauvegarderRole","/role/ciblerRole",
				
				"/user/creerUser","/user/toutUsers" , "/user/sauvegarderUser","/user/ciblerUser")
		
		.permitAll().antMatchers("showCoreCorantic").hasAnyAuthority("ADMIN").anyRequest().authenticated()
		.and().csrf().disable();
		  
		
	}
	
		
	
}
