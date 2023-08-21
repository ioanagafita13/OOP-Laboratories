package lab2.task3;

public class Point {
    private float x;
    private float y;

    public void setX(float x){
        this.x = x;
    }

    public float getX() {
        return x;
    }
    public void setY(float y){
        this.y = y;
    }
    public float getY(){
        return y;
    }

    public Point (float x, float y){ //task 3: un constructor ce primeste coordonatele
        this.x = x;
        this.y = y;
    }

    public void changeCoords(float x1, float y1){ // task 3: o metoda care modifica coord.
        this.x = x1;
        this.y = y1;
    }

    public void printCoord(){ // task 3: functia de afisare a coord..nu stiu daca e bun
        System.out.println("(" + x + ", " + y + ")");
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
