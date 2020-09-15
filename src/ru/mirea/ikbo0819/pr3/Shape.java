package ru.mirea.ikbo0819.pr3;
import java.lang.*;

public abstract class Shape {
    protected String Color;
    protected boolean Filled;
    public Shape() {
        this.Filled = false;
        this.Color = "Red";
    }

    public Shape(String color, boolean filled) {
        Color = color;
        Filled = filled;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public String getColor() {
        return Color;
    }


    public boolean isFilled() {
        return Filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}

