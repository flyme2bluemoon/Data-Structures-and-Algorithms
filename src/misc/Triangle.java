package misc;

public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(int b, int h) {
        this.base = b;
        this.height = h;
    }

    @Override
    public double getArea() {
        return (double)(this.base * this.height)/2.0;
    }
}
