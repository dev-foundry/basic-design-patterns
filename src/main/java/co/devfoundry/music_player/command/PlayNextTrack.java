package co.devfoundry.music_player.command;

import co.devfoundry.music_player.MusicPlayer;

public class PlayNextTrack implements Command {

    private MusicPlayer musicPlayer;

    public PlayNextTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void execute() {
        musicPlayer.playNextTrack();
    }

}
