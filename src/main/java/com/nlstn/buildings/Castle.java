package com.nlstn.buildings;

public class Castle extends Building {

    public Castle() {
        super("Castle");
    }

    public int getMaxSoldiers() {
        return getLevel() * 20;
    }

}
