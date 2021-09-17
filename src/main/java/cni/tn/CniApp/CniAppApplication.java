package cni.tn.CniApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"entity"})  // scan JPA entities
//@ComponentScan(basePackages = {"controller"}) 
@ComponentScan(basePackages = {"service","controller"}) 
@EnableJpaRepositories(basePackages ="repo")

public class CniAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CniAppApplication.class, args);
	}

}
