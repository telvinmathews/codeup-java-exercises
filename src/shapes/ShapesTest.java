package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4,5);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());
        Rectangle box2 = new Rectangle(5, 5);
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());
        Square square = new Square(4);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
    }
}
