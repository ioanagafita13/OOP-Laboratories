package lab3.task1;

public class ChocAmor extends CandyBox {
    private float length;

    public ChocAmor(){

    }
    public ChocAmor(float length){

    }

    @Override
    public float getVolume() {

        return length * length;
    }
    public void printChocAmorDim(){
        System.out.printf(String.valueOf(this.length)+ " ");
    }
}
