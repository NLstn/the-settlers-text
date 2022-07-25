package com.nlstn;

public class Gameloop extends Thread {

    private static final int TICKS_PER_SECOND = 1;

    public Gameloop() {
        super("Gameloop");
    }

    public void run() {
        long lastTime = System.currentTimeMillis();

        while (Game.getInstance().isRunning()) {
            long currentTime = System.currentTimeMillis();
            if (currentTime - lastTime > 1 / TICKS_PER_SECOND * 1000) {
                Game.getInstance().update();
                lastTime = currentTime;
            }
        }
        System.out.println("Shutting down Gameloop");
    }

}
