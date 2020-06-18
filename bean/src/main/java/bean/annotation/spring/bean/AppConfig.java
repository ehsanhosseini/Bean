package bean.annotation.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class AppConfig {
	
		
	@Bean
	public BeanA beanA() {
		return new BeanA("Ehsan");
		
	}
	
	@Bean
	public BeanB getbeanB() {
		BeanB beanB = new BeanB();
		beanB.setName("Hosseiniiiii");
		return beanB;
		
	}
	
}
