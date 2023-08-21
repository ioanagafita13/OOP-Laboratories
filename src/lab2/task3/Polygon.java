package lab2.task3;

import java.util.Arrays;
import java.util.List;

public class Polygon {
    public int numberOfCorners;

    public void setNumberOfCorners(int numberOfCorners){

        this.numberOfCorners = numberOfCorners;
    }
    public int getNumberOfCorners(){

        return numberOfCorners;
    }

    Point[] P; //am creat un vector de obiecte tip Point
    public Polygon (int n){
        numberOfCorners = n;// constructor cu un param nr n si aloca spatiu pt puncte
        P = new Point[n]; // am alocat memorie pt un vector de n obieecte tip Point  (pt task 3)
        for (int i = 0; i < n; ++i) {
            P[i] = new Point(0, 0);
        }
    }


    public Polygon (List<Float> p){
        this(p.size() / 2);
        int n = p.size();
        // [2, 5, 1, 6, 7, 9]
        int k = 0;
        for (int i = 0; i < n; i += 2){
            // p[i] si p[i + 1] construiesc P
            P[k].changeCoords(p.get(i), p.get(i + 1));
            ++k;
        }
    }

    public void printPolygon() {
        System.out.println(Arrays.toString(P));
    }
}
