package net.jazbelt.springboot3training.game;

public class MarioGame implements IGame {
    public void up() {
        System.out.println("Jump!");
    }

    public void down() {
        System.out.println("Dive into pipe");
    }

    public void left() {
        System.out.println("Run backward");
    }

    public void right() {
        System.out.println("Run forward");
    }

    public String getName() {
        return "Mario";
    }
}
