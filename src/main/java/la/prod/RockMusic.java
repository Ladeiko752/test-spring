package la.prod;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("rock")
public class RockMusic implements Music{
    private List<String> rockMusicList = new ArrayList<>();

    public RockMusic() {
        rockMusicList.add("Nirvana - You know You're right");
        rockMusicList.add("Marilyn Manson - Sweet Dreams");
        rockMusicList.add("Rammstein - Mein Hertz Brennt");
    }
    @Override
    public List<String> playMusic() {
        return rockMusicList;
    }
}
