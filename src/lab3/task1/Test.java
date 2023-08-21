package lab3.task1;

import lab3.task4.CandyBag;

import java.util.ArrayList;

public class Test {
    public static void main (String[] args){

        Baravelli baravelli = new Baravelli();
       // System.out.println(baravelli);


        //..............task3........................
        CandyBox candy1 = new CandyBox();
        candy1.flavor = "Vanilie";

        CandyBox candy2 = new CandyBox();
        candy2.flavor = "Vanilie";

//        System.out.println(candy1==candy2);
//        System.out.println(candy1.equals(candy2));

        Lindt lindt1 =  new Lindt();
        lindt1.flavor = "Chocolate";
        lindt1.origin = "France";

        Lindt lindt2 = new Lindt();
        lindt2.flavor = "Chocolate";
        lindt2.origin = "France";
        //System.out.println(lindt2.equals(lindt1));

        ChocAmor Choc1 = new ChocAmor();
        //.............task 4.................
        baravelli.printBavarelliDim(); //cum scriu corect sa separ valorile pe fiecare linie ??
        lindt1.printLindtDim();
        Choc1.printChocAmorDim();;




    }
}
