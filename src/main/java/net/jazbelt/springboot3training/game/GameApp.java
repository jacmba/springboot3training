package net.jazbelt.springboot3training.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GameApp {
    @Bean
    public IGame marioGame() {
        return new MarioGame();
    }

    @Bean
    public IGame sfGame() {
        return new SFGame();
    }

    @Bean
    public IGame tetrisGame() {
        return new TetrisGame();
    }

    @Bean
    @Primary
    public GameRunner marioRunner(IGame marioGame) {
        return new GameRunner(marioGame);
    }

    @Bean
    public GameRunner sfRunner(IGame sfGame) {
        return new GameRunner(sfGame);
    }

    @Bean
    public GameRunner tetrisRunner(IGame tetrisGame) {
        return new GameRunner(tetrisGame);
    }

    public static void main(String[] args) {
        try(var ctx = new AnnotationConfigApplicationContext(GameApp.class)) {
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
