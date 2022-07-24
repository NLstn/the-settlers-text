package com.nlstn.buildings;

import com.nlstn.Game;
import com.nlstn.Map;

public abstract class Building {

    private String name;

    private int level;
    private int maxLevel;

    public Building(String name) {
        this.name = name;
        level = 1;
        maxLevel = 3;
    }

    public void upgrade() {
        if (level >= maxLevel) {
            System.out.println("Building " + name + " is already max level");
            return;
        }
        Map map = Game.getInstance().getMap();
        if (map.getCurrentCitizenLevel() >= map.getChurch().getMaxCitizenCount()) {
            System.out.println("Too many citizens, upgrade church");
            return;
        }

        level++;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return getName() + " (" + getLevel() + ")";
    }

}
