package com.nlstn;

public class Game {

    private static Game instance;

    private InputThread input;

    private Map map;

    private boolean running = false;

    public static Game getInstance() {
        if (instance == null)
            instance = new Game();
        return instance;
    }

    private Game() {
        running = true;
        input = new InputThread();
        map = new Map();
    }

    public void start() {
        System.out.println("Starting Game");
        map.initBaseBuildings();
        input.start();
    }

    public void shutdown() {
        running = false;
    }

    public boolean isRunning() {
        return running;
    }

    public Map getMap() {
        return map;
    }

}
