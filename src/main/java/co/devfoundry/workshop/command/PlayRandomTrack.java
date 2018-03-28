package co.devfoundry.workshop.command;

import co.devfoundry.workshop.MusicPlayer;

public class PlayRandomTrack implements Command {

    private MusicPlayer musicPlayer;

    public PlayRandomTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void execute() {
        musicPlayer.playRandomTrack();
    }

}
