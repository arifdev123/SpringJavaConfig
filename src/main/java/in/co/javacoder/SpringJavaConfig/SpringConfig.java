package in.co.javacoder.SpringJavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import in.co.javacoder.SpringJavaConfig.service.Service;

@Configuration
@Import(DaoConfig.class)
public class SpringConfig {

	@Bean(initMethod = "init", destroyMethod = "destroy")
	@Scope("prototype")
	public Service service() {
		return new Service();
	}
	
}
