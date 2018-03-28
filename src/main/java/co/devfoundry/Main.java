package co.devfoundry;

import co.devfoundry.music_player.MusicPlayer;
import co.devfoundry.music_player.MusicPlayerRemote;
import co.devfoundry.music_player.command.PlayFirstTrack;
import co.devfoundry.music_player.command.PlayNextTrack;
import co.devfoundry.music_player.command.PlayRandomTrack;

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
