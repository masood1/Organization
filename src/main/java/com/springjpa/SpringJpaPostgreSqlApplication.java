package com.springjpa;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.springjpa.repo.BuildingRepository;
import com.springjpa.repo.DeskRepository;
import com.springjpa.repo.FloorRepository;

@SpringBootApplication
@Configuration
@EnableJpaRepositories
public class SpringJpaPostgreSqlApplication{

	@Autowired
	BuildingRepository repository;
	FloorRepository floorRep;
	DeskRepository deskRep;
	
	
	public static void main(String[] args){
		SpringApplication.run(SpringJpaPostgreSqlApplication.class, args);
	}

/**	@Override
	public void run(String... arg0) throws Exception {
		
		repository.deleteAll();
		floorRep.deleteAll();
		deskRep.deleteAll();
	}*/
}
