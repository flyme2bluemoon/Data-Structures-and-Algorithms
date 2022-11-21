package misc;

public class Circle extends Shape {
    private int radius;

    public Circle(int r) {
        this.radius = r;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
