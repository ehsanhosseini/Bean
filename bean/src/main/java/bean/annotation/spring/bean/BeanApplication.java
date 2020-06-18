package bean.annotation.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeanApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(BeanApplication.class, args);
		
		AnnotationConfigApplicationContext aplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		BeanA beA = aplicationContext.getBean(BeanA.class);
		System.out.println(beA.getName());
		
		BeanB beB = aplicationContext.getBean(BeanB.class);
		System.out.println(beB.getName());
	}

}
