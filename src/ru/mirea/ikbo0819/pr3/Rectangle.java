package ru.mirea.ikbo0819.pr3;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle() {}


    public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String сolor, boolean filled){
        this.width = width;
        this.length = length;

    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double side){
        this.length = length;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
    @Override
    public String toString() {

        return "Rectangle{" +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}