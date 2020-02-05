package commandHomework;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MusicPlayer {

    List<String> tracks = Arrays.asList("Track 1", "Track 2", "Track 3");
    int currentTrackNumber = 0;

    public void playFirstTrack() {
        System.out.println("Play first track: "+tracks.get(0));
    }

    public void playNextTrack() {
        currentTrackNumber++;
        if (currentTrackNumber > 2) {
            currentTrackNumber = 0;
        }
        System.out.println("Play next track: "+tracks.get(currentTrackNumber));
    }

    public void playRandomTrack() {
        Random random = new Random(tracks.size());
        System.out.println("Play random track: "+tracks.get(random.nextInt()));
    }
}
