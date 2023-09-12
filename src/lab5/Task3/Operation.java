package lab5.Task3;

public class Operation implements Div, Minus, Plus, Mult{

    float nr;
    @Override
    public void div(float nr) {
        this.nr /= nr;
    }

    @Override
    public void minus(float nr) {
        this.nr -= nr;
    }

    @Override
    public void plus(float nr) {
        this.nr += nr;
    }

    @Override
    public void mult(float nr) {
        this.nr *=nr;
    }
}
