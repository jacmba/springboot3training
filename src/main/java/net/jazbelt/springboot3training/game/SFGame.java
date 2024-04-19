package net.jazbelt.springboot3training.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SFGameQualifier")
public class SFGame implements IGame {
    public void up() {
        System.out.println("Attack");
    }

    public void down() {
        System.out.println("Crouch");
    }

    public void left() {
        System.out.println("Cover");
    }

    public void right() {
        System.out.println("Hadouken!");
    }

    public String getName() {
        return "Street Fighter";
    }
}
