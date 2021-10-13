package la.prod;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("rap")
public class RapMusic implements Music{
    private List<String> rapMusicList = new ArrayList<>();

    public RapMusic() {
        rapMusicList.add("Scriptonite, Rayda - Baby Mama");
        rapMusicList.add("104 - Мимо Де Жанейро");
        rapMusicList.add("Platina - San Laurent");
    }

    @Override
    public List<String> playMusic() {
        return rapMusicList;
    }
}
