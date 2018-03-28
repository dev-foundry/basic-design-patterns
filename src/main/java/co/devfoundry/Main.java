package co.devfoundry;

import co.devfoundry.workshop.MusicPlayer;
import co.devfoundry.workshop.MusicPlayerRemote;
import co.devfoundry.workshop.command.PlayFirstTrack;
import co.devfoundry.workshop.command.PlayNextTrack;
import co.devfoundry.workshop.command.PlayRandomTrack;

public class Main {

    public static void main(String[] args) {

        MusicPlayer musicPlayer = new MusicPlayer();
        MusicPlayerRemote remote = new MusicPlayerRemote();

        remote.setCommand(new PlayFirstTrack(musicPlayer));
        remote.pressButton();

        remote.setCommand(new PlayNextTrack(musicPlayer));
        remote.pressButton();
        remote.pressButton();
        remote.pressButton();

        remote.setCommand(new PlayRandomTrack(musicPlayer));
        remote.pressButton();
        remote.pressButton();

    }

}
