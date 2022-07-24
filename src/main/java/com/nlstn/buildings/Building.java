package com.nlstn.buildings;

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
        level++;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

}
