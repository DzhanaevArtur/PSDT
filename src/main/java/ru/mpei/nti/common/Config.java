package ru.mpei.nti.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author Artur Dzhanaev
 * @created 13.02.2023
 */
@ComponentScans(value = {@ComponentScan("ru.mpei.nti.psdt")})
@Configuration
@EnableAutoConfiguration()
@EnableTransactionManagement
@Slf4j
public class Config {


    @Value("${db.driver}")
    private String DB_DRIVER;

    @Value("${db.url}")
    private String DB_URL;

    @Value("${db.username}")
    private String DB_USERNAME;

    @Value("${db.password}")
    private String DB_PASSWORD;


    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName(DB_DRIVER);
        driverManagerDataSource.setUrl(            DB_URL);
        driverManagerDataSource.setUsername(       DB_USERNAME);
        driverManagerDataSource.setPassword(       DB_PASSWORD);
        return driverManagerDataSource;
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
        localSessionFactoryBean.setDataSource(dataSource());
        return localSessionFactoryBean;
    }
}
