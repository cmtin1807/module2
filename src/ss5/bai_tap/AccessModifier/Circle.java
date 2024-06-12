package ss5.bai_tap.AccessModifier;

import org.w3c.dom.ls.LSOutput;

public class Circle {
    private double radius = 1;
    private String color = "red";
    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius= " + radius + ", color= " + color + ", Area= "+ getArea() + "}";
    }
}
