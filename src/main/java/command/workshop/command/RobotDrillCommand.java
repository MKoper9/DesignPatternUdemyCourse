package command.workshop.command;

import command.workshop.Robot;

public class RobotDrillCommand implements Command {

    Robot robot;

    public RobotDrillCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.drill();
    }

    @Override
    public void undo() {

    }
}
