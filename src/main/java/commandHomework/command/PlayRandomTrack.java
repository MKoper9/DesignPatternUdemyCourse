package commandHomework.command;

import commandHomework.MusicPlayer;

public class PlayRandomTrack implements MusicPlayerCommand {

    MusicPlayer musicPlayer;

    public PlayRandomTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playNextTrack();
    }
}
