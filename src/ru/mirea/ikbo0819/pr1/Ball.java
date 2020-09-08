package ru.mirea.ikbo0819.pr1;

import java.lang.*;

public class Ball {

    private String Size;
    private int Weight;
    private int Diameter;
    //private int Choice;

    public Ball(String size, int weight, int diameter)
    {
        Size = size;
        Weight = weight;
        Diameter = diameter;


    }

    public void setSize(String size) {
        Size = size;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public void setDiameter(int diameter) {
        Diameter = diameter;
    }

    public String getSize()
    {
        return Size;
    }

    public int getWeight() {
        return Weight;
    }

    public int getDiameter() {
        return Diameter;
    }



    public void showInfo(){



            System.out.println("Ball size: " +Size);
            System.out.println("Ball Weight: " +Weight+ " kg");
            System.out.println("Ball Diameter: " +Diameter+ " cm\n");


    }
}

