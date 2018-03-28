package co.devfoundry.workshop.command;

import co.devfoundry.workshop.MusicPlayer;

public class PlayFirstTrack implements Command {

    private MusicPlayer musicPlayer;

    public PlayFirstTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void execute() {
        musicPlayer.playFirstTrack();
    }

}
