package soal1;

public class Sphere extends Shape {

    private double radius;
    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return 4 * Math.PI * (getRadius() * getRadius());
    }

    public String toString(){
        return super.toString() + " of radius " + getRadius();
    }

}
