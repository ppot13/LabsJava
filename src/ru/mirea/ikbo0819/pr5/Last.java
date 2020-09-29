package ru.mirea.ikbo0819.pr5;

public class Last {
    public static void recursion() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.println("Введите числа: ");
        int n = in.nextInt();
        if (n > 0) {
            int m = in.nextInt();
            System.out.println(n);
            if (m > 0) {
                recursion();
            }
        }
    }
    public static void main(String[] args) {
        recursion();
    }
}
