package adapter;

// MusicPlayerApp to demonstrate the Adapter pattern
public class MusicPlayerApp {

    public static void main(String[] args) {
        AudioPlayer player = new MP3Player();

        // Playing MP3 file
        player.play("mp3", "song1.mp3");

        // Playing WAV file using adapter
        AudioPlayer wavAdapter = new AudioAdapter("wav");
        wavAdapter.play("wav", "song2.wav");

        // Playing AAC file using adapter
        AudioPlayer aacAdapter = new AudioAdapter("aac");
        aacAdapter.play("aac", "song3.aac");
    }
}

