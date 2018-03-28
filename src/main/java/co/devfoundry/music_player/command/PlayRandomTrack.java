package co.devfoundry.music_player.command;

import co.devfoundry.music_player.MusicPlayer;

public class PlayRandomTrack implements Command {

    private MusicPlayer musicPlayer;

    public PlayRandomTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void execute() {
        musicPlayer.playRandomTrack();
    }

}
