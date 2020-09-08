package ru.mirea.ikbo0819.pr1;

public class DemoBall {
    public static void main(String[] args) {
        Ball a1 =new Ball("Small",5,10);
        Ball a2 =new Ball("Medium",10,20);
        Ball a3 =new Ball("Large",20,40);

        a1.showInfo();
        a2.showInfo();
        a3.showInfo();
    }
}
