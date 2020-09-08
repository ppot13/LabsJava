package ru.mirea.ikbo0819.pr1;

import java.lang.*;

public class Dog {
    private int dogAge;
    private String dogName;

    public Dog(String name, int age) {
        dogAge = age;
        dogName = name;
        // This constructor has one parameter, name.
       // System.out.println("Name chosen is :" + name + "and the age of your dog is: "+ age);
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }

    public String getDogName() {
        return dogName;
    }

    public int getDogAge() {
        return dogAge;
    }

    public int dogTohuman(){
        int result = dogAge * 7;
        return result;
    }

    public void dogInfo(){
        System.out.println("Name chosen for dog: "+ dogName+"\n");
        System.out.println("Age of your dog in dog years: "+dogAge+"\n");
        System.out.println("Your dogs' years to human years is: "+ dogTohuman());
    }
}

