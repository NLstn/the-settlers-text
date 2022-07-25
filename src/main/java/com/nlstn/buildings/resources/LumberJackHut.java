package com.nlstn.buildings.resources;

import java.util.Random;

import com.nlstn.Game;
import com.nlstn.buildings.Building;

public class LumberJackHut extends Building {

    public LumberJackHut() {
        super("LumberJackHut");
    }

    @Override
    public void update() {
        Random random = new Random();

        if (random.nextDouble() <= 0.18) {
            Game.getInstance().getMap().getWarehouse().storeWood(getLevel() * 3);
        }
    }

}
