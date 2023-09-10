package lab3.task1;

public class ChocAmor extends CandyBox {
    private float length;

    public ChocAmor(){

    }
    public ChocAmor(float length){
        this.length = length;

    }

    @Override
    public float getVolume() {

        return length * length;
    }
    public void printChocAmorDim(){
        System.out.println(length);
    }
}
