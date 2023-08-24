package lab3.task1;

import lab3.task4.CandyBag;

import java.util.ArrayList;

public class Test {
    public static void main (String[] args){

        Baravelli baravelli = new Baravelli(5, 6);
       // System.out.println(baravelli);


        //..............task3........................
        CandyBox candy1 = new CandyBox();
        candy1.flavor = "Vanilie";

        CandyBox candy2 = new CandyBox();
        candy2.flavor = "Vanilie";

//        System.out.println(candy1==candy2);
//        System.out.println(candy1.equals(candy2));

        Lindt lindt1 =  new Lindt(6, 5.6f, 8);
        lindt1.flavor = "Chocolate";
        lindt1.origin = "France";

        Lindt lindt2 = new Lindt();
        lindt2.flavor = "Chocolate";
        lindt2.origin = "France";
        //System.out.println(lindt2.equals(lindt1));

        //.............. task 4 .............
        CandyBag candyBag = new CandyBag();
        Baravelli Candy1 = new Baravelli(5,5 );
        ChocAmor Candy2 = new ChocAmor(3.4F);
        Lindt Candy3 = new Lindt(3, 10, 6);

        candyBag.addCandy(Candy1);
        candyBag.addCandy(Candy2);
        candyBag.addCandy(Candy3);

        ChocAmor Choc1 = new ChocAmor(4.7f);
        //.............task 5.................
        baravelli.printBavarelliDim(); //cum scriu corect sa separ valorile pe fiecare linie ??
        lindt1.printLindtDim();
        Choc1.printChocAmorDim();;




    }
}
