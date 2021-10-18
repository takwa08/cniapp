package cni.tn.CniApp;

import java.io.IOException;

import java.io.InputStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import entity.Employe;
import entity.Group;
import service.ServiceEmp;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"entity"})  // scan JPA entities
//@ComponentScan(basePackages = {"controller"}) 
@ComponentScan(basePackages = {"service","controller","Authentification"}) 
@EnableJpaRepositories(basePackages ="repo")

public class CniAppApplication {



	public static void main(String[] args)  {
		SpringApplication.run(CniAppApplication.class, args);
		
	    }}

