package com.company;

/**
 * Created by Егор on 21.04.2015.
 */
public class Circle extends Figure {
    private double PI=3.1415926535897932384626433832795;
    public Circle(double radius,String color){
        super(radius,color);
    }
    @Override
    public double getArea(){
        return PI*side*side;
    }
    @Override
    public String draw(){
        return "Circle";
    }
    @Override
    public void printResult(){
        System.out.println("Figure: "+draw()+" ; Area: "+getArea()+" square units; Color: "+getColor()+" ; Radius: "+getSide()+" unit.");
    }
}
