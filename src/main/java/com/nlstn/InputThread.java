package com.nlstn;

import java.util.Scanner;

public class InputThread extends Thread {

    public void run() {

        Scanner scanner = new Scanner(System.in);

        while (Game.getInstance().isRunning()) {
            String input = scanner.nextLine();
            System.out.println("Command: " + input);
            switch (input) {
                case "exit":
                    Game.getInstance().shutdown();
                    break;
                case "listBuildings":
                    Game.getInstance().getMap().listBuildings();
            }
        }

        System.out.println("Shutting down InputThread");
        scanner.close();
    }

}
