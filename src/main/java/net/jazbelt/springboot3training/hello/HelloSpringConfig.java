package net.jazbelt.springboot3training.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age) {};
record Address (String firstLine, String city) {};

@Configuration
public class HelloSpringConfig {

    @Bean
    public String name() {
        return "John Doe";
    }

    @Bean
    public int age() {
        return 20;
    }

    @Bean
    public Person person() {
        return new Person("Jack Doe", 25);
    }

    @Bean
    public Address address() {
        return new Address("Baker Street", "London");
    }
}
