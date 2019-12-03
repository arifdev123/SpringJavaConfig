package in.co.javacoder.SpringJavaConfig.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.co.javacoder.SpringJavaConfig.SpringConfig;
import in.co.javacoder.SpringJavaConfig.service.Service;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
			Service service1 = context.getBean("service", Service.class);
			System.out.println(service1.hashCode());
			Service service2 = context.getBean("service", Service.class);
			System.out.println(service2.hashCode());
			
		/* Before modifying scope to prototype
		 * init() 345281752 345281752
		 */
		/*
		 * service.save(); 
		 */
			
		/* After scope is changed to prototype
		 * init() 1415157681 init() 1291113768
		 */
			
			context.close();
	}

}
