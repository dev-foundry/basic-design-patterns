package co.devfoundry.workshop.command;

import co.devfoundry.workshop.Robot;

public class RobotDrillCommand implements Command {

    private Robot robot;

    public RobotDrillCommand(Robot robot) {
        this.robot = robot;
    }

    public void execute() {
        robot.drill();
    }

    public void undo() {

    }
}
