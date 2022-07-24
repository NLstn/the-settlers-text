package com.nlstn;

import java.util.Scanner;

public class InputThread extends Thread {

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
            }
        }

        System.out.println("Shutting down InputThread");
        scanner.close();
    }

}
