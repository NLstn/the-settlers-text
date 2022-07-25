package com.nlstn;

public class Game {

    private static Game instance;

    private InputThread input;
    private Gameloop loop;

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
        loop = new Gameloop();
        map = new Map();
    }

    public void start() {
        System.out.println("Starting Game");
        map.initBaseBuildings();
        input.start();
        loop.start();
    }

    public void shutdown() {
        running = false;
    }

    public void update() {
        map.update();
    }

    public boolean isRunning() {
        return running;
    }

    public Map getMap() {
        return map;
    }

}
