package lab3.task1;

public class Baravelli extends CandyBox {
    private float radius;
    private float height;

    public Baravelli(){

    }
    public Baravelli(float radius, float height){
        this.radius = radius;
        this.height = height;
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
        System.out.printf("Sunt aici %f %f\n", radius, height);
        // %c -> caracter
        // %d -> decimal adica intreg
        // %f -> float
        // %s -> string
        // %ld -> long long
    }
}
