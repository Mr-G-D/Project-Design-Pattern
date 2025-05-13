import Advanced.Mp4Player;
import Standard.MediaPlayer;
import Standard.Mp3Player;

/**
 * @author DINESH KUMAR
 */

public class AudioPlayer implements MediaPlayer {

    MediaAdapter adapter;

    public void play(String str){
        if(str.equalsIgnoreCase("mp3")){
            System.out.println("playing MP3");
        } else if (str.equalsIgnoreCase("mp4") || str.equalsIgnoreCase("vlc")) {
            adapter = new MediaAdapter(str);
            adapter.play(str);
        }else{
            System.out.println("Invalid File Format");
        }
    }
}
