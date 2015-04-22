package com.company;

/**
 * Created by Егор on 21.04.2015.
 */
public class Triangle extends Figure {
    private double side2;
    public Triangle(double side1,double side2, String color){
        super(side1,color);
        this.side2=side2;
    }
    @Override
    public double getArea(){
        return side*side2/2;
    }
    public  double getHypotenuse(){
        return Math.sqrt(Math.pow(side,2)+Math.pow(side2,2));
    }
    @Override
    public String draw(){
        return "Triangle";
    }
    @Override
    public void printResult(){
        System.out.println("Figure: "+draw()+" ; Area: "+getArea()+" square units; Color: "+getColor()+" ; Hypotenuse: "+getHypotenuse()+" unit.");
    }
}
