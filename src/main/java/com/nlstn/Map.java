package com.nlstn;

import java.util.ArrayList;
import java.util.List;

import com.nlstn.buildings.Building;
import com.nlstn.buildings.Castle;
import com.nlstn.buildings.Church;
import com.nlstn.buildings.Warehouse;

public class Map {

    private List<Building> buildings;

    private Warehouse warehouse;
    private Church church;
    private Castle castle;

    public Map() {
        buildings = new ArrayList<>();
    }

    public void initBaseBuildings() {
        warehouse = new Warehouse();
        church = new Church();
        castle = new Castle();
    }

    public void update() {

        warehouse.update();
        church.update();
        castle.update();

        buildings.forEach(building -> building.update());
    }

    public void addBuilding(Building building) {
        buildings.add(building);
    }

    public void upgradeBuilding(Class<? extends Building> clazz) {
        for (Building building : buildings) {
            if (clazz.isInstance(building) && building.getLevel() != 3) {
                building.upgrade();
                return;
            }
        }
    }

    public void listBuildings() {

        System.out.println("Special Buildings:");
        System.out.println(warehouse);
        System.out.println(church);

        buildings.forEach(System.out::println);
    }

    public int getCurrentCitizenCount() {
        int result = 0;

        buildings.stream().mapToInt(Building::getLevel).sum();

        return result;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public Church getChurch() {
        return church;
    }

    public Castle getCastle() {
        return castle;
    }
}
