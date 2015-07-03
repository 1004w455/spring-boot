package com.wisebirds.sap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

	// @Bean
	// public FilterRegistrationBean contextFilterRegistrationBean() {
	// FilterRegistrationBean registrationBean = new FilterRegistrationBean();
	// HiddenHttpMethodFilter contextFilter = new HiddenHttpMethodFilter();
	// registrationBean.setFilter(contextFilter);
	// registrationBean.setOrder(2);
	// return registrationBean;
	// }
}
