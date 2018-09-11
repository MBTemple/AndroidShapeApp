package app0;

public class Triangle extends Shape {

    public Triangle(String name) {
        super(name);
    }

    @Override
    public String getName() {
        System.out.println("Name of shape is: " + super.getName());
        return super.getName();
    }

    double sideLength1;
    double sideLength2;
    double sideLength3;

    public void setDimensions(double sideLengthSet1, double sideLengthSet2, double sideLengthSet3) {

        this.sideLength1 = sideLengthSet1;
        this.sideLength2 = sideLengthSet2;
        this.sideLength3 = sideLengthSet3;
    }

    @Override
    public void printDimensions() {
        System.out.println("Length of side 1 is: " + sideLength1
                + "\nLength of side 2 is: " + sideLength2
                + "\nLength of side 3 is: " + sideLength3);
    }

    @Override
    public double getArea() {
        double perim = sideLength1 + sideLength2 + sideLength3;
        double s = perim * (0.5);
        double area = Math.sqrt(s * (s - sideLength1) * (s - sideLength2) * (s - sideLength3));
        System.out.println("Area is: " + area);
        return area;
    }
}
