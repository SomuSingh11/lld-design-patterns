package structural.adapter.mediaPlayer.adapter;

import structural.adapter.mediaPlayer.adaptees.VlcCodec;
import structural.adapter.mediaPlayer.player.MediaPlayer;

public class VlcPlayerAdapter implements MediaPlayer {
    private final VlcCodec codec;

    public VlcPlayerAdapter(VlcCodec codec) {
        this.codec = codec;
    }

    @Override
    public void play(String filename) {
        codec.playVlc(filename);
    }
}
