package co.devfoundry.workshop.command;

import co.devfoundry.workshop.Robot;

public class RobotTurnOnCommand implements Command {

    private Robot robot;

    public RobotTurnOnCommand(Robot robot) {
        this.robot = robot;
    }

    public void execute() {
        robot.turnOn();
    }

    public void undo() {
        robot.turnOff();
    }

}
