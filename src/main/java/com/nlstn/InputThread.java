package com.nlstn;

import java.util.Scanner;

import com.nlstn.buildings.resources.LumberJackHut;

public class InputThread extends Thread {

    public InputThread() {
        super("InputThread");
    }

    public void run() {

        Scanner scanner = new Scanner(System.in);

        while (Game.getInstance().isRunning()) {

            String input = scanner.nextLine();
            System.out.println("Command: " + input);

            Game game = Game.getInstance();

            switch (input) {
                case "exit":
                    game.shutdown();
                    break;
                case "listBuildings":
                    game.getMap().listBuildings();
                    break;
                case "upgradeChurch":
                    game.getMap().getChurch().upgrade();
                    break;
                case "upgradeWarehouse":
                    game.getMap().getWarehouse().upgrade();
                    break;
                case "upgradeCastle":
                    game.getMap().getCastle().upgrade();
                    break;
                case "buildLumberjack":
                    game.getMap().addBuilding(new LumberJackHut());
                    break;
                case "upgradeLumberjack":
                    game.getMap().upgradeBuilding(LumberJackHut.class);
                    break;
            }
        }

        System.out.println("Shutting down InputThread");
        scanner.close();
    }

}
