package net.jazbelt.springboot3training.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//@Configuration
public class GameConfiguration {

    @Bean
    public IGame marioGame() {
        return new MarioGame();
    }

    /*@Bean
    public IGame sfGame() {
        return new SFGame();
    }

    @Bean
    public IGame tetrisGame() {
        return new TetrisGame();
    }*/

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
}
