package abfbe.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by mauret on 05/08/15.
 */
@Configuration
@EnableJpaRepositories(basePackages = "abfbe.dao")
@EnableAutoConfiguration
@EntityScan(basePackages = {"abfbe.domain"})
public class Persistence {
}
