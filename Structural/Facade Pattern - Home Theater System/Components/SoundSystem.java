package Components;

/**
 * @author DINESH KUMAR
 */

public class SoundSystem {

    int vol = 7;

    public void setVolume(int vol){
        this.vol = vol;
        System.out.println("Volume: " + vol);
    }

    public void mute(){
        System.out.println("Muted");
    }
}
