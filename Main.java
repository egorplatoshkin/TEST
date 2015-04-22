package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random random=new Random();
        String colors[]={"Orange","Blue","Rad","Green","Black","Gray","Yellow"};
        String color;
        int amount=random.nextInt(20);
        while (amount!=0){
            switch(random.nextInt(4)){
                case 0 :
                    int side = random.nextInt(100);
                    color=colors[random.nextInt(colors.length)];
                    Figure Sqr=new Square(side,color);
                    Sqr.printResult();
                    break;
                case 1:
                    int radius=random.nextInt(100);
                    color=colors[random.nextInt(colors.length)];
                    Figure Crcl=new Circle(radius,color);
                    Crcl.printResult();
                    break;
                case 2:
                    int side1=random.nextInt(100);
                    int side2=random.nextInt(100);
                    color=colors[random.nextInt(colors.length)];
                    Figure Trngl= new Triangle(side1,side2,color);
                    Trngl.printResult();
                    break;
                case 3:
                    int h=random.nextInt(100);
                    int sideUP=random.nextInt(100);
                    int sideDown=random.nextInt(100);
                    color=colors[random.nextInt(colors.length)];
                    Figure Trpz= new Trapez(h,sideUP,sideDown,color);
                    Trpz.printResult();
                    break;
            }
            amount--;
        }
    }
}
