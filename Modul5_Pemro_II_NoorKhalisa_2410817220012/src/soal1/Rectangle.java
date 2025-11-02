package soal1;

public class Rectangle extends Shape {

    private double length, width;
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double area() {
        return getLength() * getWidth();
    }

    public String toString() {
        return super.toString() + " of length " + getLength() + " and width " + getWidth();
    }
}
