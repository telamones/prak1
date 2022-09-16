package ru.mirea.lab1;

import java.util.Scanner;

public class Task7 {
    public static int fact(int n) {
        int factorial = 1;
        for (int i = 1; i < n + 1; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        System.out.print("enter your number: ");
        while (!sc.hasNextInt() || (sc.hasNextInt() && (number = sc.nextInt()) < 1)) {
            System.out.println("you don't enter n>=1, please enter n>=1: ");
            sc.nextLine();
        }
        int factorial = fact(number);
        System.out.println("factorial of your number: " + factorial);
    }
}
