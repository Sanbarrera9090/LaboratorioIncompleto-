package edu.sabana.poob;


public class Circle extends Shape {

    private double radius;
    private double area;
    private int perimeter;

    private static final double PI = 3.1416;


    public Circle() {
        this.radius = 1.0;
    }

    public Circle( double radius, String color) {
        super(color);
        this.radius = radius;
    }
    public Circle(double radius, double area){
        this.area = area;
    }
    public Circle(int perimeter){
        this.perimeter = perimeter;
    }

    public double getDiameter() {
        return 0;
    }
    public Circle(double area){
        this.area = area;
    }

    public double getPerimeter(int perimeter) {
        return perimeter;
    }
    @Override
    public String toString() {
        return String.format("This is a %s with color %s"
                , this.getClass().getSimpleName()
                , this.color == null ? "NONE" : this.color);
    }


}
