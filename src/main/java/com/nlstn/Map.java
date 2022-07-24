package com.nlstn;

import java.util.ArrayList;
import java.util.List;

import com.nlstn.buildings.Building;
import com.nlstn.buildings.Warehouse;

public class Map {

    public List<Building> buildings;

    public Map() {
        buildings = new ArrayList<>();
    }

    public void initBaseBuildings() {
        buildings.add(new Warehouse());
    }

    public void listBuildings() {
        for (Building building : buildings) {
            System.out.println(building.getName() + " (" + building.getLevel() + ")");
        }
    }
}
