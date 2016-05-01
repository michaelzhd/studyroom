package edu.sjsu.cmpe282.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@EnableMongoRepositories(basePackages={"edu.sjsu.cmpe282.repository"})
//@EntityScan(basePackages={"edu.sjsu.cmpe282"}) !!! DO NOT add this !!!
@Configuration
@EnableAutoConfiguration
public class RepositoryConfig {
	

}
