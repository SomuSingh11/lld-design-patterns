package structural.adapter.mediaPlayer.app;

import structural.adapter.mediaPlayer.client.AudioPlayer;

public class MediaPlayerDemo {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.playFile("song.mp3");
        player.playFile("movie.mp4");
        player.playFile("documentary.vlc");
        player.playFile("image.png");
    }
}
