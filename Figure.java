package com.company;

/**
 * Created by Егор on 21.04.2015.
 */
public abstract class Figure {
    public String color;
    public double side;
    public Figure(double side, String color){
        this.side=side;
        this.color=color;
    }
    public abstract String draw();
    public abstract double getArea();

    public  double getSide(){

        return side;
    }

    public  String getColor(){
        return color;
    }


    public abstract void printResult();
}
