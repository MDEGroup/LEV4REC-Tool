package com.lev4rec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@Configuration
@EnableWebMvc
public class DemoApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("/css/**").addResourceLocations("/css/**");
//		registry.addResourceHandler("/img/**").addResourceLocations("/img/**");
//		registry.addResourceHandler("/js/**").addResourceLocations("/js/**");
//		registry.addResourceHandler("/sound/**").addResourceLocations("/sound/**");
//		registry.addResourceHandler("/fonts/**").addResourceLocations("/fonts/**");
//	}

}
