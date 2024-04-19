package net.jazbelt.springboot3training.hello;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(HelloSpringConfig.class);

        String name = ctx.getBean(String.class,"name");
        int age = ctx.getBean(Integer.class, "age");
        System.out.println("Hello, " + name + ". You are " + age);
        System.out.println(ctx.getBean("person"));
        System.out.println(ctx.getBean("address"));
    }
}
