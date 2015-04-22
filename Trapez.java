package com.company;

/**
 * Created by Егор on 21.04.2015.
 */
public class Trapez extends Figure {
    private double sideDown;
    private double sideUp;
    public Trapez( double h,double sideUp,double sideDown,String color){
        super(h,color);
        this.sideDown=sideDown;
        this.sideUp=sideUp;
    }
    @Override
    public double getArea(){
        return (side*(sideUp+sideDown))/2;
    }
    public double getHeight(){
        return side;
    }
    @Override
    public String draw(){
        return "Trapez";
    }
    @Override
    public void printResult(){
        System.out.println("Figure: "+draw()+" ; Area: "+getArea()+" square units; Color: "+getColor()+" ; Height: "+getSide()+" unit.");
    }
}
