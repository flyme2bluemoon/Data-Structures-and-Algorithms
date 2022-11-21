import misc.*;

import java.util.Arrays;

public class ChildsPlay {
    public static void main(String[] args) {
        Shape shapes[] = new Shape[4];

        shapes[0] = new Circle(3);
        shapes[1] = new Triangle(3, 5);
        shapes[2] = new Rectangle(7, 4);
        shapes[3] = new Square(5);

        System.out.println(Arrays.toString(shapes));
        Arrays.sort(shapes);
        System.out.println(Arrays.toString(shapes));
    }
}
