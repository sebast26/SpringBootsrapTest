package pl.sebast26.bootstrapapptest.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author Sebastian Górecki <sebast26@man.poznan.pl>
 */
@Component
public class SampleService {

    @Value("${name}")
    private String name;

    public String getHelloMessage() {
        return "Hello World from service! My name is " + name;
    }
}
