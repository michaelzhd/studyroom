package edu.sjsu.cmpe282;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class,MongoRepositoriesAutoConfiguration.class})
//@Configuration
//@ComponentScan
public class StudyroomApplication { //extends SpringBootServletInitializer {
	// extends SpringBootServletInitializer for the purpose of building war files
	public static void main(String[] args) {
		
		SpringApplication.run(StudyroomApplication.class, args);
//		new SpringApplicationBuilder()
//		.showBanner(false)
//		.sources(Parent.class)
//		.child(StudyroomApplication.class)
//		.run(args); 
	}
	
	//for the purpose of building war files 
//	@Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(StudyroomApplication.class);
//    }
}
