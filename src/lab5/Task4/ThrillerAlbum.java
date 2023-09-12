package lab5.Task4;

import java.util.ArrayList;
import java.util.List;

public class ThrillerAlbum extends Album{

    public List<Song> songs = new ArrayList<>();
    @Override
    public void addSong(Song song) {
        boolean ok = true;
        for (int i = 1; i <= song.id; i++){
            if (song.id % 2 == 00 ){
                ok = false;
                break;
            }
        }
        if (ok) songs.add(song);
    }
}
