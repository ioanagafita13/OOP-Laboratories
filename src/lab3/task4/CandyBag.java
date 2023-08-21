package lab3.task4;

import lab3.task1.Baravelli;
import lab3.task1.CandyBox;
import lab3.task1.ChocAmor;
import lab3.task1.Lindt;

import java.util.ArrayList;

public class CandyBag {
    private ArrayList<CandyBox> CandyBag = new ArrayList();

    public CandyBag() {
        Baravelli Candy1 = new Baravelli();
        ChocAmor Candy2 = new ChocAmor();
        Lindt Candy3 = new Lindt();

        CandyBag.add(Candy1);
        CandyBag.add(Candy2);
        CandyBag.add(Candy3);
    }



}
