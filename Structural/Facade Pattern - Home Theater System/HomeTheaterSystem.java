import Components.DVDPlayer;
import Components.Lights;
import Components.Projector;
import Components.SoundSystem;

/**
 * @author DINESH KUMAR
 */

public class HomeTheaterSystem {

    public static void main(String[] str){
        DVDPlayer dvd = new DVDPlayer();
        Lights light = new Lights();
        SoundSystem sound = new SoundSystem();
        Projector proj = new Projector();

        HomeTheater ht = new HomeTheater(dvd, light, proj, sound);

        ht.playMovie("Fight Club");

        System.out.println("\n");

        ht.stopMovie();

    }
}
