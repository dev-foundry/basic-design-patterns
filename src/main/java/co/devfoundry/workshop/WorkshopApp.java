package co.devfoundry.workshop;

public class WorkshopApp {

    private Robot robot;

    public WorkshopApp(Robot robot) {
        this.robot = robot;
    }

    public void run() {
        robot.turnOn();
        robot.cut();
        robot.drill();
        robot.turnOff();
    }

}
