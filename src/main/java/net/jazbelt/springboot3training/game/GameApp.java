package net.jazbelt.springboot3training.game;

import org.springframework.context.annotation.*;

import java.util.Arrays;

@Configuration
@ComponentScan
public class GameApp {

    public static void main(String[] args) {
        try(var ctx = new AnnotationConfigApplicationContext(GameApp.class)) {
            var gameRunner = ctx.getBean(GameRunner.class);
            gameRunner.run();

            System.out.println();

            Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
