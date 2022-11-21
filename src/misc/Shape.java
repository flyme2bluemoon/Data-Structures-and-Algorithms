package misc;

abstract public class Shape implements Comparable<Shape> {
    abstract public double getArea();

    public String toString() {
        return String.format("%s (Area: %f)", this.getClass().getName(), this.getArea());
    }

    public int compareTo(Shape other) {
        double diff = this.getArea() - other.getArea();
        return (int)(diff >= 0 ? Math.ceil(diff) : Math.floor(diff));
    }
}
