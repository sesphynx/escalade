package org.nioun.essentials.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;



@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("classpath:/static/**");
        registry.addResourceHandler("/nioun/activiste/**").addResourceLocations("classpath:/WEB-INF/nioun/activiste/**");
        registry.addResourceHandler("/nioun/activiste/css/**").addResourceLocations("classpath:/WEB-INF/nioun/activiste/css/**");
        registry.addResourceHandler("/nioun/activiste/images/**").addResourceLocations("classpath:/WEB-INF/nioun/activiste/images/**");
        registry.addResourceHandler("/resources/static/js/**").addResourceLocations("classpath:/static/js/**");
    }
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("home");
		registry.addViewController("/").setViewName("index.html");
		registry.addViewController("/activiste/showcreate").setViewName("/activiste/showcreate");
		registry.addViewController("/activiste/saveactiviste").setViewName("/activiste/saveactiviste");
		registry.addViewController("/activiste/showmarket").setViewName("/activiste/showmarket");
		registry.addViewController("/produit/createproduit").setViewName("/produit/createproduit");
		registry.addViewController("/producteur/createproducteur").setViewName("/producteur/createproducteur");
		registry.addViewController("/category/createcategory").setViewName("/category/createcategory");
	}

}
