package ru.mirea.ikbo0819.pr2;
import java.lang.*;

public class Ball {

        private double X = 0.0;
        private double Y = 0.0;

        public  Ball(){ }

        public Ball(double x, double y)
        {
            X = x;
            Y = y;
        }

        public double getX(){
            return X;
        }

        public double getY(){
            return Y;
        }

        public void setX(double x){
            X = x;
        }

        public void setY(double y) {
            Y = y;
        }

        public void setXY(double x, double y){
            X = x;
            Y = y;
        }

        public void move(double xDisp, double yDisp){
            X += xDisp;
            Y += yDisp;
        }

        @Override
        public String toString(){
            return "Ball @ (" + X + Y + ")";
        }
    }

