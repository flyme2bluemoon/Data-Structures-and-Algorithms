package misc;

public class Trapezoid extends Shape {
    private int a, b, h;

    public Trapezoid(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public double getArea() {
        return ((double)(a+b)/2)*h;
    }
}
