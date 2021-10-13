package la.prod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("player")
public class MusicPlayer {
    @Autowired
    @Qualifier("rap")
    private Music music;

    public String playMusic(){
        return "Playing: " + music.playMusic();
    }
}
