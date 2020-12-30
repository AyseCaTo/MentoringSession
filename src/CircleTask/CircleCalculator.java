package CircleTask;

import java.text.DecimalFormat;

public class CircleCalculator { // Has A Circle Class


    public static void main(String[] args) {

        Circle circle1 = new Circle(7.6);
        Circle circle2 = new Circle(10.6);
        Circle circle3 = new Circle(16.9);

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);

        System.out.println(circle1.calculateDiameter());
        System.out.println("Second circle's circumference is: " + circle2.calculateCircumference());
        System.out.println("Third object's area is: " + circle3.calculateArea());


    }
}
