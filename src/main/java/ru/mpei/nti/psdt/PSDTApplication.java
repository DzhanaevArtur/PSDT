package ru.mpei.nti.psdt;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

/**
 * @author Artur Dzhanaev
 * @created 12.02.2023
 */
@Slf4j
@SpringBootApplication
public class PSDTApplication {


    public static void main(String[] args) {SpringApplication.run(PSDTApplication.class, args);}

    @Bean
    CommandLineRunner init(UserRepository userRepository) {
        return args -> {
            Stream.of("Julie", "Jennifer", "Helen").forEach(name ->
                    userRepository.save(new User(name, name.toLowerCase() + "@domain.com")));
            userRepository.findAll().forEach((x) -> log.info(x.toString()));
        };
    }
}
