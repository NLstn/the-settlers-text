package com.nlstn.buildings;

public class Warehouse extends Building {

    public Warehouse() {
        super("Warehouse");
    }

    public int getMaxSpace() {
        switch (getLevel()) {
            case 1:
                return 250;
            case 2:
                return 500;
            case 3:
                return 1000;
            case 4:
                return 2000;
        }
        throw new IllegalStateException("Invalid level: " + getLevel());
    }

}
