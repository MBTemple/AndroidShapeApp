package app0;

import java.util.Scanner;

public class App0 {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        double radiusInput;
        double heightInput;
        double lengthInput;
        double sideLengthInput;
        double sideLength1Input;
        double sideLength2Input;
        double sideLength3Input;

        Circle c = new Circle("Circle");
        Square s = new Square("Square");
        Triangle t = new Triangle("Triangle");
        EquilateralTriangle e = new EquilateralTriangle("Equilateral Triangle");

        System.out.println("Input radius of the circle: ");
        radiusInput = kb.nextDouble();

        System.out.println("\n\nInput length and height of the square: ");
        lengthInput = kb.nextDouble();
        heightInput = kb.nextDouble();

        System.out.println("\n\nInput the three side lengths of the triangle: ");
        sideLength1Input = kb.nextDouble();
        sideLength2Input = kb.nextDouble();
        sideLength3Input = kb.nextDouble();

        System.out.println("\n\nInput the side lengths of the equilateral triangle: ");
        sideLengthInput = kb.nextDouble();

        System.out.println("\n");

        c.getName();
        c.setDimensions(radiusInput);
        c.printDimensions();
        c.getArea();

        System.out.println("\n");

        s.getName();
        s.setDimensions(heightInput, lengthInput);
        s.printDimensions();
        s.getArea();

        System.out.println("\n");

        t.getName();
        t.setDimensions(sideLength1Input, sideLength2Input, sideLength3Input);
        t.printDimensions();
        t.getArea();

        System.out.println("\n");

        e.getName();
        e.setDimensions(sideLengthInput);
        e.printDimensions();
        e.getArea();
    }
}
