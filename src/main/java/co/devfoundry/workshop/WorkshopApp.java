package co.devfoundry.workshop;

import co.devfoundry.workshop.command.Command;

import java.util.ArrayList;
import java.util.List;

public class WorkshopApp {

    private List<Command> commandQueue = new ArrayList<Command>();

    public void addToQueue(Command command) {
        commandQueue.add(command);
    }

    public void run() {

        if(commandQueue.isEmpty()) {
            System.out.println("Kolejka nie zawiera żadnych komend!");
        }

        for(Command command : commandQueue) {
            command.execute();
        }

//        commandQueue.clear();
    }

    public void undoLastCommand() {
        for(Command command : commandQueue) {
            command.undo();
        }
    }

}
