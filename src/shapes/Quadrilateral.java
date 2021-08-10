package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected  double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public abstract double setLength();

    public abstract  double setWidth();

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
