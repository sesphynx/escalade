package org.nioun.essentials.proximusante.utils;

import org.n52.jackson.datatype.jts.JtsModule;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JacksonConfig {

	public JtsModule jtsModule() {
		return new JtsModule();
	}
	
}
