package ru.mirea.ikbo0819.pr3;
import java.math.*;

public class Circle extends Shape{
    protected double radius;
    public Circle(){
        this.Filled = false;
        this.Color = "blue";

    }

    public Circle(double radius){
        this.Filled = false;
        this.Color = "blue";
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.Color = color;
        this.Filled = filled;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;

    }

    @Override
    public double getPerimeter() {

        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Shape: circle, radius: "+this.radius+", color: "+this.Color+", filled: "+this.Filled;

    }
}