package co.devfoundry.workshop.command;

import co.devfoundry.workshop.Robot;

public class RobotTurnOffCommand implements Command {

    private Robot robot;

    public RobotTurnOffCommand(Robot robot) {
        this.robot = robot;
    }

    public void execute() {
        robot.turnOff();
    }

    public void undo() {
        robot.turnOn();
    }
}
