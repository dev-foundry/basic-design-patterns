package co.devfoundry.music_player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MusicPlayer {

    private List<String> tracks = new ArrayList<String>(Arrays.asList("Track 1", "Track 2", "Track 3"));
    private int currentTrackNumber = 0;

    public void playFirstTrack() {
        System.out.println("Gram pierwszy utwór: " + tracks.get(0));
    }

    public void playNextTrack() {
        currentTrackNumber++;
        if (currentTrackNumber > 2) {
            currentTrackNumber = 0;
        }
        System.out.println("Gram kolejny utwór: " + tracks.get(currentTrackNumber));
    }

    public void playRandomTrack() {
        int randomTrackNumber = (int) (Math.random() * (3));
        System.out.println("Gram losowy utwór: " + tracks.get(randomTrackNumber));
    }

}
