package commandHomework;

import commandHomework.command.MusicPlayerRemote;
import commandHomework.command.PlayFirstTrack;
import commandHomework.command.PlayNextTrack;
import commandHomework.command.PlayRandomTrack;

public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        MusicPlayerRemote remote = new MusicPlayerRemote();
        remote.setMusicPlayerCommand(new PlayFirstTrack(musicPlayer));
        remote.pressButton();
        remote.setMusicPlayerCommand(new PlayNextTrack(musicPlayer));
        remote.pressButton();
        remote.pressButton();
        remote.pressButton();
        remote.setMusicPlayerCommand(new PlayRandomTrack(musicPlayer));
        remote.pressButton();
        remote.pressButton();
    }
}
