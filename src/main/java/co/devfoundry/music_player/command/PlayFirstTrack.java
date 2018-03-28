package co.devfoundry.music_player.command;

import co.devfoundry.music_player.MusicPlayer;

public class PlayFirstTrack implements Command {

    private MusicPlayer musicPlayer;

    public PlayFirstTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void execute() {
        musicPlayer.playFirstTrack();
    }

}
