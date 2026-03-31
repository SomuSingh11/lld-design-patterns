package structural.adapter.mediaPlayer.adapter;

import structural.adapter.mediaPlayer.adaptees.Mp4Codec;
import structural.adapter.mediaPlayer.player.MediaPlayer;

public class Mp4PlayerAdapter implements MediaPlayer {
    private final Mp4Codec codec;

    public Mp4PlayerAdapter(Mp4Codec codec) {
        this.codec = codec;
    }

    @Override
    public void play(String filename) {
        codec.playMp4(filename);
    }
}
