package net.jazbelt.springboot3training.game;

import org.springframework.stereotype.Component;

public interface IGame {
    void up();
    void down();
    void left();
    void right();
    String getName();
}
