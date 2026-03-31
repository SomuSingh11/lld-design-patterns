package structural.adapter.mediaPlayer.adaptees;

public class VlcCodec {
    public void playVlc(String filename) {
        System.out.println("VLC Codec: Decoding and playing " + filename);
    }
}
