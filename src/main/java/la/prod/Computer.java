package la.prod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("computer")
public class Computer {
    private int id = 312421;
    private String userName = "antonladeiko";
    @Autowired
    @Qualifier("player")
    private MusicPlayer musicPlayer;

    public String showInfo(){
        return "In computer with id: " + id + " and username " + userName + " playing song: " + musicPlayer.playMusic();
    }
}
