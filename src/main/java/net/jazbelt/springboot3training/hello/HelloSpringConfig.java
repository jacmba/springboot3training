package net.jazbelt.springboot3training.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address) {};
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
        return new Person("Jack Doe", 25, new Address("Sesame St", "NYC"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3) {
        return new Person(name, age, address3);
    }

    @Bean(name = "address1")
    public Address address() {
        return new Address("Baker Street", "London");
    }

    @Bean
    public Address address3() {
        return new Address("Sunset Blvd", "LA");
    }
}
