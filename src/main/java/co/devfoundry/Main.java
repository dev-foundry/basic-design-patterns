package co.devfoundry;

import co.devfoundry.workshop.Robot;
import co.devfoundry.workshop.WorkshopApp;

public class Main {

    public static void main(String[] args) {

        WorkshopApp workshopApp = new WorkshopApp(new Robot());
        workshopApp.run();

    }

}
