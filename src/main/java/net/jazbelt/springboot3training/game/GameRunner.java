package net.jazbelt.springboot3training.game;

public class GameRunner {
    private final IGame game;

    public GameRunner(IGame game) {
        this.game = game;
    }

    public void run() {
        System.out.println("========================================");
        System.out.println("Running game " + game.getName());
        game.up();
        game.down();
        game.left();
        game.right();
        System.out.println();
    }
}
