package ru.mirea.ikbo0819.pr2;

import java.lang.*;
public class Author {
    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender){
       this.name = name;
       this.gender = gender;
       this.email = email;

        if (this.gender=='m' | this.gender=='f' | this.gender=='u' );
        else {
            System.out.println("Please your gender correctly");
            System.exit(0);
        }

    }


    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
            this.gender = gender;
    }


      public String getName(){
            return name;
      }

    public String getEmail() {
        return email;
    }

     public char getGender() {
        return gender;
         }

    public String toString() {
        return  name + " (" + gender + ") at " + email;
    }


}
