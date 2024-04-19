package net.jazbelt.springboot3training.game;

public class GameApp {
    public static void main(String[] args) {
        MarioGame mario = new MarioGame();
        SFGame sf = new SFGame();
        TetrisGame tetris = new TetrisGame();
        GameRunner marioRunner = new GameRunner(mario);
        GameRunner sfRunner = new GameRunner(sf);
        GameRunner tetrisRunner = new GameRunner(tetris);
        marioRunner.run();
        sfRunner.run();
        tetrisRunner.run();
    }
}
