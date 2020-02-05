package command;

import command.workshop.Robot;
import command.workshop.WorkshopApp;
import command.workshop.command.*;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        WorkshopApp workshopApp = new WorkshopApp();
  /*      workshopApp.addToQueue(new RobotTurnOnCommand(robot));
        workshopApp.addToQueue(new RobotCutCommand(robot));
        workshopApp.addToQueue(new RobotDrillCommand(robot));
        workshopApp.addToQueue(new RobotTurnOffCommand(robot));

        workshopApp.run();

        CoffeMaker coffeMaker = new CoffeMaker();
        workshopApp.addToQueue(new CoffeMakerTurnOnCommand(coffeMaker));
        workshopApp.addToQueue(new CoffeMakerTurnOffCommand(coffeMaker));
        workshopApp.run();*/

        workshopApp.addToQueue(new RobotTurnOnCommand(robot));
        workshopApp.run();
        workshopApp.undoLastCommand();
    }


}
