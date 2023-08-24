package lab3.task5;

import lab3.task1.Baravelli;
import lab3.task1.ChocAmor;
import lab3.task1.Lindt;
import lab3.task4.CandyBag;

public class Test {
    public static void main (String args[]){
        CandyBag candyBag = new CandyBag();
        Baravelli Candy1 = new Baravelli(5,5 );
        ChocAmor Candy2 = new ChocAmor(3.4F);
        Lindt Candy3 = new Lindt(3, 10, 6);

        candyBag.addCandy(Candy1);
        candyBag.addCandy(Candy2);
        candyBag.addCandy(Candy3);

        Area area = new Area(candyBag, 19, "Nufarului");
        area.getBirthDayCard();
    }
}
