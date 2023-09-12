package lab5.Task4;

import java.util.ArrayList;
import java.util.List;

public abstract class Album {
    public List<Song> songs = new ArrayList<>();

    public abstract void addSong(Song song);
    public void removeSong(){

    }

    @Override
    public String toString() {
        return "Album{" +
                "songs=" + songs +
                '}';
    }
}
