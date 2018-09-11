package app0;

public class Circle extends Shape {

    public Circle(String name) {
        super(name);
    }

    @Override
    public String getName() {
        System.out.println("Name of shape is: " + super.getName());
        return super.getName();
    }

    double radius;

    public void setDimensions(double radiusSet) {
        this.radius = radiusSet;
    }

    @Override
    public void printDimensions() {
        System.out.println("Radius is " + radius);
    }

    @Override
    public double getArea() {
        double area = Math.PI * (this.radius * this.radius);
        System.out.println("Area is: " + area);
        return area;
    }
}
