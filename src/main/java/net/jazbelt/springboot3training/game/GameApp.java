package net.jazbelt.springboot3training.game;

public class GameApp {
    public static void main(String[] args) {
        // MarioGame game = new MarioGame();
        SFGame game = new SFGame();
        GameRunner runner = new GameRunner(game);
        runner.run();
    }
}
