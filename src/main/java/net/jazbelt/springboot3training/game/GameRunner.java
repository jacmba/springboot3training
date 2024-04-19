package net.jazbelt.springboot3training.game;

public class GameRunner {
    //private MarioGame game;
    private SFGame game;

    public GameRunner(MarioGame game) {
        //this.game = game;
    }

    public GameRunner(SFGame game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game " + game.getName());
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
