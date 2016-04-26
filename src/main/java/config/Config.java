package config;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import repository.AuthorRepository;
import service.AuthorRepositoryService;
import service.AuthorRepositoryServiceImpl;

/**
 *
 * @author gilson
 */
@Configuration
@EnableJpaRepositories(basePackages = "repository")
@EntityScan(basePackages = "model.entities")
public class Config {
    
    @Bean
    public AuthorRepositoryService authorRepositoryService(AuthorRepository authorRepository) {
        return new AuthorRepositoryServiceImpl(authorRepository);
    }
    
}
