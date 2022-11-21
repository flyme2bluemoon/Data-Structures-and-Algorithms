package misc;

public class Rectangle extends Shape {
    int length, width;

    public Rectangle(int l, int w) {
        this.length = l;
        this.width = w;
    }

    public double getArea() {
        return (double)(length * width);
    }
}
