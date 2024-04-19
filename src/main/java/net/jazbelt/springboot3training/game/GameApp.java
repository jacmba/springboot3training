package net.jazbelt.springboot3training.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GameApp {
    public static void main(String[] args) {
        try(var ctx = new AnnotationConfigApplicationContext(GameConfiguration.class)) {
            var marioRunner = (GameRunner) ctx.getBean("marioRunner");
            var sfRunner = (GameRunner) ctx.getBean( "sfRunner");
            var tetrisRunner = (GameRunner) ctx.getBean("tetrisRunner");
            var defaultRunner = ctx.getBean(GameRunner.class);

            marioRunner.run();
            sfRunner.run();
            tetrisRunner.run();
            defaultRunner.run();
        }
    }
}
