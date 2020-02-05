package command.workshop.command;

public class CoffeMakerTurnOffCommand implements Command {

    CoffeMaker coffeMaker;

    public CoffeMakerTurnOffCommand(CoffeMaker coffeMaker) {
        this.coffeMaker = coffeMaker;
    }

    @Override
    public void execute() {
        coffeMaker.turnOff();
    }

    @Override
    public void undo() {
        coffeMaker.turnOn();
    }
}
