package lab3.task1;

public class Lindt extends CandyBox {
    private float length;
    private float width;
    private float height;

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public Lindt(){

    }
    public Lindt(float length, float width, float height){

    }
    public Lindt(String origin, String flavor, float length, float width, float height){
        this.origin = origin;
        this.flavor = flavor;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public float getVolume() {
        return height * length * width;
    }
    public void printLindtDim(){
        System.out.printf(String.valueOf(this.height), this.width, this.length+ " ");
    }
}
