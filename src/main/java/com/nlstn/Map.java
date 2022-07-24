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
    }

    public void listBuildings() {

        System.out.println("Special Buildings:");
        System.out.println(warehouse);
        System.out.println(church);

        for (Building building : buildings) {
            System.out.println(building);
        }
    }

    public int getCurrentCitizenLevel() {
        int result = 0;

        for (Building building : buildings) {
            result += building.getLevel();
        }

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
