package co.devfoundry.workshop;

import co.devfoundry.workshop.command.Command;

public class MusicPlayerRemote {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }

}
