package command;

import command.workshop.Robot;
import command.workshop.WorkshopApp;

public class Main {
    public static void main(String[] args) {
        WorkshopApp workshopApp = new WorkshopApp(new Robot());
        workshopApp.run();
    }


}
