/**
 * @author DINESH KUMAR
 */

public class MusicPlayer {

    public static void main(String[] str) {
        AudioPlayer ap = new AudioPlayer();

        ap.play("mp3");
        ap.play("mp4");
        ap.play("vlc");
        ap.play("none");
    }
}
