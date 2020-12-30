package CircleTask;

import java.text.DecimalFormat;

public class Circle {

    public double radius, diameter, circumference, area;

    public Circle(double radius) { // to set our information
        this.radius = radius;
    }

    public String toString() { //to print our information, we don't have to call every single time' it comes automatically
        return  "\nradius=" + radius +
                "\n====================================";
    }

    public double calculateDiameter(){
        diameter = 2*radius;
        return diameter;
    }

    public double calculateCircumference(){
        circumference = 2*Math.PI*radius;
        return circumference;
    }

    public double calculateArea(){
        area = Math.PI*Math.pow(radius,2); //Math.pow(radius,2) = radius*radius;
        return area;
    }

    public boolean equals(Circle circle){
        return this.radius == circle.radius;
    }
}

// comment

/*
Circle:
    radius
    PI
    diameter
    area
    circumference
    methods:
        setInfo
        toString
        calculateDiameter, return double
        calculateCircumference, return double
        calculateArea , return double

 */
