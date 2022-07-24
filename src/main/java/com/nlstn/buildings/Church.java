package com.nlstn.buildings;

public class Church extends Building {

    public Church() {
        super("Church");
    }

    public int getMaxCitizenCount() {
        return getLevel() * 50;
    }

}
