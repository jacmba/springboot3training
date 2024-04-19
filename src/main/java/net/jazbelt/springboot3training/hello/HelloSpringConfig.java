package net.jazbelt.springboot3training.hello;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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

    @Bean
    @Primary
    public Person person4(String name, int age, Address address) {
        return new Person(name, age, address);
    }

    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier")Address address) {
        return new Person(name, age, address);
    }

    @Bean(name = "address1")
    @Primary
    public Address address() {
        return new Address("Baker Street", "London");
    }

    @Bean
    @Qualifier("address3qualifier")
    public Address address3() {
        return new Address("Sunset Blvd", "LA");
    }
}
