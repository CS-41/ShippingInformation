/**
 * @author Elizabeth Allen - eallen12
 * CIS175 - Fall 2021
 * Oct 20, 2021
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import dmacc.beans.Shipping;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Shipping shipping () {
		Shipping bean = new Shipping("May Test", true, 12);

		return bean;
	}
}
