package com.mysite.sbb;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {
	
	@Value("${file.download.directory}")
	private String downloadRootDirectory;
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		
		
		
		registry.addResourceHandler("/images/**").addResourceLocations(downloadRootDirectory);
	}

}