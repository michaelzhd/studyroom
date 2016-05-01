package edu.sjsu.cmpe282.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.mapping.event.ValidatingMongoEventListener;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

@Configuration

@EnableMongoRepositories("edu.sjsu.cmpe282.repository")
@Import(value = MongoAutoConfiguration.class)
public class DataBaseConfig extends AbstractMongoConfiguration {
	
	private final Logger log = LoggerFactory.getLogger(DataBaseConfig.class);
	
//    @Value("${spring.data.mongodb.host}")
//    private String host;
//    @Value("${spring.data.mongodb.port}")
//    private Integer port;
//    @Value("${spring.data.mongodb.username}")
//    private String username;
//    @Value("${spring.data.mongodb.database}")
//    private String database;
//    @Value("${spring.data.mongodb.password}")
//    private String password;
    @Value("${spring.data.mongodb.uri}")
    private String uri;
    
   
    public DataBaseConfig(){}

	
//	private MongoDbFactory mongo;
	
//	@Autowired
//	public DataBaseConfig(MongoDbFactory mongo) {
//		this.mongo = mongo;
//	}
	
//	@Autowired
//	private MongoProperties mongoProperties;
	
	
	@Override
	protected String getDatabaseName() {
//		return mongoProperties.getDatabase();
		return "studyroom";
//		return database;
	}

	@Override
	@Bean
	public Mongo mongo() throws Exception {
//		return mongo.getDb().getMongo();
//		return new MongoClient(host + ":" + port);
//		return new MongoClient(singletonList(new ServerAddress(host, port)),
//                singletonList(MongoCredential.createCredential(username,database, password.toCharArray())));
		MongoClientURI clientUri = new MongoClientURI(uri);
		return new MongoClient(clientUri);
	}
	
	@Bean
    public ValidatingMongoEventListener validatingMongoEventListener() {
        return new ValidatingMongoEventListener(validator());
    }
 
    @Bean
    public LocalValidatorFactoryBean validator() {
        return new LocalValidatorFactoryBean();
    }

}
