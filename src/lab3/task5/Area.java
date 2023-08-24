package lab3.task5;

import lab3.task1.CandyBox;
import lab3.task4.CandyBag;

public class Area {
    public CandyBag candyBag;
    public int number;
    public String street;


    public Area(){

    }
    public Area(CandyBag candyBag, int number, String street){
        this.candyBag = candyBag;
        this.number = number;
        this.street = street;
    }
    public void getBirthDayCard(){
        System.out.printf("Adresa este strada %s, nr %d\n", this.street, this.number);
        System.out.printf("La multi ani!\n");
        for (CandyBox candyBox : candyBag.getCandyBag()) {
            System.out.println(candyBox.toString());
        }
    }



}
