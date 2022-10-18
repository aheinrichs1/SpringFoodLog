package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Food;

/**
 * @author alexh - aheinrichs
 * CIS175 - Fall 2022
 * Oct 18, 2022
 */
@Configuration
public class BeanConfiguration {

	@Bean
	public Food food() {
		Food bean = new Food();
		return bean;
	}
	
}
