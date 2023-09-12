package lab5.task1;

import java.util.Random;

public class RandomOutTask implements Task{
    private Integer randomNumber;

    public RandomOutTask(){
        Random rand = new Random();
        randomNumber = rand.nextInt();
    }
    @Override
    public void execute() {
        System.out.println(randomNumber);
    }
}
