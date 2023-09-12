package lab5.Task4;

import java.util.ArrayList;
import java.util.List;

public class DangerousAlbum extends Album{

    public List<Song> songs = new ArrayList<>();
    @Override
    public void addSong(Song song) {

        boolean ok = true;
        for (int i = 2; i * i <= song.id; i++){
            if (song.id % i == 0) {
                ok = false;
                break;
            }
        }
        if (ok) songs.add(song);
    }
}
