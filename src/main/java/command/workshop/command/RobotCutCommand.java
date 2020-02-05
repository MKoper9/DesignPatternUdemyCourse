package command.workshop.command;

import command.workshop.Robot;

public class RobotCutCommand implements Command {
    Robot robot;

    public RobotCutCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.cut();
    }

    @Override
    public void undo() {

    }
}
