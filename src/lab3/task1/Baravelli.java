package lab3.task1;

public class Baravelli extends CandyBox {
    private float radius;
    private float height;

    public Baravelli(){

    }
    public Baravelli(float radius, float height){

    }

    @Override
    public float getVolume() {

        return (float) ((Math.PI) * radius * radius * height);
    }

    @Override
    public String toString() {
        return "Baravelli{" +
                "radius=" + radius +
                ", height=" + height +
                ", flavor='" + flavor + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }

    //..........task 4.............
    public void printBavarelliDim(){
        System.out.printf(String.valueOf(this.radius), String.valueOf(this.height) + "\n");
    }
}
