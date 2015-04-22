package com.company;

/**
 * Created by Егор on 21.04.2015.
 */
public class Square extends Figure {

    public Square(double side,String color){
        super(side, color);
    }
    @Override
    public double getArea(){
        return side*side;
    }
    @Override
    public String draw(){
        return "Square";
    }
    @Override
    public void printResult(){
        System.out.println("Figure: "+draw()+" ; Area: "+getArea()+" square units; Color: "+getColor()+" ; Side: "+getSide()+" unit.");
    }


}
