package io.chiragbhatia94.jobportal.config;

import io.chiragbhatia94.jobportal.model.User;
import io.chiragbhatia94.jobportal.repository.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {
    @Bean
    CommandLineRunner initDatabase(UserRepo repository) {
        return args -> {
            System.out.println("Preloading " + repository.save(new User("admin", "password")));
        };
    }
}