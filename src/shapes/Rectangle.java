package shapes;

public class Rectangle {
    //member variable
    protected int length;
    protected int width;

    //constructor
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    protected int getArea () {
        return length * length;
    }

    protected int getPerimeter() {
        return (2 * length) + (2 * width);
    }
}
