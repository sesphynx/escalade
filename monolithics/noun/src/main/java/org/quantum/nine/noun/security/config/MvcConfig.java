package org.quantum.nine.noun.security.config;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

public class MvcConfig extends WebMvcConfigurerAdapter {
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("home");
		registry.addViewController("/").setViewName("index.html");
		registry.addViewController("/showcreate").setViewName("showcreate");
		registry.addViewController("/saveActiviste").setViewName("saveActiviste");
		registry.addViewController("/showmarket").setViewName("/showmarket");
	}

}
