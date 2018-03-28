package co.devfoundry.music_player;

import co.devfoundry.music_player.command.Command;

public class MusicPlayerRemote {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }

}
