package pl.sebast26.bootstrapapptest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Sebastian Górecki <sebast26@man.poznan.pl>
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
