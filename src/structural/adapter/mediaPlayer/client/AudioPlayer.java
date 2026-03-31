package structural.adapter.mediaPlayer.client;

import structural.adapter.mediaPlayer.adaptees.Mp4Codec;
import structural.adapter.mediaPlayer.adaptees.VlcCodec;
import structural.adapter.mediaPlayer.adapter.Mp4PlayerAdapter;
import structural.adapter.mediaPlayer.adapter.VlcPlayerAdapter;
import structural.adapter.mediaPlayer.player.MediaPlayer;
import structural.adapter.mediaPlayer.player.Mp3Player;

public class AudioPlayer {
    public void playFile(String filename){
        MediaPlayer player;
        String ext = filename
                .substring(filename.lastIndexOf(".")+1)
                .toLowerCase();

        switch (ext) {
            case "mp3":
                player = new Mp3Player();
                break;
            case "vlc":
                player = new VlcPlayerAdapter(new VlcCodec());
                break;
            case "mp4":
                player = new Mp4PlayerAdapter(new Mp4Codec());
                break;
            default:
                System.out.println("Unsupported format: " + ext);
                return;
        }

        player.play(filename);
    }
}
