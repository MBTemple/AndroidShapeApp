package app0;

public class Square extends Shape {

    public Square(String name) {
        super(name);
    }

    @Override
    public String getName() {
        System.out.println("Name of shape is: " + super.getName());
        return super.getName();
    }

    double length;
    double height;

    public void setDimensions(double heightSet, double lengthSet) {
        this.length = lengthSet;
        this.height = heightSet;
    }

    @Override
    public void printDimensions() {
        System.out.println("Length is " + length
                + "\nHeight is " + height);
    }

    @Override
    public double getArea() {
        double area = length * height;
        System.out.println("Area is: " + area);
        return length * height;
    }
}
