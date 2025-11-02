package soal1;

public class Cylinder extends Shape{
    private double radius, height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public double area() {
        return Math.PI * (getRadius() * getRadius()) * getHeight();
    }

    public String toString() {
        return super.toString() + " of radius " + getRadius() + " and height " + height;
    }

}
