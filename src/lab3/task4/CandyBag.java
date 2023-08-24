package lab3.task4;

import lab3.task1.Baravelli;
import lab3.task1.CandyBox;
import lab3.task1.ChocAmor;
import lab3.task1.Lindt;

import java.util.ArrayList;

public class CandyBag {
    private ArrayList<CandyBox> CandyBag = new ArrayList();

    public ArrayList<CandyBox> getCandyBag(){ // getter

        return CandyBag;
    }

    public CandyBag() {
    }

    public void addCandy(CandyBox candyBox) {
        CandyBag.add(candyBox);
    }



}
