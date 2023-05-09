package com.magma.quantum.machintech.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;



@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
        .addResourceHandler("/resources/**")
        .addResourceLocations("classpath:/static/**");
        registry
        .addResourceHandler("/machinter/**")
        .addResourceLocations("classpath:/WEB-INF/machinter/**");
        registry
        .addResourceHandler("/resources/static/js/**")
        .addResourceLocations("classpath:/static/js/**");
        registry
        .addResourceHandler("swagger-ui.html")
        .addResourceLocations("classpath:/META-INF/resources/");
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("home");
		registry.addViewController("/").setViewName("index.html");
		registry.addViewController("/machinter/creerAbsence").setViewName("/machinter/creerAbsence");
	}

}
