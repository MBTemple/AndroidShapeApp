package app0;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(String name) {
        super(name);
    }

    double sideLength;

    public void setDimensions(double sideLengthSet) {
        this.sideLength = sideLengthSet;
    }

    @Override
    public void printDimensions() {
        System.out.println("Length of each side is " + sideLength);
    }

    @Override
    public double getArea() {
        double perim = 3 * sideLength;
        double s = perim * (0.5);
        double area = Math.sqrt(s * (s - sideLength) * (s - sideLength) * (s - sideLength));
        System.out.println("Area is: " + area);
        return area;
    }
}
