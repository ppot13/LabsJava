package ru.mirea.ikbo0819.pr10;
import ru.mirea.ikbo0819.pr10.Complex;
import ru.mirea.ikbo0819.pr10.ComplexAbstractFactory;
import ru.mirea.ikbo0819.pr10.ConcreteFactory;


public class Main {
    public static void main(String[] args)
    {
        Complex a=new Complex(65,4);
        System.out.println(a);

        ComplexAbstractFactory b = new ConcreteFactory();
        Complex c = b.CreateComplex(545, 365);
        System.out.println(c);

        ConcreteFactory d = new ConcreteFactory();
        Complex f = d.CreateComplex(1, 1);
        System.out.println(f);
    }
}
