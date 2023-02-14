package ru.mpei.nti.psdt;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Artur Dzhanaev
 * @created 12.02.2023
 */
@EnableJpaRepositories("ru.mpei.nti.psdt.user")
@EntityScan("ru.mpei.nti.psdt.user")
@Slf4j
@SpringBootApplication(scanBasePackages = {"ru.mpei.nti.psdt.user"})
public class Main {


    public static void main(String[] args) {SpringApplication.run(Main.class, args);}
}
