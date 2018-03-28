package co.devfoundry.workshop.command;

import co.devfoundry.workshop.MusicPlayer;

public class PlayNextTrack implements Command {

    private MusicPlayer musicPlayer;

    public PlayNextTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void execute() {
        musicPlayer.playNextTrack();
    }

}
