package com.nlstn.buildings;

public class Warehouse extends Building {

    private int occupiedSpace;

    private int wood;

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

    public void storeWood(int count) {
        if (occupiedSpace + count > getMaxSpace()) {
            System.out.println("Warehouse is full!");
        }
        wood += count;
        System.out.println("Received " + count + " wood, new balance: " + wood);
    }

    public int getWood() {
        return wood;
    }

}
