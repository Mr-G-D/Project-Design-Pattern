import Components.DVDPlayer;
import Components.Lights;
import Components.Projector;
import Components.SoundSystem;

/**
 * @author DINESH KUMAR
 */


public class HomeTheater {

    public DVDPlayer dvd;
    public Lights light;
    public Projector projector;
    public SoundSystem sound;

    HomeTheater(DVDPlayer dvd, Lights light, Projector projector, SoundSystem sound){
        this.dvd = dvd;
        this.light = light;
        this.projector = projector;
        this.sound = sound;
    }

    public void playMovie(String movie){
        System.out.println("Playing Movie");
        light.dim();
        sound.setVolume(10);
        projector.on();
        dvd.on();
        dvd.play(movie);
    }

    public void stopMovie(){
        System.out.println("Stopping Movie");
        light.on();
        projector.off();
        dvd.off();
    }
}
