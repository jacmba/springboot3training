package net.jazbelt.springboot3training.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("TetrisGameQualifier")
public class TetrisGame implements IGame {
    //@Override
    public void up() {
        System.out.println("Rotate");
    }

    //@Override
    public void down() {
        System.out.println("Drop");
    }

    //@Override
    public void left() {
        System.out.println("Block left");
    }

    //@Override
    public void right() {
        System.out.println("Block right");
    }

    //@Override
    public String getName() {
        return "Tetris";
    }
}
