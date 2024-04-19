package net.jazbelt.springboot3training.hello;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class HelloSpringApp {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(HelloSpringConfig.class)) {
            ;

            String name = ctx.getBean(String.class, "name");
            int age = ctx.getBean(Integer.class, "age");
            System.out.println("Hello, " + name + ". You are " + age);
            System.out.println(ctx.getBean("person"));
            System.out.println(ctx.getBean("person2MethodCall"));
            System.out.println(ctx.getBean("person3Parameters"));
            System.out.println(ctx.getBean(Person.class));
            System.out.println(ctx.getBean("person5Qualifier"));
            System.out.println(ctx.getBean("address1"));
            System.out.println(ctx.getBean(Address.class));

            Arrays.stream(ctx.getBeanDefinitionNames())
                    .forEach(System.out::println);
        }
    }
}
