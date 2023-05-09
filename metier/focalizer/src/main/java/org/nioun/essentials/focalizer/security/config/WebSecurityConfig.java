package org.nioun.essentials.focalizer.security.config;

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
				"/displayCellules","/deleteCellule","/showUpdateCellule","/showCreateCellule","/saveCellule",
				"/displayCommissions","/deleteCommission","/showUpdateCommission","/showCreateCommission","/saveCommission",
				"/displayCommunes","/deleteCommune","/showUpdateCommune","/showCreateCommune","/saveCommune",
				"/displayCommuneArronds","/deleteCommuneArrond","/showUpdateCommuneArrond","/showCreateCommuneArrond","/saveCommuneArrond",
				"/displayCoordinations","/deleteCoordination","/showUpdateCoordination","/showCreateCoordination","/saveCoordination",
				"/displayDepartements","/deleteDepartement","/showUpdateDepartement","/showCreateDepartement","/saveDepartement",
				"/displayEntites","/deleteEntite","/showUpdateEntite","/showCreateEntite","/saveEntite",
				"/displayFederations","/deleteFederation","/showUpdateFederation","/showCreateFederation","/saveFederation",
				"/displayGrades","/deleteGrade","/showUpdateGrade","/showCreateGrade","/saveGrade",
				"/displayLigues","/deleteLigue","/showUpdateLigue","/showCreateLigue","/saveLigue",
				"/displayPayss","/deletePays","/showUpdatePays","/showCreatePays","/savePays",
				"/displayQuartiers","/deleteQuartier","/showUpdateQuartier","/showCreateQuartier","/saveQuartier",
				"/displayRegions","/deleteRegion","/showUpdateRegion","/showCreateRegion","/saveRegion" ,
				"/displayRoles","/deleteRole","/showUpdateRole","/showCreateRole" ,"/saveRole",
				"/displayUsers","/deleteUser","/showUpdateUser","/showCreateUser","/saveUser",
				"/displayVillages","/deleteVillage","/showUpdateVillage","/showCreateVillage","/saveVillage",
				"/displayVilles","/deleteVille","/showUpdateVille","/showCreateVille","/saveVille"
				)
		
		.permitAll().antMatchers("/displayCommunications","/deleteCommunication","/showUpdateCommunication","/showCreateCommunication","/saveCommunication").hasAnyAuthority("RESPONSABLE").anyRequest().authenticated()
		.and().csrf().disable();
		  
		
	}
	
	/*
	 * 
	 * Used with CustomSecurityFilter Class
	 * 
	 * 
	 * @Configuration
@EnableWebSecurity
public class RestSecurityConfig extends WebSecurityConfigurerAdapter {




    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors();
        http.csrf().disable().authorizeRequests()
                .antMatchers("/api/private/**").authenticated()
                .and().httpBasic()
        .and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
// -----Add new filter in chain-----
      http.addFilterBefore(new CustomSecurityFilter(), 
      SecurityContextPersistenceFilter.class);

    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/api/public/**");
    }
} 
	 * */
	
	
}
