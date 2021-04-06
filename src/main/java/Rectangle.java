package edu.sabana.poob;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;
    color1 = new color();

    public Rectangle(){

    }
    public Rectangle(String color){
        super(color);
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;

    }
    public Rectangle(double width, double length, String color  ){
        super(color);
        this.width = width;
        this.length = length;

    }
    public double getDiagonal(){
        return 0;
    }
    public double getArea() {
        return 0;
    }
    @Override
    public String toString() {
        return String.format("This is a %s with color %s"
                , this.getClass().getSimpleName()
                , this.color == null ? "NONE" : this.color);
    }

}
