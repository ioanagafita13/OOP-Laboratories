package lab5.Task4;

import java.util.ArrayList;
import java.util.List;

public class BadAlbum extends Album{

    public List<Song> songs = new ArrayList<>();


    // functie auxiliara pt a verifica daca nr e palindrom:
    public boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10; // aflam ultima cifra si o stocam in variabila "digit"
            reversedNumber = reversedNumber * 10 + digit; //inmultim cu 10 pt a ii adauga inca o cifra si apoi se adauga "digit" la fiecare iteratie
            number /= 10; // pt a elimina la fiecare iteratie ultima cifra, la final numarul initial ramane 0
        }
        return originalNumber == reversedNumber;
    }
    @Override
    public void addSong(Song song) {
        boolean ok = true ;
        for (int i = 1; i <= song.id; i++){
            if ((isPalindrome(song.id)) && (song.name.length()) == 3){
                ok = false ;
                break;
            }
        }
        if(ok) songs.add(song);
    }
}