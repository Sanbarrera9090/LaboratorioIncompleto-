package edu.sabana.poob;
import static edu.sabana.poob.Rectangle.*;
public class Square extends Rectangle{

    private double side;

    public Square(){

    }
    public Square(String color){
        super(color);
    }
    public Square (double side){
        this.side = side;
    }
    public Square(String color, double side){
        super(color);
        this.side = side;
    }




}
