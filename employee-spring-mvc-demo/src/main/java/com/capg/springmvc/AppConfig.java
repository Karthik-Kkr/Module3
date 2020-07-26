package com.capg.springmvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan("com.capg.springmvc")
@EnableWebMvc
public class AppConfig {
	
//	public InternalResourceViewResolver viewResolver(){
//		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
//		viewResolver.setViewClass(JstlView.class);
//		viewResolver.setPrefix("/WEB-INF/webapp");
//		viewResolver.setSuffix(".jsp");
//		return viewResolver;
//	}
}
