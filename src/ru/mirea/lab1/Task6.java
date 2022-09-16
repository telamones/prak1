package ru.mirea.lab1;

public class Task6 {
    public static void main (String[] args) {
        System.out.println("the first 10 terms of the harmonic series:");
        for (float i=1; i<11; i++) {
            float num = (1/i);
            System.out.printf("%.2f; ", num);
        }
    }
}
