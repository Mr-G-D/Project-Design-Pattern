import Advanced.AdvancedMediaPlayer;
import Advanced.Mp4Player;
import Advanced.VlcPlayer;
import Standard.MediaPlayer;

/**
 * @author DINESH KUMAR
 */

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer ap;

    public MediaAdapter(String str){
        if(str.equalsIgnoreCase("mp4")){
            ap = new Mp4Player();
        }
        if(str.equalsIgnoreCase("vlc")){
            ap = new VlcPlayer();
        }
    }

    public void play(String str){
        ap.play();
    }
}
