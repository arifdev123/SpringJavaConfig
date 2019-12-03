package in.co.javacoder.SpringJavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.co.javacoder.SpringJavaConfig.dao.Dao;

@Configuration
public class DaoConfig {
	
	@Bean
	public Dao dao() {
		return new Dao();
	}

}
